package com.spring.springer.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peliculas") // Nombre de la tabla (distinto a la clase)
public class Pelicula {
	
//	Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement
	private int id;
	private String titulo;
	@Column(name = "calificacion_edad")
	private String calificacionEdad;
	
//	Constructores
	
	public Pelicula() {}
	
	public Pelicula(int id, String titulo, String calificacionEdad) {
		this.id = id;
		this.titulo = titulo;
		this.calificacionEdad = calificacionEdad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(String calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}
	
	
}
