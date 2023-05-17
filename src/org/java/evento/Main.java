package org.java.evento;

import java.time.LocalDate;
import java.util.Scanner;
import org.java.evento.Evento;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Titolo evento:");
		String titolo = sc.nextLine();
		
		System.out.println("Data Evento:");
		LocalDate data = sc.nextLine();
		
		System.out.println("Numero posti disponibili");
		int totPosti = sc.nextInt();
		
		
		try {
			Evento e = new Evento (titolo, data, totPosti);
			System.out.println("Evento creato");
			
			
			
			
		}catch (Exception e) {
			System.err.println("Errore nella creazione dell'evento"+ e.getMessage());
		}
		
		
		
		

		

	}
}
