package com.taraktech.spring_docker_poc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {
	@GetMapping()
	public String handleDocker() {
		return "We are checking docker example...!";
	}
}
