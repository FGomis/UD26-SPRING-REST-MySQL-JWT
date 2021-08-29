package com.spring.springer.service;

import java.util.List;
import com.spring.springer.dto.Sala;


public interface ISalaService {
	public List<Sala> listarSalas();
	
	public Sala guardarSala(Sala sala);
	
	public Sala salaXID(int id);
	
	public Sala actualizarSala(Sala sala);
	
	public void eliminarSala(int id);
}
