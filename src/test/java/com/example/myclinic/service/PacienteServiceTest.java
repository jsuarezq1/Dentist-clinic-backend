package com.example.myclinic.service;

import static org.junit.jupiter.api.Assertions.*;
import com.example.myclinic.model.PacienteDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PacienteServiceTest {

    @Autowired
    private IPacienteService pacienteService;

    @Test
    public void testCrearPaciente() {

        PacienteDTO pacienteDTO = new PacienteDTO();
        pacienteDTO.setNombre("Jorge");
        pacienteDTO.setApellido("Suarez");
        pacienteService.crearPaciente(pacienteDTO);

        PacienteDTO paciente1 = pacienteService.leerPaciente(1);

        assertNotNull(pacienteService.getTodos() != null);
    }

}