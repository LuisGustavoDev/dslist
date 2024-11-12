package com.gustavoluis.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_belonging")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Belonging {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(Game game, GameList list, Integer position) {
        this.id.setGame(game);
        id.setList(list);
        this.position = position;
    }

}
