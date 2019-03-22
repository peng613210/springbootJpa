package com.springbootjpa.demo.utils;

import com.springbootjpa.demo.vo.PageVo;
import com.springbootjpa.demo.vo.ResultVo;

import java.util.List;

public class ResultUtils {
    public static ResultVo exec(int count,Object obj){
        ResultVo resultVo = new ResultVo();
        if (count>0){
            resultVo.setCode(1);
            resultVo.setMsg("操作成功");
            resultVo.setData(obj);
        }else {
            resultVo.setCode(1001);
            resultVo.setMsg("操作失败");
        }
        return  resultVo;
    }

    public static ResultVo execOK(){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        return resultVo;
    }
    public static ResultVo execOK(Object obj){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(1);
        resultVo.setMsg("OK");
        return resultVo;
    }

    public static<T> PageVo<T> execPage(int page, int size, int count, List<T> data){
        PageVo<T> pageVo= new PageVo<>();
        pageVo.setData(data);
        pageVo.setCurrent(page);
        pageVo.setSize(size);
        pageVo.setCount(count);
        return pageVo;
    }

}
