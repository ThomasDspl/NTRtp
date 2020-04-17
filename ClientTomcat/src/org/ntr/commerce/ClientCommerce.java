package org.ntr.commerce;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClientCommerce {

	public static void main(String[] args) throws MalformedURLException {
		URL URLwsdl = new URL("http://localhost:8081/tomcat_server/commerce?wsdl");
		QName qName = new QName("http://commerce.ntr.org/","CommerceService");
		Service service = Service.create(URLwsdl, qName);
		CommerceInterface endpoint = service.getPort(CommerceInterface.class);

		boolean quitter = false;
		int choix = 0;
		int choix2 = 0;
		String message = "";
		double montantChoix = 0;
		
		String menu = 	"-------------------- CLIENT COMMERCE TOMCAT --------------------\n" +
				"CHOISISSEZ UNE OPERATION :\n" + 
				"|1| - ACHAT CLIENT\n" + 
				"|2| - REMBOURSEMENT CLIENT\n" + 
				"|3| - QUITTER\n";
		
		
	
		while(!quitter) {
			
			System.out.println(menu);
			
			Scanner sc = new Scanner(System.in);
			choix = sc.nextInt();
			
			switch(choix) {
			
			case 1 :
				System.out.println("SAISIR ID DU CLIENT A DEBITER : \n");
				choix2 = sc.nextInt();
				System.out.println("SAISIR MONTANT A DEBITER : \n");
				montantChoix = sc.nextDouble();
				message = endpoint.achat(choix2, montantChoix);
				System.out.println(message);
				break;
				
			case 2:
				System.out.println("SAISIR ID DU CLIENT A CREDITER : \n");
				choix2 = sc.nextInt();
				System.out.println("SAISIR MONTANT A CREDITER : \n");
				montantChoix = sc.nextDouble();
				message = endpoint.remboursement(choix2, montantChoix);
				System.out.println(message);
				break;
				
			case 3 :
				quitter = true;
				sc.close();
				break;
			}
			
		}
		
	}
		
}
