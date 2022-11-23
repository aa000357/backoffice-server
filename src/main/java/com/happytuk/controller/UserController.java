package com.happytuk.controller;


import com.happytuk.entity.GameUser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final List<GameUser> FAKE_DB_4_GAMEUSER = new ArrayList<>();

    static {
        String[] name = {"梁謙", "吳宇丞", "范姜浩", "謝雁行", "獨沽九件"};
        for(int i = 0 ; i < name.length ; i++) {
            GameUser user = new GameUser();
            user.setGameUserId(1);
            user.setNickname("梁謙");
            user.setCafeName("悠閒咖啡廳");
            user.setFilename("File");
            user.setInvitationCode("SUPER888");
            user.setExperience((int)(Math.random() * 1000 - 50 + 3));
            user.setCoin((int)(Math.random() * 10000 - 70 + 1003));
            user.setDiamond(0);
            user.setFreeDiamond(1000);
            user.setBirthday(null);
            user.setMaterialContent(1);
            user.setOrderContent(2);
            FAKE_DB_4_GAMEUSER.add(user);
        }
    }

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

