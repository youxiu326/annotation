package com.huarui.service;

import com.huarui.aop.LockAnnotation;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

/**
 * Created by lihui on 2019/1/15.
 */
@Component
public class LockService {


        @LockAnnotation
        public String testLock(List<String> list){

            for (String str : list) {
                System.out.println(str);
            }

            return "牛逼";

        }


}

