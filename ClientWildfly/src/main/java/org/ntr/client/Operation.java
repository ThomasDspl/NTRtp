package org.ntr.client;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Operation implements Serializable {
	
	private static int idcount = 1;
	/**
	 * 
	 */
	private static final long serialVersionUID = -6090741147986717752L;
	private int id;
	private int type; //debit=0 credit=1
	private double montant;
	
	
	
	public Operation(int type, double montant) {
		this.id = idcount;
		this.type = type;
		this.montant = montant;
		idcount++;
	}
	
	public Operation(int id, int type, double montant) {
		this.id = id;
		this.type = type;
		this.montant = montant;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public double getMontant() {
		return montant;
	}
	
	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	@Override
	public String toString() {
		String typeOp = "";
		if (this.type == 0) {
			typeOp = "debit";
		} else {
			typeOp = "credit";
		}
		String s = "Operation n°" + this.id + "\nType : " + typeOp + "\nMontant : " + this.montant + "€\n";
		return s;
	}
	
}
