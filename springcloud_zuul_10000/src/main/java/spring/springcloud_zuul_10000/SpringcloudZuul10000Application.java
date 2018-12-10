package spring.springcloud_zuul_10000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy//启动路由网关
public class SpringcloudZuul10000Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuul10000Application.class, args);
    }
}
