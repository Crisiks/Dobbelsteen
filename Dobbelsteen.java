package klassikaleopdrachten;
//Opdracht: maak een dobbelsteen. Hoe vaak gooi je 1 in 100 worpen?
import java.util.Random;

public class Dobbelsteen {
		
		//Werpt een dobbelsteen 100 keer.
		public static void main(String[] args) {
			
			int DobbelworpenGelijkAan1 = 0;
			
			Random spelingLot = new Random(); 
			for (int i = 1; i <= 100; i++) {
				int getal = spelingLot.nextInt(6) + 1;
			
				if (getal == 1) {DobbelworpenGelijkAan1++;
				}
				
				if (i == 100) {System.out.println("Je hebt " + DobbelworpenGelijkAan1 + " maal 1 gegooid!");
				
				}
									
			}
			
			
			System.out.println("============");
			System.out.println("Klaar");
		}

}
