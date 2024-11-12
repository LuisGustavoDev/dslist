package com.gustavoluis.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class BelongingPK {
    
    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

}
