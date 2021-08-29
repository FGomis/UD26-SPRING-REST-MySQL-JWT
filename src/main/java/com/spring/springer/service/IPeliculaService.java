package com.spring.springer.service;

import java.util.List;
import com.spring.springer.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas();
	
	public Pelicula guardarPelicula(Pelicula pelicula);
	
	public Pelicula peliculaXID(int id);
	
	public Pelicula actualizarPelicula(Pelicula pelicula);
	
	public void eliminarPelicula(int id);
}
