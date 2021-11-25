/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.OnlyFitness.controller;

import com.example.OnlyFitness.repository.CategoriaRepository;
import com.example.OnlyFitness.repository.DetalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author LAN CENTER LEONPERU
 */
@Controller
public class ProductoController {
     @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private DetalleRepository detalleRepository;
     
    
    @RequestMapping("/")
    public String mensaje(Model model){
        model.addAttribute("mensaje", "Bienvenidos");
        return "index";
    }
   @RequestMapping("/detalleventa")
    public String libs(Model model) {
        model.addAttribute("detalleventa", detalleRepository.findAll());
       return "detalleventa";
    } 
}
