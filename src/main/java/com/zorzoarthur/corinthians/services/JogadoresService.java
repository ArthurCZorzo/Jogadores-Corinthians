package com.zorzoarthur.corinthians.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zorzoarthur.corinthians.entities.Jogadores;
import com.zorzoarthur.corinthians.dto.JogadoresDTO;
import com.zorzoarthur.corinthians.repositories.JogadoresRepository;

@Service
public class JogadoresService {

    @Autowired
    private JogadoresRepository jogadoresRepository;

    public List<JogadoresDTO> findAll(){
        List<Jogadores> result = jogadoresRepository.findAll();
        List<JogadoresDTO> dto = result.stream().map(x -> new JogadoresDTO(x)).toList();
        return dto;
    }
}
