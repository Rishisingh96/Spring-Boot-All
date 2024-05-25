package com.rishi.todo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.*;
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
}
