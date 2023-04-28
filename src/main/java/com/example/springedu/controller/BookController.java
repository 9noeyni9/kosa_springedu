package com.example.springedu.controller;

import com.example.springedu.dao.BookMybatisDAO;
import com.example.springedu.domain.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BookController {
    @Autowired
    BookMybatisDAO dao;

    @RequestMapping(value = "/createBook", method = RequestMethod.GET)
    public String getCreateBook(){
        return "bookCreatePage";
    }

    @RequestMapping(value = "/createbook",method = RequestMethod.POST)
    public ModelAndView insert(BookDTO vo){
        boolean result = dao.insert(vo);
        ModelAndView mav = new ModelAndView();
        if(result){
            mav.addObject("list", vo);
        }
        mav.setViewName("bookCreatePage");
        return mav;
    }

    @GetMapping(value = "/book")
    public String getBook(){
        return "bookPage";
    }

    @RequestMapping(value = "/bookinfo/{button}")
    public ModelAndView book(@PathVariable String button) {
        ModelAndView mav = new ModelAndView();
        List<BookDTO> list = null;
        switch (button) {
            case "b1":
                list = dao.b1();
                break;
            case "b2":
                list = dao.b2();
                break;
            case "b3":
                list = dao.b3();
                break;
            case "b4":
                list = dao.b4();
                break;
            case "b5":
                list = dao.b5();
                break;
            case "b6":
                list = dao.b6("자바");
                break;
            case "b7":
                list = dao.b7("스프링");
                break;
            case "b8":
                list = dao.b8();
                break;

        }
        if(list.size()==0){
            mav.addObject("msg","추출된 값이 없네용");
        }else{
            mav.addObject("result",list);
        }
        mav.setViewName("bookPage");
        return mav;
    }

}
