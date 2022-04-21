package com.example.myclinic.service;



import com.example.myclinic.model.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    void crearodontologo(OdontologoDTO odontologoDTO);
    OdontologoDTO leerOdontologo(Integer id);
    void modificarOdontologo(OdontologoDTO OoontologoDTO);
    void eliminarOdontologo(Integer id);
    Set<OdontologoDTO> getTodos();
}
