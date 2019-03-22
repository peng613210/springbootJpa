package com.springbootjpa.demo.dao;

import com.springbootjpa.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userDao extends JpaRepository<User,Integer> {
}
