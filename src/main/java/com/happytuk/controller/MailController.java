package com.happytuk.controller;

import com.happytuk.entity.MailTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class MailController {

    private static List<MailTemplate> fakeDb = new ArrayList<>();


    @PostMapping(value = "/mailtemplate")
    public String saveMailTemplate(@RequestBody MailTemplate mailTemplate) {
        fakeDb.add(mailTemplate);
        return "ok";
    }

    @GetMapping(value = "/mailtemplate1")
    public MailTemplate getA() {

//        for (int i = 0 ; i < fakeDb.size() : i++)
//        {
//            fakeDb.get(i).getMailType()
//        }

        return fakeDb.size() > 0 ? fakeDb.get(0) : null;
    }

    @GetMapping(value = "/mailtemplate")
    public String getMailTemplate() {
        Optional<MailTemplate> mailTemplate = null;
        System.out.println(mailTemplate.toString());
        return mailTemplate.toString();
    }

    @GetMapping(value = "/allmailtemplate")
    public List<MailTemplate> getMailTemplateList() {
        List<MailTemplate> templateList = null;
        Integer count = templateList.size();
        System.out.println("count : " + count);

        return templateList;
    }

    @PutMapping(value = "setmailtemplate")
    public String setMailTemplate(){


        return "xxx";
    }

}
