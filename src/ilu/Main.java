package ilu;

import ilu.voitures.Voiture;

public class Main {

	public static void main(String[] args) {
		System.out.println("Lancement...");
		Voiture deuxCV = new Voiture(90);
		deuxCV.accelere();
		System.out.println("Vitesse : " + deuxCV.getVitesse());
		deuxCV.accelere();
		System.out.println("Vitesse : " + deuxCV.getVitesse());
		deuxCV.accelere();
		System.out.println("Vitesse : " + deuxCV.getVitesse());
		deuxCV.accelere();
		System.out.println("Vitesse : " + deuxCV.getVitesse());

		
		Voiture tesla = new Voiture(130);
		tesla.accelere();
		tesla.accelere();
		tesla.accelere();
		tesla.accelere();
		tesla.accelere();
		System.out.println("Vitesse : " + tesla.getVitesse());
		
		
	}

}
