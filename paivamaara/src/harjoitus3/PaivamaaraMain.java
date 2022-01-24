package harjoitus3;

import java.util.ArrayList;
import java.util.Scanner;

public class PaivamaaraMain {
	private ArrayList<Paivamaara> paivat = new ArrayList<>();
	public static void main(String[] args) {
		PaivamaaraMain esim = new PaivamaaraMain();
		esim.kysyPaivamaariaJaTalletaArrayListaan();
		esim.tulostaPaivamaarat();
		esim.palautaAnnetunVuodenPaivamaarat();
		esim.tulostaAnnetunPaivamaaranIndeksi();
	}
	
	public void kysyPaivamaariaJaTalletaArrayListaan() {
	Scanner scanner = new Scanner(System.in);
	boolean bool=true;
	System.out.println("Lis‰‰ p‰iv‰m‰‰r‰t: ");
	while(bool) {
		String paiva = scanner.nextLine();
		if(paiva.isEmpty()) {
			bool=false;
			break;
		}
		Paivamaara d = new Paivamaara(paiva);
		paivat.add(d);
	}
	}
	
	public void tulostaPaivamaarat() {
		for(int i=0; i<paivat.size(); i++) {
			System.out.println(paivat.get(i).toString());
		}
	}
	
	public void palautaAnnetunVuodenPaivamaarat() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Etsi vuosi: ");
		int vuosi = scanner.nextInt();
		System.out.println("Lˆytyneet p‰iv‰m‰‰r‰t: ");
		for(int i=0; i<paivat.size(); i++) {
			if(vuosi == paivat.get(i).getVuosi()){
				System.out.println(paivat.get(i));
			}
		}
	}
	
	public void tulostaAnnetunPaivamaaranIndeksi() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Etsi p‰iv‰m‰‰r‰: ");
		Paivamaara etsittavaPaiva = new Paivamaara(scanner.nextLine());
		int loytynyt=0;
		for(int i=0; i<paivat.size(); i++) {
			if(paivat.get(i).onSama(etsittavaPaiva)) {
				System.out.println("P‰iv‰m‰‰r‰ on kokoelmassa indeksikohdassa: "+paivat.indexOf(paivat.get(i)));
				loytynyt++;
			}
		}
		if(loytynyt==0)
			System.out.println("P‰iv‰m‰‰r‰‰ ei lˆytynyt!");
		scanner.close();
	}
}

