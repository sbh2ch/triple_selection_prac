package com.son.selectionTest;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.son.selectionTest.svc.AjaxService;

@Controller
public class HomeController {

	@Autowired
	private AjaxService ajaxService;

	@RequestMapping(value = "/select.kosc", method = RequestMethod.GET)
	public String home(Model model) {

		return "home";
	}

	@RequestMapping("/init_ajax")
	public void initAjax(HttpServletResponse res) {
		try {
			res.getWriter().print(ajaxService.getInit());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/first_ajax")
	public void first(HttpServletRequest req, HttpServletResponse res, Model model) {
		model.addAttribute("req", req);

		try {
			res.getWriter().print(ajaxService.getFirstSelection(model));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/second_ajax")
	public void second(HttpServletResponse res, HttpServletRequest req, Model model) {
		model.addAttribute("req", req);

		try {
			res.getWriter().print(ajaxService.getSecondSelection(model));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/third_ajax")
	public void third(HttpServletRequest req, HttpServletResponse res, Model model) {
		model.addAttribute("req", req);

		try {
			res.getWriter().print(ajaxService.getThirdSelection(model));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
