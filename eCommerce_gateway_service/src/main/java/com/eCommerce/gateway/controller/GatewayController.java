package com.eCommerce.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

	
	

	@GetMapping("/api/")
	public String getName() {
		return "Gateway";
	}

}
