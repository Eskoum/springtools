
	package ma.projet.repositories;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import ma.projet.entities.Filiere;

	@Repository
	public interface FiliereRepo extends JpaRepository<Filiere, Integer> {
		
	

}

