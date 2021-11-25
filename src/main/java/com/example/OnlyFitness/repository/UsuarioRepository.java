/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.OnlyFitness.repository;


import com.example.OnlyFitness.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LAN CENTER LEONPERU
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    public Usuario findByUsername(String username);
    
}
