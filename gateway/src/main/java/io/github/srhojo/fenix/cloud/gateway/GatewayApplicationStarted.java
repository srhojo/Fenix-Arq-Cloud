package io.github.srhojo.fenix.cloud.gateway;

import io.github.srhojo.fenix.cloud.gateway.services.impl.RoutesServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class GatewayApplicationStarted {

    private final RoutesServiceImpl routesService;

    public GatewayApplicationStarted(final RoutesServiceImpl routesService) {
        this.routesService = routesService;
    }

    public void init() {
        routesService.refreshDataBaseRoutes();
    }


}
