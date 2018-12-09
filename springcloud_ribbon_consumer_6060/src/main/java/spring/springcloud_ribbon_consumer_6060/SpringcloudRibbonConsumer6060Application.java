package spring.springcloud_ribbon_consumer_6060;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import spring.springcloud_ribbon_consumer_6060.ribbon.RibonConfig;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@RibbonClient(name="serverprovider",configuration= RibonConfig.class)
public class SpringcloudRibbonConsumer6060Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRibbonConsumer6060Application.class, args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
