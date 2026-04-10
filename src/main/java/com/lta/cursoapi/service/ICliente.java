package com.lta.cursoapi.service;

import com.lta.cursoapi.model.entity.Cliente;

public interface ICliente {

    Cliente save(Cliente cliente);

    Cliente findById(Integer id);

    void delete(Cliente cliente);
}
