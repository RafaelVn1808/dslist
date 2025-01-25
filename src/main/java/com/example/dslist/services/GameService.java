package com.example.dslist.services;

import com.example.dslist.dto.GameDTO;
import com.example.dslist.dto.GameminDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component //Registrar como um componente do sistema
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }

    @Transactional(readOnly = true)
    public List<GameminDTO> findAll(){
        List <Game> result = gameRepository.findAll();
        List<GameminDTO> dto = result.stream().map(x -> new GameminDTO(x)).toList();
        return dto;
    }
}
