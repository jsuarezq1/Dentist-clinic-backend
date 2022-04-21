package com.example.myclinic.controller;

import com.example.myclinic.model.DomicilioDTO;
import com.example.myclinic.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/domicilio")
public class DomicilioController {
    @Autowired
    IDomicilioService domicilioService;

    @PostMapping
    public ResponseEntity<?> crearDomicilio(@RequestBody DomicilioDTO domicilioDTO) {
        domicilioService.crearDomicilio((domicilioDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public DomicilioDTO getDomicilio(@PathVariable Integer id) {
        return domicilioService.leerDomicilio(id);
    }

    @PutMapping
    public ResponseEntity<?> modificarDomicilio(@RequestBody DomicilioDTO domicilioDTO) {
        domicilioService.modificarDomicilio((domicilioDTO));
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDomicilio(@PathVariable Integer id) {
        domicilioService.eliminarDomicilio(id);
        return ResponseEntity.ok((HttpStatus.OK));
    }

    @GetMapping("/list")
    public Collection<DomicilioDTO> getTodosDomicilio() {
        return domicilioService.getTodos();
    }
}
