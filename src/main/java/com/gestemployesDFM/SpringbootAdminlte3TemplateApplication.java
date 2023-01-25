package com.gestemployesDFM;

import com.gestemployesDFM.Service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import javax.annotation.Resource;


@SpringBootApplication

public class SpringbootAdminlte3TemplateApplication implements CommandLineRunner {



    @Resource
    FilesStorageService storageService;


    public static void main(String[] args) {

        SpringApplication.run(SpringbootAdminlte3TemplateApplication.class, args);


    }

    @Override
    public void run(String... arg) throws Exception {
//    storageService.deleteAll();
        storageService.init();
    }


}
