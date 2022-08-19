package com.idat.EFLuisFernandezPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFLuisFernandezPizzeria.model.ClientePizza;

@Repository
public interface ClientePizzaRepository extends JpaRepository<ClientePizza, Integer>{

}
