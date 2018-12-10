package spring.springcloud_fegin_consumer_6061.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//微服务的名字
@FeignClient(name ="serverprovider")
@RequestMapping("provider")
public interface IFeginService {
    @RequestMapping("/hello")
    String provider(String message);
}
