package com.happytuk.dao;

import com.happytuk.entity.UserMail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMailDao extends JpaRepository<UserMail, Integer> {
}
