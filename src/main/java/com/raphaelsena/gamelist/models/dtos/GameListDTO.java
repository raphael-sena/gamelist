package com.raphaelsena.gamelist.models.dtos;

import com.raphaelsena.gamelist.models.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {}

    public GameListDTO(GameList obj) {
        id = obj.getId();
        name = obj.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
