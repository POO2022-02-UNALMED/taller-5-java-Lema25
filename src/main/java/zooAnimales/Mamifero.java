package zooAnimales;

import java.util.ArrayList;


public class Mamifero extends Animal{
	ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	int caballos;
	int leones;
	boolean pelaje;
	int patas;
	
	public Mamifero() {
		listado.add(this);
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public boolean isPelaje() {
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
	
	public int cantidadMamiferos() {
		return listado.size();
	}
	
	public void crearCaballo() {
		Mamifero nuevoCaballo = new Mamifero(n, e, "pradera", g, true, 4);		
		caballos++;
		return nuevoCaballo;
	}
	
	public void crearLeon() {
		Mamifero nuevoLeon = new Mamifero(n, e, "selva", g, true, 4);		
		leones++;
		return nuevoLeon;
	}
}
