package org.ntr.banque;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ntr.objects.Client;
import org.ntr.objects.Operation;
import org.ntr.objects.ClientsDatabase;

@Path("/banque-data")

public class BanqueService {
	
	private static ClientsDatabase database = new ClientsDatabase();

	
	@GET
	@Path("/client/{id}")
	@Produces("application/json")
	public Client getClient(@PathParam("id") int id) {
		Client nullClient = null;
		for (Client c : database.getClients()) {
		
			if (id == c.getId()) {
				nullClient = c;
				break;
			}
		}
		return nullClient;
	}
	

	
	@GET
	@Path("/client/{id}/operations")
	@Produces("application/json")
	public List<Operation> getOperations(@PathParam("id") int id) {
		List<Operation> operations = new ArrayList<>();
		for (Client c : database.getClients()) {
			if (id == c.getId()) {
				operations = c.getOperations();
				break;
			}
		}
		return operations;
	}
	
	
	@GET
	@Path("/client/{id}/credit/{montant}")
	@Produces("application/xml")
	public String credit(@PathParam("id") int id, @PathParam("montant") double montant) {
		List<Operation> temp = new ArrayList<Operation>();
		for (Client c : database.getClients()) {
			if (id == c.getId()) {
				double soldeActuel = c.getSolde();
				c.setSolde(soldeActuel + montant);
				temp = c.getOperations();
				temp.add(new Operation(1, montant));
				c.setOperations(temp);
				break;
			}
		}
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<message> Le solde a été crédité de " + montant + " €. </message>";
	}
	
	@GET
	@Path("/client/{id}/debit/{montant}")
	@Produces("application/xml")
	public String debit(@PathParam("id") int id, @PathParam("montant") double montant) {
		List<Operation> temp = new ArrayList<Operation>();
		for (Client c : database.getClients()) {
			if (id == c.getId()) {
				double soldeActuel = c.getSolde();
				c.setSolde(soldeActuel - montant);
				temp = c.getOperations();
				temp.add(new Operation(0, montant));
				c.setOperations(temp);
				break;
			}
		}
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<message> Le solde a été débité de " + montant + " €. </message>";
	}
	 

}
