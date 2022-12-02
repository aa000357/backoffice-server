package com.happytuk.controller;

import com.happytuk.dao.GameUserDao;
import com.happytuk.entity.GameUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class TestController {

    @RequestMapping(value = "/senders")
    public List<String> getSenders() {
        List<String> senderList = new ArrayList<>();
        senderList.add("梁謙");
        senderList.add("吳宇丞");
        senderList.add("范姜浩");
        senderList.add("謝雁行");
        senderList.add("商城購買");
        senderList.add("營運團隊");
        senderList.add("系統更新");
        senderList.add("Wendy");
        return senderList;
    }

}

