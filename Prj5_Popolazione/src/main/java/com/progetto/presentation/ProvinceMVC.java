package com.progetto.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progetto.entities.Provincia;
import com.progetto.services.ProvinciaService;

@Controller
public class ProvinceMVC {
	
	// in static si mettono tutte le risorse, css, js immagini e via dicendo

	@Autowired
	private ProvinciaService service;
	
	@GetMapping("")
	public String home() {
		return "home";
	}
	@GetMapping("regioni")
	public String regioni(Model m) {
		m.addAttribute("regioni", service.getRegioni());
		return "regioni";
	}
	
	@GetMapping("eta")
	public String eta() {
		return "eta";
	}
	
}
