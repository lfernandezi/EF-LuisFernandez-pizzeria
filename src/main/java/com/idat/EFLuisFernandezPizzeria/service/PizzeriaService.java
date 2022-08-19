package com.idat.EFLuisFernandezPizzeria.service;

import java.util.List;

import com.idat.EFLuisFernandezPizzeria.model.Pizzeria;


public interface PizzeriaService {

	public List<Pizzeria> listar();
	
	public void guardar(Pizzeria pizzeria);
	
	

}
