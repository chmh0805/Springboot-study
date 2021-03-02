package com.cos.myiocdi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Component(용도 없음), @Configuration(설정 파일), @Service(서비스), @Repository(레파지토리), @Bean

@RestController
public class PostController {

	private final Robot robot;
	
	public PostController(Robot robot) {
		this.robot = robot;
	}

	@GetMapping("/")
	public String home() {
		return "home" + robot.getName();
	}
}
