package com.happytuk.controller;

import com.happytuk.dao.MailTemplateDao;
import com.happytuk.dto.MailTemplateDto;
import com.happytuk.entity.MailTemplate;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail")
public class MailController {

    private static List<MailTemplate> CoffeeDb = new ArrayList<>();


    @Autowired
    private MailTemplateDao mailTemplateDao;
    private MailTemplateDto mailTemplateDto;


    @PostMapping(value = "/newmailtemplate")
    public String saveMailTemplate(@RequestBody MailTemplateDto mailTemplateDto) {
        MailTemplate newTemplate = new MailTemplate();

        System.out.println("send time : " + mailTemplateDto.getSendTime() );

        newTemplate.setSender(mailTemplateDto.getSender());
        newTemplate.setMailName(mailTemplateDto.getMailName());
        newTemplate.setMailNote(mailTemplateDto.getMailNote());

        return "ok";
    }



//    @GetMapping(value = "/mailtemplate1")
//    public MailTemplate getA() {
//
//        return CoffeeDb.size() > 0 ? CoffeeDb.get(0) : null;
//    }

    @GetMapping(value = "/mailtemplate")
    public String getMailTemplate() {
        Optional<MailTemplate> mailTemplate = mailTemplateDao.findById(899);
        System.out.println(mailTemplate.toString());
        return mailTemplate.toString();
    }

    @GetMapping(value = "/allmailtemplate")
    public List<MailTemplateDto> getMailTemplateList() throws JSONException {


        List<MailTemplate> templateList = mailTemplateDao.findAll();
        List<MailTemplateDto> rTemplateList = new ArrayList<>();

        System.out.println(templateList);
        Integer count = templateList.size();

        for(int i = 0 ; i < count ; i++){

            String fCreatedTime = dateToString(templateList.get(i).getCreatedTime());
            String fSendTime = dateToString(templateList.get(i).getSendTime());
            String fExpireTime = dateToString(templateList.get(i).getExpiredTime());

//            JSON
            MailTemplateDto dto = new MailTemplateDto();
            dto.setUsers( "USER");
            dto.setSender("SENDER");
            dto.setMailName( templateList.get(i).getMailName());
            dto.setMailNote( templateList.get(i).getMailNote());
            dto.setCreatedTime(fCreatedTime);
            dto.setSendTime(fSendTime);
            dto.setExpiredTime(fExpireTime);
            rTemplateList.add(dto);
        }


        System.out.println("count : " + count);
        System.out.println("rTemplateList : " + rTemplateList);

        return rTemplateList;
    }

    @PostMapping(value = "/mailtemp") //???????????????
    public List<MailTemplate> allmailtemp(){ //??????html?????????????????????

        List<MailTemplate> templateList = mailTemplateDao.findAll(); //???????????????mailTemplateDao??????

//        ModelAndView mav = new ModelAndView("mail-list"); //??????????????? mail-listhtml        mav.addObject(templateList);

        List<MailTemplate> templateList2 = mailTemplateDao.findByMailType(3);
        System.out.println(templateList2);

        return templateList2; //?????????show?????????
    }

    public static String dateToString(Date time){
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
        String ctime = formatter.format(time);

        return ctime;
    }

}
