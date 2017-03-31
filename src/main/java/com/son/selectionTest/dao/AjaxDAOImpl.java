
package com.son.selectionTest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.son.selectionTest.vo.CityVO;
import com.son.selectionTest.vo.CountryVO;
import com.son.selectionTest.vo.PeopleVO;

/**
 * <pre>
 * com.son.selectionTest.dao 
 *    |_ AjaxDAOImpl.java
 * 
 * </pre>
 * 
 * @date : 2017. 3. 31. 오후 7:47:36
 * @version :
 * @author : kiost
 */
@Repository
public class AjaxDAOImpl implements AjaxDAO {

	@Autowired
	SqlSession session;

	@Override
	public List<CountryVO> getInit() {
		return session.selectList("triple.init");
	}

	@Override
	public List<CityVO> getCities(String country) {
		return session.selectList("triple.first", country);
	}

	@Override
	public List<PeopleVO> getPeopleName(String city) {
		return session.selectList("triple.second", city);
	}

	@Override
	public String getPeoplePhone(PeopleVO people) {
		return session.selectOne("triple.third",people);
	}

}
