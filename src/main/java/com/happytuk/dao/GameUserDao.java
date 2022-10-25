package com.happytuk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameUserDao extends JpaRepository<GameUserDao, String> {


}
