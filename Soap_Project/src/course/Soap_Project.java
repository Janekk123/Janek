package course;

public class Soap_Project {

	public static void main(String[] args) {
		//info to zmnienna, kt�ra ma za zadanie przechowa� informacje o produktach.
		
		
		
		//deficyt produkt�w
		int shampoo = 10;
		int soap = 15;
		int washing_powder = 20;
		
		//��dana ilo�� produkt�w
		int requested_shampoo = 30;
		int requested_soap = 30;
		int requested_washing_powder = 40;
		
		//wakacje (holidays)
		boolean wakacje = false;
		
		//instrukcje warunkowe szamponu
		if(wakacje && shampoo < (requested_shampoo / 2))
		{
			int info = (requested_shampoo / 2) - shampoo ;
			System.out.println("Obecna warto�� szamponu wynosi "+shampoo+". Potrzeba dokupi� "+info+" litr�w szamponu");
		}
		
		else
		{
			int info = requested_shampoo - shampoo;
			System.out.println("Obecna warto�� szamponu wynosi "+shampoo+". Potrzeba dokupi� "+info+" litr�w szamponu");
		}
		
		//instrukcje warunkowe myd�a
		if(wakacje && soap < (requested_soap/2))
		{
			int info = (requested_soap / 2) - soap;
			System.out.println("Obecna warto�� myd�a wynosi "+soap+". Potrzeba dokupi� "+info+" gram�w myd�a");
		}
		
		else
		{
			int info = requested_soap - soap;
			System.out.println("Obecna warto�� myd�a wynosi "+soap+". Potrzeba dokupi� "+info+" gram�w myd�a");
		}
		
		//instrukcje warunkowe proszku do prania
		if(washing_powder < requested_washing_powder)
		{
			int info = requested_washing_powder - washing_powder;
			System.out.println("Obecna warto�� proszku do prania wynosi "+washing_powder+". Potrzeba dokupi� "+info+" kilogram�w proszku do prania");
		}
	
		
		
	

	}

}
