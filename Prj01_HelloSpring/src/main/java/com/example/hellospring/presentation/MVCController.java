package com.example.hellospring.presentation;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.model.Model;

public class MVCController {
	
	List<String> nani= List.of("pisolo", "eolo", "mammolo", "gongolo","pippalo");
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "homepage";
	}
	@GetMapping("/api/")
	@ResponseBody
	public String api() {
		return "pagina api";
		
	}
	
	@GetMapping("/nani/{id}")
	public String apiById(@PathVariable int id, Model m) {
		System.out.println("nano:"+ nani.get(id));
		m.addAttribute("nano", nani.get(id));
		
		return "nani";
		
	}
	

}
