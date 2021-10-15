package com.craig.pe.ptbackendspring.respository;

import com.craig.pe.ptbackendspring.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> {

    List<Route> findByOrderById();
}
