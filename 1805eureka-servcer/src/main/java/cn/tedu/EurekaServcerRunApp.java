package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServcerRunApp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServcerRunApp.class, args);

	}

}
