package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter/*setter가 필요없으면 VO*/
public class QueryDTO {
	private String testName;
	private int testAge;
	private String testAddr;	
}
