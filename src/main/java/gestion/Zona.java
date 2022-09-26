package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;
import zooAnimales.Reptil;
import zooAnimales.Ave;
import zooAnimales.Pez;
import zooAnimales.Mamifero;
import zooAnimales.Anfibio;

public class Zona {
	String nombre;
	Zoologico zoo;
	ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona() {
		super();
	}

	public Zona(String nombre, Zoologico zool) {
		super();
		this.nombre = nombre;
		this.zoo = zool;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public void agregarAnimales(Animal add) {
		animales.add(add);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
