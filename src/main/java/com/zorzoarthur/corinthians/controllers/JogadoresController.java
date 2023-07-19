package com.zorzoarthur.corinthians.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zorzoarthur.corinthians.dto.JogadoresDTO;
import com.zorzoarthur.corinthians.services.JogadoresService;

@RestController
@RequestMapping(value = "/jogadores")
public class JogadoresController {

    @Autowired
    private JogadoresService jogadoresService;

    @GetMapping
    public List<JogadoresDTO> findAll() {
        List<JogadoresDTO> result = jogadoresService.findAll();

        return result;
    }

    @GetMapping(value = "/{id}")
    public JogadoresDTO findById(@PathVariable Long id) {
        JogadoresDTO jogadorDTO = jogadoresService.findById(id);
        return jogadorDTO;
    }
}
