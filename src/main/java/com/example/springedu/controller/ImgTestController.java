package com.example.springedu.controller;

import com.example.springedu.domain.ImgTestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@Controller
public class ImgTestController {

    @RequestMapping("/testImg")
    public ModelAndView saveTest(ImgTestDTO vo,MultipartFile mreq){
        ModelAndView mav = new ModelAndView();

        String path = "c:/images/";//파일 저장 위치

//        String fileName = mreq.getOriginalFilename();

        vo.setUploadName(mreq.getOriginalFilename());

//        vo.setFileType(mreq.getContentType());

        File isDir = new File(path);

        if(!isDir.isDirectory()){
            isDir.mkdirs();
        }


//        String safeFile = path + originFileName;
//
//        try {
//            mf.transferTo(new File(safeFile));
//        } catch (IllegalStateException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

//        String src = path + fileName;


        return mav;
    }


}
