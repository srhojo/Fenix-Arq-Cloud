package io.github.srhojo.fenix.cloud.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.event.EventListener;

@SpringBootApplication
@EnableEurekaClient
public class GatewayApplication {


    private final GatewayApplicationStarted gatewayApplicationStarted;

    @Autowired
    public GatewayApplication(final GatewayApplicationStarted gatewayApplicationStarted) {
        this.gatewayApplicationStarted = gatewayApplicationStarted;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void startUp() {
        gatewayApplicationStarted.init();
    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
