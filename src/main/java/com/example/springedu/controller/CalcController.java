package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
    @RequestMapping("/calccontroller")
    public ModelAndView proc(@RequestParam(value = "firstNum")int firstNum, @RequestParam(value="secondNum")int secondNum, @RequestParam(value = "operator")String operator){
        ModelAndView mav = new ModelAndView();
        mav.addObject("firstNum",firstNum);
        mav.addObject("secondNum",secondNum);
        int result = 0;
        if(operator.equals("divide")) {
            if (secondNum == 0) {
                mav.addObject("error", "나눗셈 연산시 두번째 숫자는 0일 수 없습니다.");
                mav.setViewName("errorPage");
            } else {
                result = firstNum / secondNum;
                mav.setViewName("resultPage");
            }
        }
        else if(operator.equals("plus")){
            result=firstNum + secondNum;
            mav.setViewName("resultPage");
        }
        else if(operator.equals("minus")){
            result=firstNum - secondNum;
            mav.setViewName("resultPage");
        }
        else{
            result=firstNum * secondNum;
            mav.setViewName("resultPage");
        }
        mav.addObject("result",result);
        return mav;
    }}

