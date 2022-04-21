package com.example.myclinic.service;


import com.example.myclinic.model.TurnoDTO;

import java.util.Set;

public interface ITurnoService {
    void crearTurno(TurnoDTO turnoDTO);
    TurnoDTO leerTurno(Integer id);
    void modificarTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Integer id);
    Set<TurnoDTO> getTodos();
}
