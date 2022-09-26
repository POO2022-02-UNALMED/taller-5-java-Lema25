package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	ArrayList<Pez> listado = new ArrayList<Pez>();
	int salmones;
	int bacalaos;
	String colorEscamas;
	inr cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
	
	public string movimiento() {
		return "nadar";
	}
	
	public void crearSalmon() {
		Pez nuevoSalmon = new Pez(n, e, "oceano", g, "rojo", 6);
		salmones++;
		return nuevoSalmon;
	}	
	
	public void crearBacalao() {
		Pez nuevoBacalao = new Pez(n, e, "oceano", g, "gris", 6);
		bacalaos++;
		return nuevoBacalao;
	}
}
