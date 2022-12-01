package com.happytuk.dao;

import com.happytuk.entity.MailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;
import java.util.List;

@Repository
public interface MailTemplateDao extends JpaRepository<MailTemplate, Integer> {


    public List<MailTemplate> findAll();

//    public List<MailTemplate> findByCreatedTime();

    public List<MailTemplate> findByMailType(Integer mailType);

}
