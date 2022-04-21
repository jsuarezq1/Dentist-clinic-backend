package com.example.myclinic.controller;

import com.example.myclinic.model.TurnoDTO;
import com.example.myclinic.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RestController
@RequestMapping("/api/turnos")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;

    @PostMapping
    public ResponseEntity<?> crearTurno(@RequestBody TurnoDTO turnoDTO) {
        turnoService.crearTurno(turnoDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public TurnoDTO getTurno(@PathVariable Integer id) {
        return turnoService.leerTurno(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDTO turnoDTO) {
        turnoService.modificarTurno((turnoDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id) {
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok((HttpStatus.OK));
    }

    @GetMapping("/list")
    public Collection<TurnoDTO> getTodosTurno() {
        return turnoService.getTodos();
    }
}
