package spring.springcloud_provider_9090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudProvider9090Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProvider9090Application.class, args);
    }
}
