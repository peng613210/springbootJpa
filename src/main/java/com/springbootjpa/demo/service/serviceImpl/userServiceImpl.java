package com.springbootjpa.demo.service.serviceImpl;

import com.springbootjpa.demo.dao.userDao;
import com.springbootjpa.demo.entity.User;
import com.springbootjpa.demo.service.userService;
import com.springbootjpa.demo.utils.ResultUtils;
import com.springbootjpa.demo.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    @Autowired
    private userDao userDao;

    @Override
    public ResultVo save(User user) {
        return ResultUtils.exec(userDao.save(user)!=null?1:0,user);
    }

    @Override
    public ResultVo update(User user) {
        return ResultUtils.exec(userDao.save(user)!=null?1:0,user);
    }

    @Override
    public ResultVo delete(Integer id) {
        userDao.deleteById(id);
        return ResultUtils.execOK();
    }

    @Override
    public ResultVo queryById(Integer id) {
        return ResultUtils.execOK(userDao.findById(id));
    }

    @Override
    public ResultVo queryAll() {
        return ResultUtils.execOK(userDao.findAll());
    }

    @Override
    public ResultVo queryByPage(int page, int limit) {
        return null;
    }
}
