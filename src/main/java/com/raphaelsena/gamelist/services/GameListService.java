package com.raphaelsena.gamelist.services;

import com.raphaelsena.gamelist.models.GameList;
import com.raphaelsena.gamelist.models.dtos.GameListDTO;
import com.raphaelsena.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> getAllGames() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream()
                .map(GameListDTO::new)
                .toList();
    }
}
