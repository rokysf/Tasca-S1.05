package n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;

public class MostrarArbre {

	public static void main(String[] args) {

		llistarArbre(".\\src");

	}

	public static void llistarArbre(String ruta) {
		File directori = new File(ruta);
		File[] llista = directori.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		for (int i = 0; i < llista.length; i++) {
			File arxiu = llista[i];

			if (arxiu.isFile()) {
				System.out.println(String.format("%s (%s) - %s", arxiu.getName(),"F", sdf.format(arxiu.lastModified())));
			} else {
				System.out.println(String.format("%s (%s) - %s", arxiu.getName(),"D", sdf.format(arxiu.lastModified())));
				llistarArbre(arxiu.getAbsolutePath());
			}
		}
	}
}