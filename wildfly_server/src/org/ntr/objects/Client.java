package org.ntr.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Client implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5235273998122546830L;
	private int id;
	private String nom;
	private double solde;
	private List<Operation> operations;
	
	
	public Client() {
		this.id = 0;
		this.nom = "Client error";
		this.solde = 0;
		this.operations = new ArrayList<Operation>();

	}
	
	public Client(int id, String nom, double solde) {
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		this.operations = new ArrayList<Operation>();
	}
	
	public Client(int id, String nom, double solde, List<Operation> operations) {
		this.id = id;
		this.nom = nom;
		this.solde = solde;
		this.operations = operations;
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
	
}
