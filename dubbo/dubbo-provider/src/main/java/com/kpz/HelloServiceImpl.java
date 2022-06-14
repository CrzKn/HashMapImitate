package com.kpz;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Author kpz
 * @Date 2022/6/10 15:25
 * @PackageName:com.kpz
 * @ClassName: HelloServiceImol
 * @Description: TODO  实现接口
 * @Version 1.0
 **/
@Service
@Component
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String s) {
        return "Hello" + s;
    }
}
