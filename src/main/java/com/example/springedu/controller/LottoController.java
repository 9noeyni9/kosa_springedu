package com.example.springedu.controller;


import com.example.springedu.domain.LottoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LottoController {
    @ModelAttribute(value = "lottoNum")
    public LottoDTO lottoDTO() {
        return new LottoDTO();
    }

    @RequestMapping("/lotto")
    public String select(@ModelAttribute(value = "lotto") LottoDTO vo, Model model, HttpSession s, int lottoNum) {

        int resultNum = (int) (Math.random() * 6) + 1;

        if (s.getAttribute("tryCount") == null) {
            s.setAttribute("tryCount", 1);
        }

        int count = (int) (s.getAttribute("tryCount"));
        if (count < 4) {
            if (resultNum == vo.getLottoNum()) {
                vo.setImgName("sun.png");
                System.out.println(vo.getImgName());
                vo.setResult("추카추카!!");
            } else {
                vo.setImgName("rain.png");
                System.out.println(vo.getImgName());
                vo.setResult("아쉽네요.. 다음 기회에..");
                model.addAttribute("msg", "msg");
            }
            s.setAttribute("tryCount", count + 1);
            System.out.println(s.getAttribute("tryCount"));
        } else {
            vo.setImgName("snow.png");
            vo.setResult("로또 응모는 낙첨된 경우에 한하여 3번까지만 가능합니다.브라우저를 재기동한 후에 응모해 주세요.");
        }
        return "lottoView";
    }
}
