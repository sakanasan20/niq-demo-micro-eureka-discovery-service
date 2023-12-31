package tw.niq.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NiqDemoMicroEurekaDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NiqDemoMicroEurekaDiscoveryServiceApplication.class, args);
	}

}
