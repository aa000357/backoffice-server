package com.happytuk.controller;

import com.happytuk.dao.ExcelsItemTypeDao;
import com.happytuk.entity.ExcelItemsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ExcelsItemsTypeController {



    @GetMapping(value = "/list")
    public List<ExcelItemsType> getItemList() {
        List<ExcelItemsType> itemsList = new ArrayList<>();
        Integer count = itemsList.size();
        System.out.println("items count : " +count);

        return itemsList;
    }



}
