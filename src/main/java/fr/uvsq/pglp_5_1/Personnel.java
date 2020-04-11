package fr.uvsq.pglp_5_1;

import java.util.ArrayList;
import java.time.LocalDate;

public class Personnel implements PersonnelInterface{
	
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final java.time.LocalDate dateNaissance;
	private ArrayList<String> numeroTelephone;
	
	public static class Builder {
		
		private final String nom;
		private final String prenom;
		private final String fonction;
		private final java.time.LocalDate dateNaissance;
		private final ArrayList<String> numeroTelephone;
		
		Builder(final String nom,final String prenom,final String fonction,final LocalDate dateNaissance,final ArrayList<String> numeroTelephone)
		{
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.fonction = fonction;
			this.numeroTelephone = numeroTelephone;
			
		}
		
		public Personnel build()
		{
			return new Personnel(this);
		}
	}
	
	public Personnel(Builder b) {
		this.nom = b.nom;
		this.prenom = b.prenom;
		this.fonction = b.fonction;
		this.dateNaissance = b.dateNaissance;
		this.numeroTelephone = b.numeroTelephone;
	}
	
	public void print(){
		System.out.print("nom : "+nom+" prenm : "+prenom+" fonction : "+fonction+" date de naissance : "+dateNaissance+
				" numero de tel : ");
		for(String i: numeroTelephone)
			System.out.print(i+ " ");
	}
	
	
}
