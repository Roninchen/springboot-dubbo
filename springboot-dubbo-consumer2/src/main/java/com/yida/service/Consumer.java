package com.yida.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {

    // 使用兼容注入，可以使用dubbo原生注解@Reference注入
    @Reference(version = "1.0.0")
    public ProviderService service;

    @Reference(version = "2.0.0")
    public NumService numService;

    @GetMapping(value = "/hello/{name}")
    public String hello(@PathVariable String name){
        return service.sayHello(name);
    }

    @GetMapping(value = "/{num}")
    public Integer num(@PathVariable Integer num){
        return numService.sum(num);
    }
}
