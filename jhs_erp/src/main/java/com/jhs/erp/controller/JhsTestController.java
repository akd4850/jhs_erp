package com.jhs.erp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhs.erp.dto.JhsTestDto;

@RestController
@RequestMapping(value = "/test")
public class JhsTestController {
	
	@GetMapping(value = "/jhs/erp")
	public String controllerTest() {
		return JhsTestDto.builder()
						 .username("testname")
						 .description("testdescription")
						 .done(false)
						 .build()
						 .toString();
	}
}