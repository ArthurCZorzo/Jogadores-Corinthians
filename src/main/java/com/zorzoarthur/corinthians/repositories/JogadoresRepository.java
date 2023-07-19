package com.zorzoarthur.corinthians.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zorzoarthur.corinthians.entities.Jogadores;

public interface JogadoresRepository extends JpaRepository<Jogadores, Long> {
    
}
