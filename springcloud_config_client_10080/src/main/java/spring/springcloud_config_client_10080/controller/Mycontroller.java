package spring.springcloud_config_client_10080.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//bootstrap.yml和application.yml的区别,bootstrap.yml是系统级别的配置文件,appli.yml是用户级别的配置文件,前者先于后者加载
@RestController
@RefreshScope
public class Mycontroller {
    @Value("${com.name}")
    private String name;

    @RequestMapping("/test")
    public String test() {
        return name;
    }
}
