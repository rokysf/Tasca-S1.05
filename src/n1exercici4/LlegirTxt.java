package n1exercici4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class LlegirTxt {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String ruta = sc.nextLine();
			
		try {
		llegirTxt(ruta);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void llegirTxt(String ruta) throws IOException {
		FileReader fitxer = new FileReader(ruta);
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
