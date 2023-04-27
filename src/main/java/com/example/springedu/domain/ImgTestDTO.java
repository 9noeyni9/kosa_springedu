package com.example.springedu.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ImgTestDTO {
    private int imageId;
    private String uploadName;
    private String location;
    private String storeName;
    private String fileType;
    private int postId;

}
