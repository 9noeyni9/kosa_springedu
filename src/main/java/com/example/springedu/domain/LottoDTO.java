package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LottoDTO {
    private int lottoNum;/*클라이언트한테 전달되는 매개변수, 보관되어 있는 */
    private String result;
    private String imgName;
}
