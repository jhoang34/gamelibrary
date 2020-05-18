package com.jimmy.test.gamelibrary.catalog.repository;

import com.jimmy.test.gamelibrary.catalog.domain.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> {
}
