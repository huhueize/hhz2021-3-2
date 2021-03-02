package com.example.demo.conteoller;


import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "swagger测试接口",tags = "swagger测试接口")
public class HelloWorldController {
    private Logger log= LoggerFactory.getLogger(HelloWorldController.class);
    @GetMapping("index1")
    public String index1(){
        log.info("Hello6WorldController-index-用于测试info日志");
        log.debug("Hello6WorldController-index-用于测试debug日志");
        log.error("Hello6WorldController-index-用于测试error日志");
        return "Hello Spring boot";
    }



//    @Value("${avatarPath}")
//    private String name;
//    @GetMapping("index")
//    public String index(){
//        return name;
//    }
}
