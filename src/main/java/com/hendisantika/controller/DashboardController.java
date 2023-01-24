package com.hendisantika.controller;

import com.hendisantika.Service.DisponibiliteService;
import com.hendisantika.Service.EmployerService;
import com.hendisantika.Service.FonctionService;
import com.hendisantika.dto.FonctionCountDTO;
import com.hendisantika.entity.Employer;
import com.hendisantika.entity.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private FonctionService service;
    @Autowired
    private EmployerService empservice;
    @Autowired
    private DisponibiliteService servicee;

    @GetMapping("/")
    public String index(Model model) {

        List<FonctionCountDTO> fonctionCounts = service.getFonctionCounts();
        model.addAttribute("fonctionCounts", fonctionCounts);
        model.addAttribute("getdisponibleemp",empservice.demp());
        model.addAttribute("getindisponibleemp",empservice.indemp());
        model.addAttribute("getfonctioncount",service.fonctioncout());
        List<Employer> listemployers = empservice.listAll();
        model.addAttribute("listemployers", listemployers);
        System.out.println(empservice.demp());
        System.out.println(empservice.indemp());

        return "dashboard";
    }




    @GetMapping("addfonction")
    public String menu(Model model) {




        return "addfonction";
    }
}
