package com.happytuk.controller;

import com.happytuk.entity.GameUser;
import com.happytuk.entity.MailTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class MailController {

    private static final List<MailTemplate> FAKE_DB_4_MAIL = new ArrayList<>();

    @GetMapping
    public List<MailTemplate> getMail(){
        return FAKE_DB_4_MAIL;
    }

    @GetMapping("/{page}/{size}")
    public List<MailTemplate> getMail(@PathVariable("page") int page, @PathVariable("size") int size){
        List<MailTemplate> output = new ArrayList<>();
        if(FAKE_DB_4_MAIL.size() >= page * size) {
            for(int i = (page - 1) ; i < size ; i++) {
                output.add(FAKE_DB_4_MAIL.get(i));
            }
        }
        return output;
    }

    @GetMapping("/{id}")
    public MailTemplate getMail(@PathVariable("id") int id) {
        for(int i = 0 ; i < FAKE_DB_4_MAIL.size() ; i++) {
            MailTemplate mail = FAKE_DB_4_MAIL.get(i);
            if(id == mail.getMailId()) {
                return mail;
            }
        }
        return null;
    }

    @PostMapping
    public String saveMail(@RequestBody MailTemplate newMail){
        MailTemplate prevMail = null;
        if(FAKE_DB_4_MAIL.size() > 0) {
            prevMail = FAKE_DB_4_MAIL.get(FAKE_DB_4_MAIL.size() - 1);
        }

        Date date = new Date();
        int mailId = prevMail != null ? prevMail.getMailId() + 1 : 1;
        newMail.setMailId(mailId);
        newMail.setCreatedTime(date);
        newMail.setUpdatedTime(date);
        FAKE_DB_4_MAIL.add(newMail);

        return "ok";
    }

}
