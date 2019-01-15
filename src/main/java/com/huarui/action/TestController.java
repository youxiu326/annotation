package com.huarui.action;

import com.huarui.aop.LockAnnotation;
import com.huarui.service.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by lihui on 2019/1/15.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private LockService service;

    @RequestMapping("/niubi")
    public String test(){

        String result = service.testLock(Arrays.asList("aaa", "bbb", "ccc"));
        System.out.println(result);

        return "niubi";
    }

}
