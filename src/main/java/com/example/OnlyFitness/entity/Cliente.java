/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.OnlyFitness.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author LAN CENTER LEONPERU
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcliente")
    private int id;
    @Column(name = "nombre")
    private String nomb;
    @Column(name = "dni")
    private String dni;
    @Column(name = "direccion")
    private String dire;
    @Column(name = "correo")
    private String corr;
    @Column(name = "telefono")
    private String tele;
     @Column(name = "RUC")
    private String ruc;
        @Column(name = "razon_social")
    private String razo;
     
    //uno a muchos
        @OneToMany(cascade = CascadeType.MERGE, mappedBy = "idcliente", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Venta> venta = new ArrayList<>();
}
