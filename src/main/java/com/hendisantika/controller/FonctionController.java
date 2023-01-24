package com.hendisantika.controller;

import com.hendisantika.Service.FonctionService;
import com.hendisantika.dto.FonctionCountDTO;
import com.hendisantika.entity.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
public class FonctionController {


    private final FonctionService fonctionService;

    public FonctionController(FonctionService fonctionService) {
        this.fonctionService = fonctionService;
    }

    @Autowired
    private FonctionService fonctionservice;


    @GetMapping("/user/listfonction")
    public String gestionfonction(Model model){

        List<Fonction> listfonction = fonctionservice.listAll();
        model.addAttribute("listfonction", listfonction);
        return "user-listfonctions";
    }


    @GetMapping("/user/addfonction")
    public String ajouterfonction(Model model){
        model.addAttribute("fonction", new Fonction());
        return "user-addfonction";
    }
    @RequestMapping(value = "/ajouterfonction", method = RequestMethod.POST)
    public String savefct(@ModelAttribute("fonction") Fonction fon, RedirectAttributes redirAttrs) {
        redirAttrs.addFlashAttribute("fonajouter", "Fonction bien ajouter.");
        fonctionservice.save(fon);

        return "redirect:/user/listfonction";
    }
    @RequestMapping("/delete/{code}")
    public String supprimerfonction(@PathVariable(name = "code") int code, RedirectAttributes redirAttrs) {
        redirAttrs.addFlashAttribute("supprimer", "Fonction bien supprimer.");
        fonctionservice.delete(code);
        return "redirect:/user/listfonction";
    }
    @GetMapping("/user/getempcountbyfon")
    public String getempcountbyfon(Model model){
        List<FonctionCountDTO> fonctionCounts = fonctionService.getFonctionCounts();
        model.addAttribute("fonctionCounts", fonctionCounts);
        return "user-getempcountbyfon";
    }


}
