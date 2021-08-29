package com.spring.springer.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "salas") // Nombre de la tabla (distinto a la clase)
public class Sala {

//	Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
	private int id;
	private String nombre;
//	Atributo muchos a uno para indicar la FK
	@ManyToOne
    @JoinColumn(name="pelicula")
    private Pelicula pelicula;

	
//	Constructores
	public Sala() {}
	
	public Sala(int id, String nombre, Pelicula pelicula) {
		this.id = id;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}


	
}
