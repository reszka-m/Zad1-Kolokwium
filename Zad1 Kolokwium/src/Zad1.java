
public class Zad1 {

	public static void main(String[] args) {
		Lew lew1 = new Lew("lew", 3, 105.5);
		lew1.biegnij();
		lew1.wypisz();
		
		Orzel orzel1 = new Orzel("orzel", 5, 15);
		orzel1.lec();
		orzel1.wypisz();
		
	}

}

class Zwierze {
	String nazwa;
	int wiek;
	double waga;
	
	public Zwierze(String nazwa, int wiek, double waga) {
		this.nazwa = nazwa;
		this.wiek = wiek;
		this.waga = waga;
	}
	
}

class Lew extends Zwierze{
	public Lew(String nazwa, int wiek, double waga) {
		super(nazwa, wiek, waga);
	}

	boolean biegnie;
	
	public void biegnij() {
		biegnie = true;
	}
	public void zatrzymajSie() {
		biegnie = false;
	}
	
	public void wypisz() {
		System.out.println("Stan biegu: " + biegnie);
	}
}

class Orzel extends Zwierze{

	public Orzel(String nazwa, int wiek, double waga) {
		super(nazwa, wiek, waga);
	}
	
	boolean leci;
	
	public void lec() {
		leci = true;
	}
	public void wyladuj() {
		leci = false;
	}
	
	public void wypisz() {
		System.out.println("Stan lotu: " + leci);
	}
}




