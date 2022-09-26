package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	ArrayList<Ave> listado = new ArrayList<Ave>();
	int halcones;
	in aguilas;
	String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public cantidadAves() {
		return listado.size();
	}
	
	public movimiento() {
		return "volar";
	}
	
	public void crearHalcon() {
		Ave nuevoHalcon = new Ave(n, e, "montanas", g, "cafe glorioso");
		halcones++;
		return nuevoHalcon;
	}	
	
	public void crearAguila() {
		Ave nuevoAguila = new Ave(n, e, "montanas", g, "blanco y amarillo");
		aguilas++;
		return nuevoAguila;
	}
}
