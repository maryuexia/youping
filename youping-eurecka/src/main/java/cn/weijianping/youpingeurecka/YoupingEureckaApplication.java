package cn.weijianping.youpingeurecka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YoupingEureckaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YoupingEureckaApplication.class, args);
    }

}
