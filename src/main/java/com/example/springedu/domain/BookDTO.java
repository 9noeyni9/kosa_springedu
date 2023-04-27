package com.example.springedu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BookDTO {
    private int id;
    private String title;
    private  int price;
    private String kind;
}
