package n1exercici2;

import java.io.File;
import java.util.Arrays;

public class MostrarArbre {

	public static void main(String[] args) {
		
		File directori = new File("c:/");                                            
        File[] llista = directori.listFiles();
        Arrays.sort(llista);
        
        for (int i = 0; i < llista.length; i++) {
            File arxiu = llista[i];
            System.out.println(String.format("%s (%s) - %s",arxiu.getName(),arxiu.isDirectory() ? "D" : "F",arxiu.lastModified()));
        }

	}

}
