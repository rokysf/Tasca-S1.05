package n1exercici5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persona implements Serializable{

	private String nom;
	private  int edat;
	private String dni;
	
	
	public Persona() {
		
	}
	
	public Persona(String nom, int edat, String dni) {
		this.nom = nom;
		this.edat = edat;
		this.dni = dni;
	}

	public void serialitzar(String ruta, Persona persona) throws IOException {
		ObjectOutputStream serialitzar = new ObjectOutputStream(new FileOutputStream(ruta));
		serialitzar.writeObject(persona);
		serialitzar.close();
		System.out.println("Objecte serialitzat");
	}
	
	public static void deserialitzar(String ruta) throws IOException, ClassNotFoundException {
		ObjectInputStream deserialitzar = new ObjectInputStream(new FileInputStream(ruta));
		Persona personaResultat = (Persona) deserialitzar.readObject();
		deserialitzar.close();
		System.out.println(personaResultat);
		System.out.println("Objecte deserialitzat");
	}
	
	@Override
	public String toString() {
		return "Persona [nom=" + nom + ", edat=" + edat + ", dni=" + dni + "]";
	}
	
	
}
