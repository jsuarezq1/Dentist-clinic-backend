package com.example.myclinic.controller;

import com.example.myclinic.model.OdontologoDTO;
import com.example.myclinic.service.IOdontologoService;
import com.example.myclinic.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/api/odontologo")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO) {
        odontologoService.crearodontologo(odontologoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public OdontologoDTO getOdontologo(@PathVariable Integer id) {
        return odontologoService.leerOdontologo(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarOdontologo(@RequestBody OdontologoDTO odontologoDTO) {
        odontologoService.modificarOdontologo((odontologoDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable Integer id) {
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.ok((HttpStatus.OK));
    }

    @GetMapping("/list")
    public Collection<OdontologoDTO> getTodosOdontologos() {
        return odontologoService.getTodos();
    }
}
