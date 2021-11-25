/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.OnlyFitness.controller;

import com.example.OnlyFitness.repository.ClienteRepository;
import com.example.OnlyFitness.repository.UsuarioRepository;
import com.example.OnlyFitness.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author LAN CENTER LEONPERU
 */
@Controller
public class VentaController {
    @Autowired
    private VentaRepository ventaRepository;
    
     @Autowired
    private ClienteRepository clienteRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;
        
    @RequestMapping("/")
    public String mensaje(Model model){
        model.addAttribute("mensaje", "Bienvenidos");
        return "index";
    }
   @RequestMapping("/venta")
    public String libs(Model model) {
        model.addAttribute("venta", ventaRepository.findAll());
       return "venta";
    }   
    
  
}
