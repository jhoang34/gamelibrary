package com.jimmy.test.gamelibrary.catalog.service;

import com.jimmy.test.gamelibrary.catalog.domain.Game;
import com.jimmy.test.gamelibrary.catalog.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class GameService {

    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {

        this.gameRepository = gameRepository;
    }

    public List<Game> getGames() {

        List<Game> games = new ArrayList<>();
        Iterable<Game> it =  gameRepository.findAll();
        it.forEach(games::add);


        return games;
    }
}
