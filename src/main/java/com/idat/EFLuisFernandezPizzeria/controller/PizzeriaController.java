package com.idat.EFLuisFernandezPizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EFLuisFernandezPizzeria.model.Pizzeria;
import com.idat.EFLuisFernandezPizzeria.service.PizzeriaService;


@RestController
@RequestMapping("/v1/pizzeria")
public class PizzeriaController {
	

		@Autowired
		private PizzeriaService pizzeriaserv;
		
		@GetMapping("listar")
		public @ResponseBody List<Pizzeria> listar(){
			return pizzeriaserv.listar();
			
		}
		
		@PostMapping("guardar")
		public @ResponseBody void guadar (Pizzeria p) {
			pizzeriaserv.guardar(p);
		}
			

}
