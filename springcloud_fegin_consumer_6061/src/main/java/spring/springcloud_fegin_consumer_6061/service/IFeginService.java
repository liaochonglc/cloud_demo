package spring.springcloud_fegin_consumer_6061.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//微服务的名字,后面那个是熔断器的因为fegin自己已经有了,这里切记不能在接口上写requestmapping
@FeignClient(name ="serverprovider",fallback = IFeginServiceImpl.class)
public interface IFeginService {
    @RequestMapping("/provider/hello")
    String provider();
}
