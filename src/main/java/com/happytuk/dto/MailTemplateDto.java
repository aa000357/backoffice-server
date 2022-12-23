package com.happytuk.dto;

import lombok.Data;

@Data
public class MailTemplateDto {

    String describe;
    private String users;
    private String sender;
    private String mailName;
    private String mailNote;
    private String sendTime;
    private String expiredTime;


}
