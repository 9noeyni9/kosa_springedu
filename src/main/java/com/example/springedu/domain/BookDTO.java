package com.example.springedu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookDTO {
    private Integer id;
    private String title;
    private  int price;
    private String kind;

    @Override
    public String toString() {
        return "제목 : " + title +"가격 : " + price + "분류" +convertKind(kind);
    }

    private String convertKind(String kind) {
        System.out.printf(kind);
        if (kind.equals("b01")) {
            return "프로그래밍언어";
        } else if (kind.equals("b02")) {
            return "웹 프로그래밍";
        } else if (kind.equals("b03")) {
            return "빅데이터";

        } else if (kind.equals("b04")) {

            return "데이터 베이스";
        } else if (kind.equals("b05")) {


            return  "인프라";
        }

        return null;
    }
    
}
