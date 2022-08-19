package com.idat.EFLuisFernandezPizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFLuisFernandezPizzeria.client.OpenFeignClient;
import com.idat.EFLuisFernandezPizzeria.model.Pizzeria;
import com.idat.EFLuisFernandezPizzeria.repository.ClientePizzaRepository;
import com.idat.EFLuisFernandezPizzeria.repository.PizzeriaPizzaRepository;
import com.idat.EFLuisFernandezPizzeria.repository.PizzeriaRepository;


@Service
public class PizzeriaServiceImp implements PizzeriaService {
	
	@Autowired
	private OpenFeignClient feignpizza;
	
	
	@Autowired
	private OpenFeignClient feigncliente;
	
	@Autowired
	private ClientePizzaRepository repoclientePizza;
	
	@Autowired
	private PizzeriaPizzaRepository repopizzeriaPizza;
	
	@Autowired 
	PizzeriaRepository pizzeriarepo;


	@Override
	public List<Pizzeria> listar() {
		// TODO Auto-generated method stub
		return pizzeriarepo.findAll();
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		pizzeriarepo.save(pizzeria);
		
	}

}
