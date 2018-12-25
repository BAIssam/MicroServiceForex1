package org.bai;

import org.bai.repositories.TauxDeChangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServiceForex1Application {
	
	@Autowired
	TauxDeChangeRepository tauxDeChangeRepository;

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceForex1Application.class, args);
	}
	
	/*
	@Override
	public void run(String... args) throws Exception {
		
		tauxDeChangeRepository.save(
				new TauxDeChange(null,"EURO","TND",BigDecimal.valueOf(3.3))
				);
		
		tauxDeChangeRepository.save(
				new TauxDeChange(null,"EURO","ALG",BigDecimal.valueOf(4))
				);
		
		tauxDeChangeRepository.save(
				new TauxDeChange(null,"EURO","MOR",BigDecimal.valueOf(5))
				);
		String de="EUR";
		String a="TND";
		TauxDeChange t;
		Long id = Long.valueOf(1);
		//t = tauxDeChangeRepository.findByDeviseDepartAndDeviseArrivee(de, a);
		//t = tauxDeChangeRepository.findByDeviseDepart(de);
		
		//System.out.println("from: "+t.getDeviseDepart() + " To: " +t.getDeviseArrivee()+ " Valeur: " +t.getConversionMultiple());
		
	}*/


}

