package com.gustavoluis.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavoluis.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}