package com.sprboot.springboot.form.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {
	
	@GetMapping("/form")
	public String form(Model model) {
		return "form";
	}
	
	@PostMapping("/form")
	public String process(Model model, @RequestParam String productid, @RequestParam String productname) {
		// Los atributos se muestran en la vista empleando model
		model.addAttribute("productid", productid);
		model.addAttribute("productname", productname);
				
		return "resultado";
	}
}
