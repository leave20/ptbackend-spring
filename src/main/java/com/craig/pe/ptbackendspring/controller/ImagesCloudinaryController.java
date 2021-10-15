package com.craig.pe.ptbackendspring.controller;


import com.craig.pe.ptbackendspring.dto.Message;
import com.craig.pe.ptbackendspring.service.ImageService;
import com.craig.pe.ptbackendspring.service.ImagesCloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.craig.pe.ptbackendspring.model.Image;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/tape")
@CrossOrigin
public class ImagesCloudinaryController {

    @Autowired
    ImagesCloudinaryService cloudinaryService;

    @Autowired
    ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity<?> upload(
            @RequestParam String description,
            @RequestParam MultipartFile multipartFile) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(multipartFile.getInputStream());
        if (bufferedImage == null) {
            return new ResponseEntity<>(new Message("image no valid"), HttpStatus.BAD_REQUEST);
        }
        Map result = cloudinaryService.upload(multipartFile);
        Image image =
                new Image((String) result.get("original_filename"),
                        (String) result.get("url"),
                        (String) result.get("public_id"),
                        description);
        imageService.save(image);
        return new ResponseEntity<>(new Message("upload image"), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) throws IOException {
        if (!imageService.exists(id)) {
            return new ResponseEntity<>(new Message("no exist"), HttpStatus.NOT_FOUND);
        }
        Image image = imageService.getOne(id).get();
        cloudinaryService.delete(image.getIdImage());
        imageService.delete(id);
        return new ResponseEntity<>(new Message("delete image"), HttpStatus.OK);
    }

}
