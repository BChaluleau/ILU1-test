package ilu.voitures;

public class Voiture {
	
	private int vitesse;
	private int vitesseMax;

	public Voiture(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	
	public void accelere() {
		if (vitesse + 40 <= vitesseMax) {
			vitesse += 40;
			System.out.println("Vroum !");
		}else {
			System.out.println("Je n'irais pas plus vite !");
			vitesse = vitesseMax;
		}
	}

	public int getVitesse() {
		return vitesse;
	}
}
