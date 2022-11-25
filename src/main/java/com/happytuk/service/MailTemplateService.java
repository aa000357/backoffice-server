package com.happytuk.service;

import com.happytuk.entity.MailTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MailTemplateService {


    public List<MailTemplate> findAll();

}
