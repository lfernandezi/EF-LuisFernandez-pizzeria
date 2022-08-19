package com.idat.EFLuisFernandezPizzeria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import com.idat.EFLuisFernandezPizzeria.model.PizzaMicroServicio;

@FeignClient(name="efluis-pizza", url="localhost:8081")
public interface OpenFeignPizza {
	
	@GetMapping("/v1/pizza/listar")
	public List<PizzaMicroServicio> listarclientemicro();
	

}
