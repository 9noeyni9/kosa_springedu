package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EduController  {
    @RequestMapping(value = "/educontroller",method = RequestMethod.POST)
    public ModelAndView proc(@RequestParam(value = "name")String name,@RequestParam(value="avgScore")int avg){
        ModelAndView mav = new ModelAndView();
        mav.addObject("name",name);
        
        if(avg>=90){
            mav.addObject("grade","A");
            mav.setViewName("gradeA");
        } else if (avg>=80) {
            mav.addObject("grade","B");
            mav.setViewName("gradeB");
        } else if (avg>=70) {
            mav.addObject("grade","C");
            mav.setViewName("gradeC");
        }else{
            mav.addObject("grade","D");
            mav.setViewName("gradeD");
        }
        return mav;
    }

}
