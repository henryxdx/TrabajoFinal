/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.OnlyFitness.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@Table(name = "detalleventa")
public class DetalleVenta implements Serializable{
     private static final long serialVersionUID = 3754851399214200439L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddetalle")
	private int id; 
       @Column(name = "cantidad")
	private String cantid;
       @Column(name = "precio")
	private String prec;             
        
       //muchos a uno
        @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Producto producto;
       
        //muchos a uno
        @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "idventa", referencedColumnName = "idcategoria")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Venta venta;
}
