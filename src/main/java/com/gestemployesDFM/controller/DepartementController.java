package com.gestemployesDFM.controller;

import com.gestemployesDFM.Service.DepartementService;
import com.gestemployesDFM.entity.Departement;
import com.gestemployesDFM.entity.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.gestemployesDFM.entity.Departement;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class DepartementController {
    @Autowired
    private DepartementService depservice;

    @GetMapping("/user/adddepartement")
    public String ajouterdepartement(Model model){
        model.addAttribute("departement", new Departement());
        return "user-adddepartement";
    }

    @RequestMapping("/deletedepartement/{code}")
    public String supprimerfonction(@PathVariable(name = "code") int code, RedirectAttributes redirAttrs) {
        redirAttrs.addFlashAttribute("supprimer", "Departement bien supprimer.");
        depservice.delete(code);
        return "redirect:/user/listdepartement";
    }

    @RequestMapping(value = "/ajouterdepartement", method = RequestMethod.POST)
    public String savefct(@ModelAttribute("fonction") Departement dpt, RedirectAttributes redirAttrs) {
        redirAttrs.addFlashAttribute("depajouter", "Departement bien ajouter.");
        depservice.save(dpt);
        return "redirect:/user/listdepartement";
    }
    @GetMapping("/user/listdepartement")
    public String gestionfonction(Model model){

        List<Departement> listdepartement = depservice.listAll();
        model.addAttribute("listdepartement", listdepartement);
        return "user-listdepartement";
    }
}
