package com.idat.EFLuisFernandezPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFLuisFernandezPizzeria.model.PizzeriaPizza;

@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<PizzeriaPizza, Integer>{

}
