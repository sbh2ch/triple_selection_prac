
package com.son.selectionTest.dao;

import java.util.List;

import com.son.selectionTest.vo.CityVO;
import com.son.selectionTest.vo.CountryVO;
import com.son.selectionTest.vo.PeopleVO;

/**
 * com.son.selectionTest.dao |_ AjaxDAO.java
 * 
 * @date : 2017. 3. 31. 오후 7:29:29
 * @version :
 * @author : kiost
 */
public interface AjaxDAO {
	public List<CountryVO> getInit();
	
	public List<CityVO> getCities(String country);

	public List<PeopleVO> getPeopleName(String city);

	public String getPeoplePhone(PeopleVO people);

}
