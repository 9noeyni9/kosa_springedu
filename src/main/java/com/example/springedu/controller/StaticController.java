package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;
@Controller
public class StaticController {	
	public StaticController() {
		System.out.println("HelloController Create object");
	}
	@RequestMapping("/static")
	public ModelAndView xxx(){
		InternalResourceView view = new InternalResourceView("/staticview.html");
		ModelAndView viewModel = new ModelAndView(view);
		return viewModel;
	}	
}/*기능을 지원하는 view객체 직접 생성해서 주면 되는데 InternalResourceView 정적자원에는 이미지도 포함*/




