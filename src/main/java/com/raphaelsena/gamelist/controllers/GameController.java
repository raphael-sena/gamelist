package com.raphaelsena.gamelist.controllers;

import com.raphaelsena.gamelist.models.Game;
import com.raphaelsena.gamelist.models.dtos.GameDTO;
import com.raphaelsena.gamelist.models.dtos.GameMinDTO;
import com.raphaelsena.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public GameDTO getGameById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}
