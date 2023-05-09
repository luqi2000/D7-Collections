import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class PrimoEsercizio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many word do you want to add?");
		int n = in.nextInt();
		System.out.println("You chose: "+ n + " word");
		
		String[] parole = new String[n]; //array of strings of length n elements
		
		System.out.println("Enter the words");
		for(int i = 0; i<n; i++) { // i=0 first then i<n. n will be the 
			//number coming from up then loop for n time then register
			parole[i]= in.next();
		}
 
        Set<String> paroleDuplicate = new HashSet<String>();
        Set<String> paroleDistinte = new HashSet<String>();
        
        for (int i = 0; i < n; i++) {
            String parola = parole[i];
            if (!paroleDistinte.contains(parola)) {
                paroleDistinte.add(parola);
            } else {
                paroleDuplicate.add(parola);
            }
        }

        // Stampa le parole duplicate
        System.out.println("Parole duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        // Stampa il numero di parole distinte
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        // Stampa l'elenco delle parole distinte
        System.out.println("Elenco delle parole distinte:");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }
        in.close();
    }
}
		
		
