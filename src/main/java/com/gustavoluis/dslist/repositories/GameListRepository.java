package com.gustavoluis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gustavoluis.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

   
}
