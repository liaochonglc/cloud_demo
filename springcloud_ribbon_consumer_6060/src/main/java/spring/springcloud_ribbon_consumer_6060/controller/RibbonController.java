package spring.springcloud_ribbon_consumer_6060.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/consumer")
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String consumer() {
        String result = restTemplate.getForObject("http://serverprovider/provider/hello/zahngsan", String.class);
        return result;
    }
}
