package io.github.srhojo.fenix.cloud.gateway.services;


import io.github.srhojo.fenix.cloud.gateway.api.Route;

import java.util.List;

public interface RoutesService {

    void refreshDataBaseRoutes();

    void cleanRoutes();

    Route addNewRoute(Route route);

    Route updateRoute(Route route);

    List<Route> getAllRoutes();

    void deleteRoute(Long id);

}
