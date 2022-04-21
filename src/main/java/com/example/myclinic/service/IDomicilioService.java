package com.example.myclinic.service;

import com.example.myclinic.model.DomicilioDTO;

import java.util.Set;

public interface IDomicilioService {

    void crearDomicilio(DomicilioDTO domicilioDTO);
    DomicilioDTO leerDomicilio(Integer id);
    void modificarDomicilio(DomicilioDTO domicilioDTO);
    void eliminarDomicilio(Integer id);
    Set<DomicilioDTO> getTodos();
}
