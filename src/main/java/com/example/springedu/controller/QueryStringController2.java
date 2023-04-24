package com.example.springedu.controller;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.springedu.domain.QueryDTO;
@Controller
public class QueryStringController2 {	
	@RequestMapping("/querystring5")/*요청 방식 부여 안 하면 둘 다 가능*/
	public ModelAndView proc(QueryDTO vo) {  // 컨멘드 객체 /*스프링은 DTO,VO 자동으로 보관해줌*/
		ModelAndView mav = new ModelAndView();
		String name = vo.getTestName();
		int age = vo.getTestAge();
		String addr = vo.getTestAddr();
		mav.addObject("spring", name + "-" + age + "-" + addr);
		mav.setViewName("queryView2");
		return mav;
	}	
	@RequestMapping(value = "/querystring6", 
			                      method = RequestMethod.POST)/*post요청만 가능*/
	public ModelAndView procPost(QueryDTO vo) {
		ModelAndView mav = new ModelAndView();
		String name = vo.getTestName();
		int age = vo.getTestAge();
		String addr = vo.getTestAddr();
		mav.addObject("spring", name + "@" + age + "@" + addr);
		mav.setViewName("queryView2");
		return mav;
	}
	@RequestMapping("/querystring7")/*전달 안 받고 직접*/
	public ModelAndView proc(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String name =request.getParameter("testName");
		int age = Integer.parseInt(request.getParameter("testAge"));
		String addr = request.getParameter("testAddr");
		mav.addObject("spring", name + "#" + age + "#" + addr);
		mav.setViewName("queryView2");
		return mav;
	}
	@RequestMapping(value="/locale/mine")
	public ModelAndView proc(Locale l) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", "Processing locale ............"+
		       l.getDisplayCountry()+"_"+l.getDisplayLanguage());/*클라이언트가 요청을 보낼 때 정보가 같이 가는데 그 나라 정보 등을 그에 알맞은 locale객체를 만들어 보냄*/
		mav.setViewName("queryView2");
		return mav;
	}
}