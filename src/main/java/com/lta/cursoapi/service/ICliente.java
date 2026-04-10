package com.lta.cursoapi.service;

import com.lta.cursoapi.model.dto.ClienteDto;
import com.lta.cursoapi.model.entity.Cliente;

public interface ICliente {

    Cliente save(ClienteDto cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}
