package com.example.dslist.services;

import com.example.dslist.dto.GameminDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //Registrar como um componente do sistema
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameminDTO> findAll(){
        List <Game> result = gameRepository.findAll();
        List<GameminDTO> dto = result.stream().map(x -> new GameminDTO(x)).toList();
        return dto;
    }
}
