package com.happytuk.service.Impl;

import com.happytuk.dao.MailTemplateDao;
import com.happytuk.entity.MailTemplate;
import com.happytuk.service.MailTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MailTemplateServiceImpl implements MailTemplateService {
}
