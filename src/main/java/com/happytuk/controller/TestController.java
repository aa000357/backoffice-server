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

    @RequestMapping(value = "/roleName")
    public Map<String, String> getRoleName() {
        Map<String, String> roleData = new HashMap<>();
        roleData.put("0", "梁謙");
        roleData.put("1", "吳宇丞");
        roleData.put("2", "范姜浩");
        roleData.put("3", "謝雁行");
        roleData.put("4", "商城購買");
        roleData.put("5", "營運團隊");
        roleData.put("6", "系統更新");
        return roleData;
    }

}

