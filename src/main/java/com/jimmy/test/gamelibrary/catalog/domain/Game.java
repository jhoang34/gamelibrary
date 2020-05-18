package com.jimmy.test.gamelibrary.catalog.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Getter
@Setter
@Table(name = "game")
public class Game {

    @Id @GeneratedValue
    private long id;
    private String title;
    private String category;
    private String platform;

    private Game() {}

    public Game(Long id, String title, String category, String platform) {

        this.id = id;
        this.title = title;
        this.category = category;
        this.platform = platform;
    }

}
