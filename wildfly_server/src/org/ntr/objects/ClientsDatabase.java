package org.ntr.objects;

import java.util.ArrayList;
import java.util.List;

public class ClientsDatabase {
	
	private List<Client> clients;
	
	public ClientsDatabase() {
		
		clients = new ArrayList<Client>();
		
		clients.add(new Client(1, "John Cena", 100000));
		clients.add(new Client(2, "Vaden Cyr", 400));
		clients.add(new Client(3, "Honore Poulin", 540));
		clients.add(new Client(4, "Nicole Chrétien", 256));
		clients.add(new Client(5, "Roxanne Chauvet", 300));
		clients.add(new Client(6, "Joséphine Bellemare", 158));
		clients.add(new Client(7, "Gaetane Lapierre", 18.9));
		clients.add(new Client(8, "Odette Devoe", 45));
		clients.add(new Client(9, "Victorine Hervé", 20));
		clients.add(new Client(10, "Normand Chauvin", 58));
		clients.add(new Client(11, "Pascal Chaloux", 48));
		clients.add(new Client(12, "Stanislav Ankudinov", 78));
		clients.add(new Client(13, "Isabella Pinto", 99));
		clients.add(new Client(14, "Narciso Milano", 1000));
		clients.add(new Client(15, "Enrico Dellucci", 580));
		clients.add(new Client(16, "Napoleone Mancini", 471));
		clients.add(new Client(17, "Boris Rivas Tirado", 140));
		clients.add(new Client(18, "Delicia Rascón Oquendo", 120));
		clients.add(new Client(19, "Amilcar Olivo Cotto", 890));
		clients.add(new Client(20, "Athanaric Hogpen", 456));
		clients.add(new Client(21, "Marigold Burrows", 90));
		clients.add(new Client(22, "Saradas Zaragamba", 71));
		clients.add(new Client(23, "Robinia Fairbairn", 25));
		clients.add(new Client(24, "Malva Puddifoot", 65));
		clients.add(new Client(25, "Amanda Gaukrogers", 47));
		clients.add(new Client(26, "Primrose Oldbuck", 14));
		clients.add(new Client(27, "Sancho Brown", 98));
		clients.add(new Client(28, "Caramella Galbassi", 23.56));
		clients.add(new Client(29, "Line Lund", 45.98));
		clients.add(new Client(30, "Hamilton Pariseau", 12.45));
		clients.add(new Client(31, "Clementine Saindon", 45.87));
		clients.add(new Client(32, "Annette Patenaude", 58));
		clients.add(new Client(33, "Tilly Perrault", 142.98));
		clients.add(new Client(34, "Noémi Charbonneau", 56.9));
		clients.add(new Client(35, "Alphonse Bourgeois", 105.87));
		clients.add(new Client(36, "Caresse Bousquet", 0));
		clients.add(new Client(37, "Patrice Baron", 47.89));
		clients.add(new Client(38, "Tristan Arnoux", 78.3));
		clients.add(new Client(39, "Karel Beauchamps", 45.21));
		clients.add(new Client(40, "Albertine Perillard", 1000.87));
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
	
}
