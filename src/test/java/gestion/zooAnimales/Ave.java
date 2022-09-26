package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
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
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave  crearHalcon() {
		Ave nuevoHalcon = new Ave(n, e, "montanas", g, "cafe glorioso");
		halcones++;
		return nuevoHalcon;
	}	
	
	public static Ave crearAguila() {
		Ave nuevoAguila = new Ave(n, e, "montanas", g, "blanco y amarillo");
		aguilas++;
		return nuevoAguila;
	}
}
