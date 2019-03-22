package com.springbootjpa.demo.service;

import com.springbootjpa.demo.entity.User;
import com.springbootjpa.demo.vo.ResultVo;

public interface userService {
    ResultVo save(User user);
    ResultVo update(User user);
    ResultVo delete(Integer id);
    ResultVo queryById(Integer id);
    ResultVo queryAll();
    ResultVo queryByPage(int page,int limit);

}
