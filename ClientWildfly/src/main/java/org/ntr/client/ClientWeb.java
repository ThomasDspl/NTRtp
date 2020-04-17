package org.ntr.client;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class ClientWeb {
	
	private static javax.ws.rs.client.Client client = ClientBuilder.newClient();
	
	public ClientWeb() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {

		boolean quitter = false;
		Client client = new Client();
		List<Operation> operations= new ArrayList<Operation>();
		int choix = 0;
		int choix2 = 0;
		
		String menu = 	"-------------------- CLIENT WILDFLY --------------------\n" +
				"CHOISISSEZ UNE OPERATION :\n" + 
				"|1| - RECUPERER DONNEES CLIENT\n" + 
				"|2| - RECUPERER OPERATIONS CLIENT\n" + 
				"|3| - QUITTER\n";
		
		
		
		
		while(!quitter) {
			
			System.out.println(menu);
			
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
			
			switch(choix) {
			
			case 1 :
				System.out.println("SAISIR ID DU CLIENT A RECUPERER : \n");
				choix2 = sc.nextInt();
				client = getClient(choix2);
				System.out.println("DONNEES DU CLIENT N°" + choix2);
				System.out.println(client.toString());
				break;
				
			case 2:
				System.out.println("SAISIR ID DU CLIENT  : \n");
				choix2 = sc.nextInt();
				operations = getOperations(choix2);
				System.out.println();
				for (Operation o : operations) {
					o.toString();
					System.out.println("-------------------------\n\n");
				}
				
				break;
				
			case 3 :
				quitter = true;
				sc.close();
				break;
			}
			
		}
		
	}
	
	private static Client getClient(int id) {
      return client
          .target("http://localhost:8080/wildfly_server-0.0.1-SNAPSHOT/banque-data/client/" + id)
          .request(MediaType.APPLICATION_JSON)
          .get(Client.class);
    }
	
	
	private static List<Operation> getOperations(int id) {
	      return client
	          .target("http://localhost:8080/wildfly_server-0.0.1-SNAPSHOT/banque-data/client/" + id + "/operations")
	          .request(MediaType.APPLICATION_JSON)
	          .get(new GenericType<List<Operation>>(){});
	}

}
