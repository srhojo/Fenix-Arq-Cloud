package io.github.srhojo.fenix.cloud.gateway.dao.impl;

import io.github.srhojo.fenix.cloud.gateway.dao.RoutesDao;
import io.github.srhojo.fenix.cloud.gateway.dao.entities.RouteEntity;
import io.github.srhojo.fenix.cloud.gateway.dao.repositories.RoutesRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RoutesDaoImpl implements RoutesDao {

    private final RoutesRepository repository;

    public RoutesDaoImpl(final RoutesRepository repository) {
        this.repository = repository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteEntity save(final RouteEntity route) {
        return repository.save(route);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(final Long id) {
        final RouteEntity r = repository.findById(id).orElseThrow(()-> new RuntimeException(String.format("Entity {%s} not found",id)));
        repository.delete(r);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<RouteEntity> getAll() {
        return repository.findAll();
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public boolean exist(final Long id) {
        return repository.existsById(id);
    }
}
