package com.cos.bog.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
}


// 스프링부트 강좌16강(블로그 프로젝트) -lombok세팅 및 사용해보기 7:38