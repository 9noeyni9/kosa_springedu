package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.springedu.domain.CountDTO;
@Controller 
@SessionAttributes({"count1", "count2"})
public class CountController {
	@ModelAttribute("count1")
	public CountDTO countMethod1() {
		System.out.println("countMethod1 호출");
		return new CountDTO();
	}
	@ModelAttribute("count2")
	public CountDTO countMethod2() {
		System.out.println("countMethod2 호출");		
		return new CountDTO();
	}	
	@RequestMapping(value="/count") 
	public void handle(@ModelAttribute("count1") CountDTO vo1,
					   @ModelAttribute("count2") CountDTO vo2, int num1, int num2) {
		vo1.setCountNum(num1);
		vo2.setCountNum(num2);
		System.out.println("handle() : "+ 
			      vo1.getCountNum() + " : " + vo2.getCountNum());
		System.out.println("=============================");
	}
	@RequestMapping(value="/countdel")
	public void handle(SessionStatus s) {/*리턴값이 void 그럼 view는 뭐가 되남 : requestmapping시 사용된 이름 countdel*/
		s.setComplete();/*들어있는 데이터 다 삭제 원하는 애만 삭제 가능한가? 없다 ㅠ*/
		System.out.println("Both count1 and count2 deleted!");	
		System.out.println("=============================");
	}	
}



