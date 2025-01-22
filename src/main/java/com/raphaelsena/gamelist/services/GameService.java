package com.raphaelsena.gamelist.services;

import com.raphaelsena.gamelist.models.Game;
import com.raphaelsena.gamelist.models.dtos.GameMinDTO;
import com.raphaelsena.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> getAllGames() {
        List<Game> result = gameRepository.findAll();
        return result.stream()
                .map(x -> new GameMinDTO(x))
                .toList();
    }
}
