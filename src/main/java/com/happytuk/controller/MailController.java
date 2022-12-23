package com.happytuk.controller;

import com.happytuk.dao.ExcelMailSenderDao;
import com.happytuk.dao.MailTemplateDao;
import com.happytuk.dto.MailTemplateDto;
import com.happytuk.entity.ExcelMailSender;
import com.happytuk.entity.MailTemplate;
import com.happytuk.entity.UserMail;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class MailController {

    private static List<MailTemplate> fakeDb = new ArrayList<>();

    @Autowired
    private MailTemplateDao mailTemplateDao;
    private MailTemplateDto mailTemplateDto;


    @PostMapping(value = "/mailtemplate")
    public String saveMailTemplate(@RequestBody MailTemplateDto mailTemplateDto) {
        MailTemplate newTemplate = new MailTemplate();

//        mailTemplateDto.getSendTime();
        System.out.println("send time : " + mailTemplateDto.getSendTime() );

        newTemplate.setSender(mailTemplateDto.getSender());
        newTemplate.setMailName(mailTemplateDto.getMailName());
        newTemplate.setMailNote(mailTemplateDto.getMailNote());
//        newTemplate.setSendTime(mailTemplateDto.getSendTime());

//        newTemplate.setSender(mailTemplate.getSender());
//        newTemplate.setMailName(mailTemplate.getMailName());
//        newTemplate.setMailNote(mailTemplate.getMailNote());
//        newTemplate.setSendTime(mailTemplate.getSendTime());
//        newTemplate.setExpiredTime(mailTemplate.getExpiredTime());
//        newTemplate.setCreatedTime(mailTemplate.getCreatedTime());
//        newTemplate.setUpdatedTime(mailTemplate.getUpdatedTime());

//        mailTemplateDao.setMailId();

        return "ok";
    }



    @GetMapping(value = "/mailtemplate1")
    public MailTemplate getA() {

        return fakeDb.size() > 0 ? fakeDb.get(0) : null;
    }

    @GetMapping(value = "/mailtemplate")
    public String getMailTemplate() {
        Optional<MailTemplate> mailTemplate = mailTemplateDao.findById(899);
        System.out.println(mailTemplate.toString());
        return mailTemplate.toString();
    }

    @GetMapping(value = "/allmailtemplate")
    public List<MailTemplate> getMailTemplateList() {
        List<MailTemplate> templateList = mailTemplateDao.findAll();
        Integer count = templateList.size();
        System.out.println("count : " + count);

        return templateList;
    }

    @PostMapping(value = "/mailtemp") //要打的網址
    public List<MailTemplate> allmailtemp(){ //傳到html畫面的資料型態

        List<MailTemplate> templateList = mailTemplateDao.findAll(); //取得資料庫mailTemplateDao資料

//        ModelAndView mav = new ModelAndView("mail-list"); //顯示的畫面 mail-listhtml        mav.addObject(templateList);

        List<MailTemplate> templateList2 = mailTemplateDao.findByMailType(3);
        System.out.println(templateList2);

        return templateList2; //畫面上show的內容
    }

}
