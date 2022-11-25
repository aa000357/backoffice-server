package com.happytuk.controller;


import com.happytuk.entity.GameUser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final List<GameUser> FAKE_DB_4_GAMEUSER = new ArrayList<>();

    @GetMapping
    public List<GameUser> getUser(){
        return FAKE_DB_4_GAMEUSER;
    }

    @GetMapping("/{page}/{size}")
    public List<GameUser> getUser(@PathVariable("page") int page, @PathVariable("size") int size){
        List<GameUser> output = new ArrayList<>();
        if(FAKE_DB_4_GAMEUSER.size() >= page * size) {
            for(int i = (page - 1) ; i < size ; i++) {
                output.add(FAKE_DB_4_GAMEUSER.get(i));
            }
        }
        return output;
    }

    @GetMapping("/{id}")
    public GameUser getUser(@PathVariable("id") int id) {
        for(int i = 0 ; i < FAKE_DB_4_GAMEUSER.size() ; i++) {
            GameUser user = FAKE_DB_4_GAMEUSER.get(i);
            if(id == user.getGameUserId()) {
                return user;
            }
        }
        return null;
    }

    @PostMapping
    public String saveUser(@RequestBody GameUser newUser){
        GameUser prevUser = null;
        if(FAKE_DB_4_GAMEUSER.size() > 0) {
            prevUser = FAKE_DB_4_GAMEUSER.get(FAKE_DB_4_GAMEUSER.size() - 1);
        }

        int gameUserId = prevUser != null ? prevUser.getGameUserId() + 1 : 1;
        newUser.setGameUserId(gameUserId);
        FAKE_DB_4_GAMEUSER.add(newUser);

        return "ok";
    }

    @PutMapping("/{id}")
    public String editUser(@PathVariable("id") int id, @RequestBody GameUser user) {
        for(int i = 0 ; i < FAKE_DB_4_GAMEUSER.size() ; i++) {
            GameUser oriUser = FAKE_DB_4_GAMEUSER.get(i);
            if(oriUser.getGameUserId() == id) {
                if(user.getBirthday() != null) oriUser.setBirthday(user.getBirthday());
                if(user.getCoin() != null) oriUser.setCoin(user.getCoin());
                if(user.getDiamond() != null) oriUser.setDiamond(user.getDiamond());
                if(user.getExperience() != null) oriUser.setExperience(user.getExperience());
                if(user.getFilename() != null) oriUser.setFilename(user.getFilename());
                if(user.getCafeName() != null) oriUser.setCafeName(user.getCafeName());
                if(user.getFreeDiamond() != null) oriUser.setFreeDiamond(user.getFreeDiamond());
                if(user.getInvitationCode() != null) oriUser.setInvitationCode(user.getInvitationCode());
                if(user.getMaterialContent() != null) oriUser.setMaterialContent(user.getMaterialContent());
                if(user.getNickname() != null) oriUser.setNickname(user.getNickname());
                if(user.getOrderContent() != null) oriUser.setOrderContent(user.getOrderContent());
                return "ok";
            }
        }

        return "ng";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        for(int i = 0 ; i < FAKE_DB_4_GAMEUSER.size() ; i++) {
            GameUser oriUser = FAKE_DB_4_GAMEUSER.get(i);
            if(oriUser.getGameUserId() == id) {
                FAKE_DB_4_GAMEUSER.remove(i);
                return "ok";
            }

        }
        return "ng";
    }


}

