package com.craig.pe.ptbackendspring.respository;

import com.craig.pe.ptbackendspring.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    List<Image> findByOrderById();
}
