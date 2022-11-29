package com.happytuk.dao;

import com.happytuk.entity.MailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MailTemplateDao extends JpaRepository<MailTemplate, Integer> {
    public List<MailTemplate> findAll();
}
