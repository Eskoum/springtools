package ma.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entities.Filiere;
import ma.projet.repositories.FiliereRepo;

@Service
public class FiliereSer implements IDao<Filiere> {

	@Autowired
	private FiliereRepo repository;

	@Override
	public Filiere create(Filiere o) {
		return repository.save(o);
	}

	@Override
	public boolean delete(Filiere o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Filiere update(Filiere o) {
		return repository.save(o);
	}

	@Override
	public Filiere findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Filiere> findAll() {
		return repository.findAll();
	}
	
	

}