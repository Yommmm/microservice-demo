package io.xiaoyang.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 85374
 * @date
 */
@RefreshScope
@RestController
@RequestMapping("/provider/v1/provider")
public class ProviderController {

    @Value("${xiaoyang.age}")
    private String age;

    @GetMapping
    public String helloNacos() {
        return "hello nacos";
    }

    @GetMapping("/age")
    public String helloConfig() {
        return age;
    }

}
