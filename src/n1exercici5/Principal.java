package n1exercici5;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {

		Persona persona = new Persona("Joan Gonzalez", 35, "36578937Z");
		System.out.println(persona);

		String ruta = args[0];

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

		System.out.println("Hola");
	}


}
