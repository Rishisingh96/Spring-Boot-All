package com.rishi.todo.controllers;

import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


@RestController
@RequestMapping("/file")
public class FileController {


    Logger logger = LoggerFactory.getLogger(FileController.class);
    Logger logger1 = LoggerFactory.getLogger(FileController.class);

    @PostMapping("/single")
    public String uploadSingle(@RequestParam("image")MultipartFile file) throws IOException {
        logger.info("Name : {}",file.getName());
        logger.info("ContentType : {}",file.getContentType());
        logger.info("Original File Name : {}",file.getOriginalFilename());
        logger.info("File Size : {}",file.getSize());
        //file.getInputStream()
//        InputStream inputStream =file.getInputStream();
//        FileOutputStream fileOutputStream = new FileOutputStream("data.png");
//        byte data[] = new byte[inputStream.available()];
//
        // ofter using following way error occoure when pass long size image

        return "File Test";
    }
    @PostMapping("/multiple")
    public String uploadMultiple(@RequestParam("files") MultipartFile[] files){
        Arrays.stream(files).forEach(file -> {
            logger1.info("File Name {}",file.getOriginalFilename());
            logger1.info("File Type {}",file.getContentType());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        });
        return "Handling multiple files";
    }

    //serving image files in reponse
    @GetMapping("/serve-image")
    public void serveImageHandler(HttpServletResponse response){
        //image file download
        try{
            InputStream fileInput = new FileInputStream("images/spring.jpg");
            response.setContentType(MediaType.IMAGE_JPEG_VALUE);
            StreamUtils.copy(fileInput , response.getOutputStream());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
