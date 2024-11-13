package com.gustavoluis.dslist.DTO;

import com.gustavoluis.dslist.entities.GameList;

public record GameListDTO (Long id,String name) {
    
    public GameListDTO(GameList entity) {
        this(entity.getId(), entity.getName());
    }
}
