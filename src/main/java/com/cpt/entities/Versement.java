package com.cpt.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "V")
public class Versement extends Operation {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateoperation, double montant, Compte cp) {
		super(dateoperation, montant, cp);
		// TODO Auto-generated constructor stub
	}

}
