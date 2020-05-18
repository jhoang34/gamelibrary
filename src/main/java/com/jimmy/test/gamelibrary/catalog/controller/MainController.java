package com.jimmy.test.gamelibrary.catalog.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jimmy.test.gamelibrary.catalog.domain.Game;
import com.jimmy.test.gamelibrary.catalog.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class MainController {

    GameService gameService;

    public MainController(GameService gameService) {

        this.gameService = gameService;
    }

    @GetMapping("/api/games/list")
    public List<Game> getGameList() {

        return gameService.getGames();
    }
}
