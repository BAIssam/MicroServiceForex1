package org.bai.repositories;

import org.bai.entities.TauxDeChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TauxDeChangeRepository extends JpaRepository<TauxDeChange, Long> {
	
	public TauxDeChange findByDeviseDepartAndDeviseArrivee(String de, String a);
	
	public TauxDeChange findByDeviseArriveeContains(String a);
	
	@Query("SELECT t FROM TauxDeChange t WHERE t.deviseDepart = :dd AND deviseArrivee = :da")
	TauxDeChange findByDDDA(@Param("dd") String dd, @Param("da") String da);

}
