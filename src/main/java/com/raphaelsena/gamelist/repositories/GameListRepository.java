package com.raphaelsena.gamelist.repositories;

import com.raphaelsena.gamelist.models.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
