package com.example.springedu.domain;

import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;
import lombok.Getter;
import lombok.Setter;
@Getter
@AllArgsConstructor
public class FileVO2 {
	private MultipartFile[] uploadFiles;/*다중 파일 업로드 가능 대신 업로드한 갯수 반복문 돌리는 거 필수*/
}
