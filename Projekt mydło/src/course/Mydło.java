package course;

public class Myd�o {

	public static void main(String[] args) {
		//deficyt produkt�w
		int szampon = 10;
		int mydlo = 15;
		int proszekdoprania = 20;
		
		//��dana ilo�� produkt�w
		int ileszamponu = 30;
		int ilemydla = 30;
		int ileproszku = 40;
		
		//wakacje (holidays)
		boolean wakacje = true;
		
		//instrukcje warunkowe szamponu
		if(wakacje && szampon < (ileszamponu / 2))
		{
			int info = (ileszamponu / 2) - szampon ;
			System.out.println("Potrzeba dokupi� "+info+" litr�w szamponu");
		}
		else
		{
			int info = ileszamponu - szampon;
			System.out.println("Potrzeba dokupi� "+info+" litr�w szamponu");
		}
		//instrukcje warunkowe myd�a
		if(wakacje && mydlo < (ilemydla/2))
		{
			int info = (ilemydla / 2) - mydlo;
			System.out.println("Potrzeba dokupi� "+info+" gram�w myd�a");
		}
		else
		{
			int info = ilemydla - mydlo;
			System.out.println("Potrzeba dokupi� "+info+" gram�w myd�a");
		}
		//instrukcje warunkowe proszku
		if(proszekdoprania < ileproszku)
		{
			int info = ileproszku - proszekdoprania;
			System.out.println("Potrzeba dokupi� "+info+" kilogram�w proszku do prania");
		}

	}

}
