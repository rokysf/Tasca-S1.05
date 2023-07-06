package n1exercici3;

import java.io.File;
import java.io.*;
import java.text.SimpleDateFormat;

public class GuardarTxt {

	
	public static void main(String[] args) {
						
		try {
		guardarArbreTxt("c:");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void guardarArbreTxt(String ruta) throws IOException {
		File directori = new File(ruta);
		File[] llista = directori.listFiles();
		FileWriter escriureTxt = new FileWriter("src" + File.separator + "n1exercici3" + File.separator + "prova.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		for (int i = 0; i < llista.length; i++) {
			File arxiu = llista[i];

			if (arxiu.isFile()) {
				escriureTxt.write(String.format("%s (%s) - %s", arxiu.getName(), arxiu.isDirectory() ? "D" : "F", sdf.format(arxiu.lastModified())+"\n"));
				
			} else {
				escriureTxt.write(String.format("%s (%s) - %s", arxiu.getName(), arxiu.isDirectory() ? "D" : "F", sdf.format(arxiu.lastModified())+"\n"));
				guardarArbreTxt(arxiu.getAbsolutePath());
				}
			
		}		
		escriureTxt.close();
	}

}
