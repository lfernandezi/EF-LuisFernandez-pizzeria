package com.idat.EFLuisFernandezPizzeria.client;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFLuisFernandezPizzeria.model.ClienteMicroServicio;

@FeignClient(name="efluis-cliente", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/v1/cliente/listar")
	public List<ClienteMicroServicio> listarclientemicro();
	

}
