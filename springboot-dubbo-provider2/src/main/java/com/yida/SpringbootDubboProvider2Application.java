package com.yida;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringbootDubboProvider2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProvider2Application.class, args);
        System.out.println("服务提供者2启动完毕！");
	}
}
