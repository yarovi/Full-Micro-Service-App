package com.yasmani.net.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;


@RestController
@RequestMapping("api/v1/category")
@Setter
@Getter
@RefreshScope
public class CategoryController {

	@Value("${app.testProp}")
	private String testProp;
	@GetMapping("test-prop")
	public String getTestProp() {
		return testProp;
	}
}
