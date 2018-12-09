package spring.springcloud_provider_9090.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("provider")
public class ProviderController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/hello/{port}")
    public String provider(@PathVariable("port") String message) {
        System.out.println("调用者获得提供者的本地端口"+port);
        return "success";
    }
}
