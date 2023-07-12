package n1exercici5;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix la ruta del fitxer .ser");
		String ruta = sc.nextLine();
		
		Persona persona = new Persona("Joan Gonzalez", 35, "36578937Z");
		System.out.println(persona);
				
		try {
			persona.serialitzar(ruta, persona);
		} catch (IOException e) {
			e.getMessage();
		}

		try {
			Persona.deserialitzar(ruta);
		} catch (ClassNotFoundException | IOException e) {
			e.getMessage();
		}
		sc.close();
	}


}
