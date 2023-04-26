package com.example.springedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudyPathController {
    @RequestMapping(value = "/study/{number}/thymeleaf")
    public String getPath(@PathVariable("number") int number){


        String url = null;
        if(number == 1){
            url="https://abbo.tistory.com/56";
        }else if(number == 2){
           url="https://abbo.tistory.com/57";
        }else if(number == 3){
            url="https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html";
        }else{
            url="https://www.baeldung.com/dates-in-thymeleaf";
        }

        return "redirect:"+url;

    }
}
