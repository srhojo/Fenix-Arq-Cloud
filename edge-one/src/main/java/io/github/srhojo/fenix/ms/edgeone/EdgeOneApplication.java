package io.github.srhojo.fenix.ms.edgeone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EdgeOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EdgeOneApplication.class, args);
    }

}
