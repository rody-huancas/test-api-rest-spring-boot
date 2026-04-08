package com.lta.cursoapi.model.dao;

import com.lta.cursoapi.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
