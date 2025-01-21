package com.example.dslist.controllers;

import com.example.dslist.dto.GameminDTO;
import com.example.dslist.entities.Game;

import com.example.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games") //determinar caminho que vai ser correspondido na API.
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameminDTO> findAll(){
        List<GameminDTO> result = gameService.findAll();
        return result;
    }
}
