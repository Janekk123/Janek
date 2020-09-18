package course;

public class Soap_Project {

	public static void main(String[] args) {
		//info to zmnienna, która ma za zadanie przechowaæ informacje o produktach.
		
		
		
		//deficyt produktów
		int shampoo = 10;
		int soap = 15;
		int washing_powder = 20;
		
		//¿¹dana iloœæ produktów
		int requested_shampoo = 30;
		int requested_soap = 30;
		int requested_washing_powder = 40;
		
		//wakacje (holidays)
		boolean wakacje = false;
		
		//instrukcje warunkowe szamponu
		if(wakacje && shampoo < (requested_shampoo / 2))
		{
			int info = (requested_shampoo / 2) - shampoo ;
			System.out.println("Obecna wartoœæ szamponu wynosi "+shampoo+". Potrzeba dokupiæ "+info+" litrów szamponu");
		}
		
		else
		{
			int info = requested_shampoo - shampoo;
			System.out.println("Obecna wartoœæ szamponu wynosi "+shampoo+". Potrzeba dokupiæ "+info+" litrów szamponu");
		}
		
		//instrukcje warunkowe myd³a
		if(wakacje && soap < (requested_soap/2))
		{
			int info = (requested_soap / 2) - soap;
			System.out.println("Obecna wartoœæ myd³a wynosi "+soap+". Potrzeba dokupiæ "+info+" gramów myd³a");
		}
		
		else
		{
			int info = requested_soap - soap;
			System.out.println("Obecna wartoœæ myd³a wynosi "+soap+". Potrzeba dokupiæ "+info+" gramów myd³a");
		}
		
		//instrukcje warunkowe proszku do prania
		if(washing_powder < requested_washing_powder)
		{
			int info = requested_washing_powder - washing_powder;
			System.out.println("Obecna wartoœæ proszku do prania wynosi "+washing_powder+". Potrzeba dokupiæ "+info+" kilogramów proszku do prania");
		}
	
		
		
	

	}

}
