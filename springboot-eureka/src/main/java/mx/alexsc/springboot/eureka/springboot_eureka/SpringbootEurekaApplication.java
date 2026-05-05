package mx.alexsc.springboot.eureka.springboot_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // Convertimos la aplicacion en un servidor
public class SpringbootEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaApplication.class, args);
	}

}
