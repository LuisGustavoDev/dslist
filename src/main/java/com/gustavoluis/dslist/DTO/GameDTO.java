package com.gustavoluis.dslist.DTO;

import org.springframework.beans.BeanUtils;

import com.gustavoluis.dslist.entities.Game;

public record GameDTO(
    Long id,
    String title,
    Integer year,
    String genre,
    String platforms,
    String imgUrl,
    String shortDescription,
    String longDescription,
    Double score) {
        
        public GameDTO(Game entity) {
            this(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getGenre(),
                entity.getPlatforms(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getLongDescription(),
                entity.getScore()
            );
    }
}
