package com.raphaelsena.gamelist.controllers;

import com.raphaelsena.gamelist.models.dtos.GameListDTO;
import com.raphaelsena.gamelist.models.dtos.GameMinDTO;
import com.raphaelsena.gamelist.services.GameListService;
import com.raphaelsena.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> getAllGameLists() {
        return gameListService.getAllGames();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
