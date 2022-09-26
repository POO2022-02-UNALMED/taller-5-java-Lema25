package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	int totalAnimales;
	String nombre;
	int edad;
	String habitad;
	String genero;
	Zona zona[];
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
	}	
	
	public Animal() {
		super();
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Zona[] getZona() {
		return zona;
	}
	public void setZona(Zona[] zona) {
		this.zona = zona;
	}
	
	public movimiento() {
		return "desplazarse";
	}
	
	public String totalPorTipo() {
		String totales = "Mamiferos: " + Mamifero.cantidadMamiferos() 
				+ "\n" + "Aves: " + Ave.cantidadAves() 
				+ "\n" + "Reptiles: " + Reptil.cantidadReptiles() 
				+ "\n" + "Peces: " + Pez.cantidadPeces() 
				+ "\n" + "Anfibios: " + Anfibio.cantidadAnfibios();
		return totales;
	}
	
	public String toString(){
		String datos = "Mi nombre es " + this.nombre 
				+ " tengo una edad de " + this.edad 
				+ ", habito en "+ this.habitad
				+ " y mi genero es " + this.genero;
		return datos;
	}
}
