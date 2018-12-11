package spring.springcloud_provider_9090.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
//事务总线获得最新的数据进行实时刷新
@RefreshScope
public class ProviderController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello")
    public String provider() {
        System.out.println("调用者获得提供者的本地端口"+port);
        return port+"--success";
    }
}
