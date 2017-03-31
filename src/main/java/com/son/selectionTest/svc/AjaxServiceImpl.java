
package com.son.selectionTest.svc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.google.gson.Gson;
import com.son.selectionTest.dao.AjaxDAO;
import com.son.selectionTest.vo.CityVO;
import com.son.selectionTest.vo.CountryVO;
import com.son.selectionTest.vo.PeopleVO;

/**
 * <pre>
 * com.son.selectionTest.svc 
 *    |_ AjaxServiceImpl.java
 * 
 * </pre>
 * 
 * @date : 2017. 3. 31. 오후 7:42:53
 * @version :
 * @author : kiost
 */
@Service
public class AjaxServiceImpl implements AjaxService {

	@Autowired
	private AjaxDAO ajaxDao;

	@Override
	public String getInit() {
		List<CountryVO> list = ajaxDao.getInit();
		return new Gson().toJson(list);
	}

	@Override
	public String getFirstSelection(Model model) {
		HttpServletRequest req = (HttpServletRequest) model.asMap().get("req");
		List<CityVO> list = ajaxDao.getCities(req.getParameter("country"));
		return new Gson().toJson(list);
	}

	@Override
	public String getSecondSelection(Model model) {
		HttpServletRequest req = (HttpServletRequest) model.asMap().get("req");
		List<PeopleVO> list = ajaxDao.getPeopleName(req.getParameter("city"));
		return new Gson().toJson(list);
	}

	@Override
	public String getThirdSelection(Model model) {
		HttpServletRequest req = (HttpServletRequest) model.asMap().get("req");

		return ajaxDao.getPeoplePhone(new PeopleVO(req.getParameter("name"), req.getParameter("city")));
	}

}
