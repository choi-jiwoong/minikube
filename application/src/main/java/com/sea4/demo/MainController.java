package com.sea4.demo;

import com.sea4.demo.entity.Demo;
import com.sea4.demo.infrastructure.DemoRepository;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

	private final DemoRepository demoRepository;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/health")
	public String health(HttpServletResponse response) {
		response.addHeader("Custom-Header", "Awesome");
		return "health";
	}



	@PostMapping("/register")
	public String register() {
		demoRepository.save(Demo.builder().name("sea4").text("text").build());
		return "register";
	}
}
