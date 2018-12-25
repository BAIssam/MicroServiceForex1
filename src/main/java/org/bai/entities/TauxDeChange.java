package org.bai.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TauxDeChange {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String deviseDepart;

	private String deviseArrivee;

	private BigDecimal conversionMultiple;
	private int port;

	public TauxDeChange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TauxDeChange(Long id, String deviseDepart, String deviseArrivee, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.deviseDepart = deviseDepart;
		this.deviseArrivee = deviseArrivee;
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDeviseDepart(String deviseDepart) {
		this.deviseDepart = deviseDepart;
	}

	public void setDeviseArrivee(String deviseArrivee) {
		this.deviseArrivee = deviseArrivee;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public String getDeviseDepart() {
		return deviseDepart;
	}

	public String getDeviseArrivee() {
		return deviseArrivee;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	@Override
	public String toString() {
		return "TauxDeChange [deviseDepart=" + deviseDepart + ", deviseArrivee=" + deviseArrivee
				+ ", conversionMultiple=" + conversionMultiple + ", port=" + port + "]";
	}
	
	

}
