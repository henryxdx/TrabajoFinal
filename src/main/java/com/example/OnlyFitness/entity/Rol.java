/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.OnlyFitness.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="rol")
public class Rol {   
	private static final long serialVersionUID = -3490423452440544278L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idrol")
	private int id;
	@Column(unique = true)
	private String nombre;
        
        
        
	//uno a muchos
       @OneToMany (cascade = CascadeType.MERGE, mappedBy = "rol", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Usuario> usuario = new ArrayList<>();
}

