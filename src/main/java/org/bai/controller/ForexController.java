package org.bai.controller;

import java.util.List;

import org.bai.entities.TauxDeChange;
import org.bai.repositories.TauxDeChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	public TauxDeChangeRepository tauxDeChangeRepository;
	
	
	
	@GetMapping(value="/taux/from/{from}/to/{to}")
	public TauxDeChange getTaux(@PathVariable String from, @PathVariable String to) {
		
		
		System.out.println("From: "+ from + " To: " + to);
		TauxDeChange tauxDeChange = tauxDeChangeRepository.
				findByDeviseArriveeContains(from);
			//findByDeviseDepartAndDeviseArrivee(from,to);
		
		tauxDeChange.setPort(
				Integer.parseInt(environment.getProperty("server.port"))
				);
		
		return tauxDeChange;
		
	}
	
	@GetMapping(value="/taux")
	public List<TauxDeChange> getAllTaux() {
		
		return  tauxDeChangeRepository.findAll();
		
	}

}
