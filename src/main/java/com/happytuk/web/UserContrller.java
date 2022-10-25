package com.happytuk.web;

import com.happytuk.entity.GameUser;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserContrller {



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

}

