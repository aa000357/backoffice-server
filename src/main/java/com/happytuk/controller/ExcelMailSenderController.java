package com.happytuk.controller;

import com.happytuk.dao.ExcelMailSenderDao;
import com.happytuk.entity.ExcelMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ExcelMailSenderController {

    @Autowired
    private ExcelMailSenderDao excelMailSenderDao;

    @GetMapping(value = "/sender")
        public List<ExcelMailSender> mailSenders(){

            List<ExcelMailSender> senders = excelMailSenderDao.findAll();
            System.out.println("senders : " + senders);

            return senders;
    }











}
