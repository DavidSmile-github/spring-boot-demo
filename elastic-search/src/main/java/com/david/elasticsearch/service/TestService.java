package com.david.elasticsearch.service;

import com.david.domain.es.EsGame;
import com.david.elasticsearch.dao.es.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @version 1.0
 * @author: HongBo﹒Liu
 * @date: 2020/1/21 16:02
 */
@Service
public class TestService {

    @Autowired
    private GameRepository gameRepository;
    public String getGames() {
        Optional<EsGame> gameOption = gameRepository.findById(1232L);
        return gameOption.get().toString();
    }
}
