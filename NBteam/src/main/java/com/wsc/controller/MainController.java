package com.wsc.controller;

import com.wsc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: WangSuChen
 * @Date: 2018/11/4 22:41
 * @Description:
 */

@Controller
@RequestMapping(value = "/abc")
public class MainController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTest(){
        return  "test";
    }

    @RequestMapping(value = "/springtest", method = RequestMethod.GET)
    public String springTest(){
        return testService.test();
    }


}
