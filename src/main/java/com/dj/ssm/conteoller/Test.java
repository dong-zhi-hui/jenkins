package com.dj.ssm.conteoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName Test
 * @Author: Dongzh
 * @Date: 2020/11/3 23:32
 */
@Controller
@RequestMapping("/user/")
public class Test {

    @RequestMapping("toTest")
    public String toTest(){
        return "test/test";

    }
}
