package n1exercici4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class LlegirTxt {

	public static void main(String[] args) {
		
		String rutaGuardar = ".\\src";
		String rutaLlegir ="src" + File.separator + "n1exercici4" + File.separator + "prova.txt";
			
		try {
			guardarArbreTxt(rutaGuardar);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		try {
			llegirTxt(rutaLlegir);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	public static void guardarArbreTxt(String ruta) throws IOException {
		File directori = new File(ruta);
		File[] llista = directori.listFiles();
		BufferedWriter escriureTxt = new BufferedWriter(new FileWriter("src" + File.separator + "n1exercici4" + File.separator + "prova.txt"));
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

	public static void llegirTxt(String ruta) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(ruta));
        String line;

        while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        reader.close();
	}
	
}
