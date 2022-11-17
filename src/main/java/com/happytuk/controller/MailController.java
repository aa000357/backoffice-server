package com.happytuk.controller;

import com.happytuk.dao.MailTemplateDao;
import com.happytuk.entity.MailTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailTemplateDao mailTemplateDao;

    @RequestMapping(value = "/getMailTemplate")
    public String getMailTemplate() {
        Optional<MailTemplate> mailDraft = mailTemplateDao.findById(900);
        System.out.println(mailDraft.toString());
        return mailDraft.toString();
    }

    @RequestMapping(value = "/getMailTemplateList")
    public List<MailTemplate> getMailTemplateList() {
        List<MailTemplate> templateList = mailTemplateDao.findAll();
        Integer count = templateList.size();
        System.out.println("count : " + count);

        return templateList;
    }

}
