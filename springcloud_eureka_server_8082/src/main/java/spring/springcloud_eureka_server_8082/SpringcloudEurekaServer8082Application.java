package spring.springcloud_eureka_server_8082;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 添加springcloud组件规律
 * 添加maven依赖
 * 消息启动类加注解
 * 配置yml
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServer8082Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServer8082Application.class, args);
    }
}
