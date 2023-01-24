package com.hendisantika;

import com.hendisantika.Service.FilesStorageService;
import com.hendisantika.Service.FonctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
import java.io.File;
import java.util.Arrays;

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
