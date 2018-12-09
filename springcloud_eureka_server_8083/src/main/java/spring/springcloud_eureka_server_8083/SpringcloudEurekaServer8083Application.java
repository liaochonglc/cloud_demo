package spring.springcloud_eureka_server_8083;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8083Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8083Application.class, args);
    }
}
