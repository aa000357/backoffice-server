package com.happytuk.controller;

import com.happytuk.dao.GameUserDao;
import com.happytuk.entity.GameUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private GameUserDao gameUserDao;

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable("id") String id) {
        return "{\"id\":\"" + id + "\", \"name\":\" wendy\"}";
    }

    @RequestMapping("/")
    public String hello() {
        GameUser gameUser = new GameUser();

        gameUser.getGameUserId();
        gameUser.getNickname();
        gameUser.getFilename();
        gameUser.getInvitationCode();
        gameUser.getExperience();
        gameUser.getCoin();
        gameUser.getDiamond();
        gameUser.getFreeDiamond();
        gameUser.getBirthday();

        System.out.println(gameUser.toString());

        return gameUser.toString();
    }
    @RequestMapping(value = "/getGameUser")
    public String getGameUser() {
        Optional<GameUser> gameUser = gameUserDao.findById(70);
        System.out.println(gameUser.toString());

        return gameUser.toString();
    }

}

