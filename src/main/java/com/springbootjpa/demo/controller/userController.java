package com.springbootjpa.demo.controller;

import com.springbootjpa.demo.entity.User;
import com.springbootjpa.demo.service.userService;
import com.springbootjpa.demo.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {
    @Autowired
    private userService userService;

    @ApiOperation(value = "新增",notes = "新增")
    @GetMapping("userSave.do")
    public ResultVo save(User user){
        return  userService.save(user);
    }

    @ApiOperation(value = "修改",notes = "修改")
    @PutMapping("userUpdate.do")
    public ResultVo update(User user){
        return  userService.update(user);
    }

    @ApiOperation(value = "删除",notes = "删除")
    @DeleteMapping("userDetele.do")
    public ResultVo delete(Integer id){
        return  userService.delete(id);
    }

    @ApiOperation(value = "查找全部",notes = "查找全部")
    @GetMapping("findAll.do")
    public ResultVo get(){
        return  userService.queryAll();
    }

    @ApiOperation(value = "查找单个",notes = "查找单个")
    @GetMapping("findById.do")
    public ResultVo get(Integer id){
        return  userService.queryById(id);
    }












}
