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

import com.spring.springer.dto.Sala;
import com.spring.springer.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listarSalas(){
		return salaServiceImpl.listarSalas();
	}
	
	@PostMapping("/salas")
	public Sala guardarSala(@RequestBody Sala sala) {
		
		return salaServiceImpl.guardarSala(sala);
	}
	
	@GetMapping("/salas/{id}")
	public Sala salaXID(@PathVariable(name="id") int id) {
		
		Sala sala_xid= new Sala();
		
		sala_xid=salaServiceImpl.salaXID(id);
		
		System.out.println("Sala XID: "+sala_xid);
		
		return sala_xid;
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizarSala(@PathVariable(name="id")int id,@RequestBody Sala sala) {
		
		Sala sala_seleccionada= new Sala();
		Sala sala_actualizada= new Sala();
		
		sala_seleccionada= salaServiceImpl.salaXID(id);
		sala_seleccionada.setId(sala.getId());
		sala_seleccionada.setNombre(sala.getNombre());
		sala_seleccionada.setPelicula(sala.getPelicula());
		
		sala_actualizada = salaServiceImpl.actualizarSala(sala_seleccionada);
		
		System.out.println("La sala actualizada es: "+ sala_actualizada);
		
		return sala_actualizada;
	}
	
	@DeleteMapping("/salas/{id}")
	public void eliminarSala(@PathVariable(name="id")int id) {
		salaServiceImpl.eliminarSala(id);
	}
	
}
