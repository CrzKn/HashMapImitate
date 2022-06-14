package com.example.dubboconsumer.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kpz.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author kpz
 * @Date 2022/6/10 15:35
 * @PackageName:com.example.dubboconsumer.test
 * @ClassName: HelloController
 * @Description: TODO 调用远程服务
 * @Version 1.0
 **/
@ResponseBody
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String Hello(){
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("kpz"));
        return hello;
    }
}
