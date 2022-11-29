package com.happytuk.controller;

import com.happytuk.dao.MailTemplateDao;
import com.happytuk.entity.MailTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class MailController {

    private static List<MailTemplate> fakeDb = new ArrayList<>();

    @Autowired
    private MailTemplateDao mailTemplateDao;


    @PostMapping(value = "/mailtemplate")
    public String saveMailTemplate(@RequestBody MailTemplate mailTemplate) {
        fakeDb.add(mailTemplate);
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
        System.out.println(templateList);

        return templateList; //畫面上show的內容
    }


    @PutMapping(value = "setmailtemplate")
    @ResponseBody
    public String setMailTemplate(){


        return "xxx";
    }

}
