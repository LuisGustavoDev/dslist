package com.gustavoluis.dslist.DTO;

import com.gustavoluis.dslist.entities.Game;
public record GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
 
    public GameMinDTO(Game entity) {
        this(entity.getId(), entity.getTitle(), entity.getYear(), entity.getImgUrl(), entity.getShortDescription());
    }
}