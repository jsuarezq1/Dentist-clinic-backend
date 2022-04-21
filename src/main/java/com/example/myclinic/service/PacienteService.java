package com.example.myclinic.service;

import com.example.myclinic.model.Paciente;
import com.example.myclinic.model.PacienteDTO;
import com.example.myclinic.repository.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public PacienteDTO leerPaciente(Integer id) {
        Optional<Paciente> paciente = pacienteRepository.findById(id);
        PacienteDTO pacienteDTO = null;
        if(paciente.isPresent())
            pacienteDTO = mapper.convertValue(paciente, PacienteDTO.class);
        return pacienteDTO;
    }

    private void guardarPaciente(PacienteDTO pacienteDTO) {
        Paciente paciente = mapper.convertValue(pacienteDTO, Paciente.class);
        pacienteRepository.save(paciente);
    }

    @Override
    public void modificarPaciente(PacienteDTO pacienteDTO) {
        guardarPaciente(pacienteDTO);
    }

    @Override
    public void eliminarPaciente(Integer id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public Set<PacienteDTO> getTodos() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDTO> pacientesDTO = new HashSet<>();
        for (Paciente paciente :  pacientes) {
            pacientesDTO.add(mapper.convertValue(paciente, PacienteDTO.class));
        }
        return pacientesDTO;
    }
}
