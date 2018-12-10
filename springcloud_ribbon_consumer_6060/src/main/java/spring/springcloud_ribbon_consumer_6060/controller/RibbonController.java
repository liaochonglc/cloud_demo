package spring.springcloud_ribbon_consumer_6060.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/consumer")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    //进行熔断处理
    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String consumer() {
        String result = restTemplate.getForObject("http://serverprovider/provider/hello", String.class);
        return result;
    }

    //服务降级必须和上面的返回值String以及参数保持一致
    public String fallbackMethod() {
        return "服务有问题";
    }
}
