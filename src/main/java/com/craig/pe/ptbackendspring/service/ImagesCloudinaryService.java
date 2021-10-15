package com.craig.pe.ptbackendspring.service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class ImagesCloudinaryService {

    Cloudinary cloudinary;

    private Map<String, String> valueMap = new HashMap<>();

    public ImagesCloudinaryService() {
        valueMap.put("cloud_name", "dw5m5idyj");
        valueMap.put("api_key", "993221987142769");
        valueMap.put("api_secret", "SCtCAYTOrm8VjkHnVzsvyCQUvQw");
        cloudinary = new Cloudinary(valueMap);


    }

    public Map upload(MultipartFile multipartFile) throws IOException {
        File file = convert(multipartFile);
        Map result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
        file.delete();
        return result;
    }

    public Map delete(String id) throws IOException {
        Map result = cloudinary.uploader().destroy(id, ObjectUtils.emptyMap());
        return result;
    }

    private File convert(MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(multipartFile.getBytes());
        fileOutputStream.close();
        return file;
    }
}
