package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandra;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}


	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	

	public boolean getVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}

	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana() {
		Anfibio nuevoRana = new Anfibio(n, e, "selva", g, "rojo", true);
		ranas++;
		return nuevoRana;
	}
	
	public void crearSalamandra() {
		Anfibio nuevoSalamandra = new Anfibio(n, e, "selva", g, "negro y amarillo", false);
		salamandras++;
		return nuevoSalamandra;
	}
}
