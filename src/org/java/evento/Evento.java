package org.java.evento;

import java.time.LocalDate;

public class Evento {
	private String titolo;
	private LocalDate data;
	private int totPosti;
	private int prenPosti;
	
	public Evento(String titolo,LocalDate data, int totPosti)throws Exception {
		
		setTitolo(titolo);
		setData(data);
		this.totPosti=totPosti;
		this.prenPosti=0;
	}



	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) throws Exception {
		if(data.isBefore(LocalDate.now())) {
			throw new Exception("La data è gia passata");
		}
		this.data = data;
	}

	public int getTotPosti() throws Exception {
		if(totPosti < 0) {
			throw new Exception("I posti totali non possono essere minori di 0");
		}
		return totPosti;
	}


	public int getPrenPosti() {
		return prenPosti;
	}
	
	public void Prenota() throws Exception {
		if(data.isBefore(LocalDate.now())) {
			throw new Exception("La data è gia passata");
		}
		
		if(prenPosti>totPosti) {
			throw new Exception("Tutti i posti disponibili sono prenotati");
		}
		
		prenPosti++;
	}
	
	public void Disdici() throws Exception {
		if(data.isBefore(LocalDate.now())) {
			throw new Exception("La data è gia passata");
		}
		
		if(prenPosti<totPosti) {
			throw new Exception("Nessuna prenotazione");
		}
		
		prenPosti--;
	}

	
	@Override
	public String toString() {
		return "Titolo:"+ getTitolo()+ 
				"\nData:"+ getData();
	}
	
	
	
	
}
