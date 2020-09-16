package course;

public class Myd³o {

	public static void main(String[] args) {
		//deficyt produktów
		int szampon = 10;
		int mydlo = 15;
		int proszekdoprania = 20;
		
		//¿¹dana iloœæ produktów
		int ileszamponu = 30;
		int ilemydla = 30;
		int ileproszku = 40;
		
		//wakacje (holidays)
		boolean wakacje = true;
		
		//instrukcje warunkowe szamponu
		if(wakacje && szampon < (ileszamponu / 2))
		{
			int info = (ileszamponu / 2) - szampon ;
			System.out.println("Potrzeba dokupiæ "+info+" litrów szamponu");
		}
		else
		{
			int info = ileszamponu - szampon;
			System.out.println("Potrzeba dokupiæ "+info+" litrów szamponu");
		}
		//instrukcje warunkowe myd³a
		if(wakacje && mydlo < (ilemydla/2))
		{
			int info = (ilemydla / 2) - mydlo;
			System.out.println("Potrzeba dokupiæ "+info+" gramów myd³a");
		}
		else
		{
			int info = ilemydla - mydlo;
			System.out.println("Potrzeba dokupiæ "+info+" gramów myd³a");
		}
		//instrukcje warunkowe proszku
		if(proszekdoprania < ileproszku)
		{
			int info = ileproszku - proszekdoprania;
			System.out.println("Potrzeba dokupiæ "+info+" kilogramów proszku do prania");
		}

	}

}
