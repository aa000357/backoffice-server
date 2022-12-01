package com.happytuk.controller;

import com.happytuk.dao.ExcelsItemTypeDao;
import com.happytuk.entity.ExcelItemsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class ExcelsItemsTypeController {

    @Autowired
    private ExcelsItemTypeDao excelsItemTypeDao;

    @GetMapping(value = "/list")
    public List<ExcelItemsType> getItemList() {
        List<ExcelItemsType> itemsList = excelsItemTypeDao.findAll();
        Integer count = itemsList.size();
        System.out.println("items count : " +count);

        return itemsList;
    }

    @GetMapping(value = "/itemname")
    public String itemType(){
        Optional<ExcelItemsType> itemName = excelsItemTypeDao.findById(100);
        System.out.println("itemName : " + itemName);

        return itemName.toString();
    }



}
