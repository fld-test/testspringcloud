package com.test.testspringcloudcousumer.impl;

import com.test.testspringcloudcousumer.mapper.FallBackApi;
import org.springframework.stereotype.Component;

@Component
public class FallBackApiImpl implements FallBackApi {

    @Override
    public String getMsgFallback() {
        return "Sorry! 8083端口服务出现问题，已做熔断处理";
    }
}
