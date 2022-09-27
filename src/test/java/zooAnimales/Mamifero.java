
package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	
	public Mamifero() {
		listado.add(this);
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearCaballo(String n,int e, String g){
		Mamifero nuevoCaballo = new Mamifero(n, e, "pradera", g, true, 4);		
		caballos++;
		return nuevoCaballo;
	}
	
	public static Mamifero crearLeon(String n,int e, String g){
		Mamifero nuevoLeon = new Mamifero(n, e, "selva", g, true, 4);		
		leones++;
		return nuevoLeon;
	}
	
}