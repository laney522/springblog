package com.cos.bog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML파일)
//@Controller

// 사용자가 요청 -> 응답(Data)

@RestController
public class HttpControllerTest {

	// https://localhost:8080/http/post (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청"+m.getId()+","+m.getUsername()+","+m.getPassword()+","+m.getEmail();
	}
	
	// https://localhost:8080/http/post (insert)
	@PostMapping("http/post")
	public String postTest() {
		return "post 요청";
	}
	
	// https://localhost:8080/http/put (update)
	@PutMapping("http/put")
	public String putTest() {
		return "put 요청";
	}
	
	// https://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
