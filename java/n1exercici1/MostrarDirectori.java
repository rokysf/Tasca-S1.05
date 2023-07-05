package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class MostrarDirectori {

	public static void main(String[] args) {
		
		File directori = new File("c:/");                                            
        String[] llista = directori.list();
        Arrays.sort(llista);
        for (int i = 0; i < llista.length; i++) {
            System.out.println(llista[i]);
        }
 	}

}
