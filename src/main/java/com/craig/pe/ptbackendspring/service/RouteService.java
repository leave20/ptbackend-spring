package com.craig.pe.ptbackendspring.service;

import com.craig.pe.ptbackendspring.model.Route;
import com.craig.pe.ptbackendspring.respository.ImageRepository;
import com.craig.pe.ptbackendspring.respository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RouteService {

//    @Autowired
//    RouteRepository routeRepository;
//
//    public List<Route> list() {
//        return routeRepository.findByOrderById();
//    }
//
//    public Optional<Route> getOne(int id) {
//        return routeRepository.findById(id);
//    }
//
//    public void saveRoute(Route route) {
//        routeRepository.save(route);
//    }
//
//    public void delete(int id) {
//        routeRepository.deleteById(id);
//    }
//
//    public boolean exists(int id) {
//        return routeRepository.existsById(id);
//    }
//
}
