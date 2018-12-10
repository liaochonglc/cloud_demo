package spring.springcloud_fegin_consumer_6061.service;

import org.springframework.stereotype.Component;

@Component
public class IFeginServiceImpl implements IFeginService{
    //这东西就是熔断方法类似于ribbon的fallback
    @Override
    public String provider() {
        return "fegin的降级方法";
    }
}
