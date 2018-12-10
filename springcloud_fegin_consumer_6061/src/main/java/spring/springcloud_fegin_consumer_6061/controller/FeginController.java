package spring.springcloud_fegin_consumer_6061.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.springcloud_fegin_consumer_6061.service.IFeginService;

import javax.annotation.Resource;


@RestController
@RequestMapping("/consumer")
public class FeginController {
    @Resource
    private IFeginService iFeginService;
    @RequestMapping("/fegin")
    public String hello(){
        return  iFeginService.provider();
    }
}
