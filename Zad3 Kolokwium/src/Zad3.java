import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Zad3 {

	public static void main(String[] args) {
		Pole pole1 = new Pole();
		pole1.nazwa = "Gdansk";
		
		Gracz gracz1 = new Gracz("niebieski","stefan", pole1);
		System.out.println(gracz1.nazwa);
		System.out.println(gracz1.pionek.getKolor());
		System.out.println(gracz1.pionek.getPole().nazwa);
		
		GraWMonopol gra1 = new GraWMonopol();
		gra1.checkAndSetLiczbeGraczy(4);
		
	}

}

class Gracz {
	Pionek pionek;
	public Gracz(String kolor, String nazwa, Pole pole) {
		this.nazwa = nazwa;
		pionek = new Pionek(kolor, pole);	
	}
	String nazwa;
	int stanKonta;
}

class Pionek {
	private String kolor;
	private Pole pole;
	
	public Pionek(String kolor, Pole pole) {
		this.kolor = kolor;
		this.pole = pole;
	}
	
	public void setKolor(String kolor) {
		this.kolor = kolor;
	}
	public String getKolor() {
		return kolor;
	}
	
	public void setPole(Pole pole) {
		this.pole = pole;
	}
	public Pole getPole() {
		return pole;
	}
}

class GraWMonopol {
	private int min_graczy;
	private int max_graczy;
	private List<Gracz> graczy = new ArrayList<Gracz>();
	private Kostka kostka1;
	private Kostka kostka2;
	private Plansza plansza;
	
	public void checkAndSetLiczbeGraczy(int liczbaGraczy) {
		for (int i = 0; i < liczbaGraczy; i++) {
			graczy.add(null);
		}
		
		System.out.println("Liczba graczy " + graczy.size());
	}
	
	public GraWMonopol() {
		
	}
}

class Kostka {
	public void losuj() {
		//zmienic typ na int
		//Random wskazywanaWartosc = new Random();
		//wskazywanaWartosc.nextInt(7);
		//return wskazywanaWartosc
	}
	int wskazywanaWartosc;
}

class Plansza {
	private int Size;
	private Pole[] pole;
}

class Pole {
	String nazwa;
	private int poziomZabudowy;
	private boolean czeOddaneWZestaw;
	private int cenaGruntu;
	private int cenaRozbudowy;
	private int oplataZwykla;
	private int oplata1Domek;
	private int oplata2Domek;
	private int oplata3Domek;
	private int oplata4Domek;
	private int oplataHotel;
	private int max_liczba_pionkow;
	private int min_liczba_pionkow;
	private List<Pionek> pionek;
}

class KompletPol {
	private String nazwa;
	private int min_pol;
	private int max_pol;
	private List<Pole> pole;
}