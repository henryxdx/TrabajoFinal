
package com.example.OnlyFitness.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "producto")
public class Producto implements Serializable{
    private static final long serialVersionUID = 3754851399214200439L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto")
	private int id; 
         @Column(name = "nombre")
        private String nomb;
        @Column(name = "marca")
        private String marc; 
        @Column(name = "costo")
        private String costo; 
	
        
        //uno a muchos
        @OneToMany(cascade = CascadeType.MERGE, mappedBy = "producto", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<DetalleVenta> detalleventa = new ArrayList<>();
        
        //muchos a uno
        @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
	@JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Categoria categoria;


}
