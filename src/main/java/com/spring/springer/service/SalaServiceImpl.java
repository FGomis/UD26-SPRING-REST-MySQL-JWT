package com.spring.springer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springer.dao.ISalaDAO;
import com.spring.springer.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
	
	@Autowired
	ISalaDAO iSalaDAO;

	@Override
	public List<Sala> listarSalas() {
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public Sala salaXID(int id) {
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizarSala(Sala sala) {
		return iSalaDAO.save(sala);
	}

	@Override
	public void eliminarSala(int id) {
		iSalaDAO.deleteById(id);
	}
}

