package com.javassem.domain;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data   //NoArgsConsturctor , Setter , Getter , ToString을 포함한 모든걸 알아서 생성해준다.
//@Getter @Setter 이렇게 따로따로 써도 가능
public class BoardVO {

	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;



}