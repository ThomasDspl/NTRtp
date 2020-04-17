package org.ntr.commerce;

import javax.jws.WebService;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Client;
import javax.ws.rs.core.MediaType;


@WebService(endpointInterface = "org.ntr.commerce.CommerceInterface")
public class Commerce implements CommerceInterface {
	
	private static Client client = ClientBuilder.newClient();

	  @Override
	  public String achat(int id, double montant) {
		  return client
		          .target("http://localhost:8080/wildfly_server-0.0.1-SNAPSHOT/banque-data/client/" + id + "/debit/" + montant)
		          .request(MediaType.APPLICATION_XML)
		          .get(String.class);
	  }
	  
	  @Override
	  public String remboursement(int id, double montant) {
		  return client
		          .target("http://localhost:8080/wildfly_server-0.0.1-SNAPSHOT/banque-data/client/" + id + "/credit/" + montant)
		          .request(MediaType.APPLICATION_XML)
		          .get(String.class);
	  }

}






 
