package com.craig.pe.ptbackendspring.controller;

import com.craig.pe.ptbackendspring.model.Image;
import com.craig.pe.ptbackendspring.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tape")
@CrossOrigin
public class ImageController {
    @Autowired
    ImageService imageService;

    @GetMapping("/listImage")
    public ResponseEntity<List<Image>> list(){
        List<Image> list=imageService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
