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

@Controller
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
	
//	@RequestMapping(value= "/login" , method = RequestMethod.GET)
//	@ResponseBody
//	@GetMapping("/login")
//	public String getloginpage() {
//		ModelAndView modeView = new ModelAndView("loginTwo");
//		return "login";
//	}
	
//	@RequestMapping(value= "/greeting" , method = RequestMethod.GET)
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=true, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
