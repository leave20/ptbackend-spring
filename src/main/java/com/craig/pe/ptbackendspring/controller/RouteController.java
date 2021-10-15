package com.craig.pe.ptbackendspring.controller;

import com.craig.pe.ptbackendspring.dto.Message;

import com.craig.pe.ptbackendspring.model.Route;
import com.craig.pe.ptbackendspring.service.ImageService;
import com.craig.pe.ptbackendspring.service.ImagesCloudinaryService;
import com.craig.pe.ptbackendspring.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;


@RestController
@RequestMapping("/tape")
@CrossOrigin
public class RouteController {

//    @Autowired
//    ImagesCloudinaryService cloudinaryService;
//
//    @Autowired
//    ImageService imageService;
//
//    @Autowired
//    RouteService routeService;
//
//    @GetMapping("/listRoute")
//    public ResponseEntity<List<Route>> list() {
//        List<Route> list = routeService.list();
//        return new ResponseEntity<>(list, HttpStatus.OK);
//    }
//
//    @PostMapping("/save/route")
//    public ResponseEntity<?> create(@RequestBody Route route) {
//        routeService.saveRoute(route);
//        return new ResponseEntity<>(new Message("upload image"), HttpStatus.OK);
//
//    }
}
