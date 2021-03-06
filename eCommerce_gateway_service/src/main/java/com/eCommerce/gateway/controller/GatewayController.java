package com.eCommerce.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.gateway.config.CloudConfig;

@RestController
public class GatewayController {

	@Autowired
	CloudConfig cloudConfig;
	
	@Value("${welcome.message}")
	private String welcomeText;
	 

	@GetMapping("/api/")
	public String getName() {
		return cloudConfig.getName();
	}

	
	@GetMapping("/welCome/")
	public String welCome() {
		return welcomeText;
	}

}
