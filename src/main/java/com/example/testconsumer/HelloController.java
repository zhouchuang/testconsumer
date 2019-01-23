package com.example.testconsumer;

import com.alibaba.dubbo.common.json.JSONObject;
import com.example.dubbo.TestService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author:Administrator
 * @create 2019-01-23 16:47
 */
@Controller
public class HelloController {
    @Autowired
    private TestService testService;
    @RequestMapping(value = "/test" ,produces = "application/json;charset=utf-8")
    @ResponseBody
    public String test(){
        return testService.sayHello("zhouchuang");
    }
}
