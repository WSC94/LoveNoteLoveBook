package com.wsc.service.impl;

import com.wsc.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Auther: WangSuChen
 * @Date: 2018/11/4 23:20
 * @Description:
 */

@Service
public class TestServiceImpl implements TestService {
    public String test() {
        return "test";
    }
}
