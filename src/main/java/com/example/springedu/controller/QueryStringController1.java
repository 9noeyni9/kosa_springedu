package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class QueryStringController1 {
	@RequestMapping("/querystring1")
	public ModelAndView proc(String name) {
		ModelAndView mav = new ModelAndView();
		System.out.println("["+name+"]");
		mav.addObject("spring", name);
		mav.setViewName("queryView1");
		return mav;
	}	
	@RequestMapping("/querystring2")
	public ModelAndView proc(int number) {/*int형이니까 꼭 줘야 에러 안 남*/
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", number);
		mav.setViewName("queryView1");/*path 떼고 파일명만*/
		return mav;
	}	
	@RequestMapping("/querystring3")
	public ModelAndView proc(String name, 
			                   @RequestParam("num")int number) {/*@RequestParam :param값을 받는 것(annotation앞에 붙이면 명칭 원하는대로 조정가능 대신 이름까지 줬으면 꼭 값을 줘야 함) */
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", name+":"+number);
		mav.setViewName("queryView1");
		return mav;
	}
	@RequestMapping("/querystring4")
	public ModelAndView proc(
	@RequestParam("myname1") String name1,
	@RequestParam(value="myname2", required=false) String name2,/*RequestParam 네임명을 줬을 때 default는 true인데 지금은 false이므로 값을 꼭 안줘도 돼*/
	@RequestParam(defaultValue="10") int number1, /*defaultValue : 쿼리가 안 오면 defaultValue가 쓰인다는 것*/
	@RequestParam(value="NUM2", defaultValue="100")int number2){
		ModelAndView mav = new ModelAndView();
		mav.addObject("spring", name1+":"+(number1 + number2) 
				+":"+name2);
		mav.setViewName("queryView1");
		return mav;
	}
}
