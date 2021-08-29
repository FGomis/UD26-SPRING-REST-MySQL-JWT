package com.spring.springer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.springer.dto.Pelicula;
import com.spring.springer.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServiceImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listarPeliculas(){
		return peliculaServiceImpl.listarPeliculas();
	}
	
	@PostMapping("/peliculas")
	public Pelicula guardarPelicula(@RequestBody Pelicula pelicula) {
		
		return peliculaServiceImpl.guardarPelicula(pelicula);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula peliculaXID(@PathVariable(name="id") int id) {
		
		Pelicula pelicula_xid= new Pelicula();
		
		pelicula_xid=peliculaServiceImpl.peliculaXID(id);
		
		System.out.println("Pelicula XID: "+pelicula_xid);
		
		return pelicula_xid;
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizarPelicula(@PathVariable(name="id")int id,@RequestBody Pelicula pelicula) {
		
		Pelicula pelicula_seleccionada= new Pelicula();
		Pelicula pelicula_actualizada= new Pelicula();
		
		pelicula_seleccionada= peliculaServiceImpl.peliculaXID(id);
		pelicula_seleccionada.setId(pelicula.getId());
		pelicula_seleccionada.setTitulo(pelicula.getTitulo());
		pelicula_seleccionada.setCalificacionEdad(pelicula.getCalificacionEdad());
		
		pelicula_actualizada = peliculaServiceImpl.actualizarPelicula(pelicula_seleccionada);
		
		System.out.println("La pelicula actualizada es: "+ pelicula_actualizada);
		
		return pelicula_actualizada;
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable(name="id")int id) {
		peliculaServiceImpl.eliminarPelicula(id);
	}
	
}
