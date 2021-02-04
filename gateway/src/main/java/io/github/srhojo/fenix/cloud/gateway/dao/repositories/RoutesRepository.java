package io.github.srhojo.fenix.cloud.gateway.dao.repositories;

import io.github.srhojo.fenix.cloud.gateway.dao.entities.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutesRepository extends JpaRepository<RouteEntity, Long> {
}
