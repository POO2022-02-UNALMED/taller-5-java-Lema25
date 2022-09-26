package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String n, int e, String g) {
		Pez nuevoSalmon = new Pez(n, e, "oceano", g, "rojo", 6);
		salmones++;
		return nuevoSalmon;
	}	
	
	public static Pez  crearBacalao(String n, int e, String g) {
		Pez nuevoBacalao = new Pez(n, e, "oceano", g, "gris", 6);
		bacalaos++;
		return nuevoBacalao;
	}
}
