package com.happytuk.dao;

import com.happytuk.entity.GameUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface GameUserDao extends JpaRepository<GameUser, Integer> {


}
