package com.raphaelsena.gamelist.repositories;

import com.raphaelsena.gamelist.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
