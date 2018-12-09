package spring.springcloud_ribbon_consumer_6060.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibonConfig {
    @Bean
    public IRule getIRule() {
        return new RandomRule();
    }
}
