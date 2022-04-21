package com.example.myclinic.repository;

import com.example.myclinic.model.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDomicilioRepository extends JpaRepository<Domicilio, Integer> {
}
