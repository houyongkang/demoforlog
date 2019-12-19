package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Date 2019/12/19
 * @Author yongkang.hou
 */
@RestController
public class HelloController {
    private static Logger logger= LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/hello")
    public String hello(){
        logger.info("调用了hello接口");
        logger.error("测试error单独输出");
        return "hello word";
    }

}
