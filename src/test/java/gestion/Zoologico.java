
package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zona = new ArrayList<Zona>();

	public Zoologico() {
		super();
	}

	public Zoologico(String nombre, String ubicacion) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return zona;
	}
	public void setZona(ArrayList<Zona> zonas) {
		this.zona = zonas;
	}
	
	public void agregarZonas(Zona nZona){
		zona.add(nZona);
	}
	
	public int cantidadTotalAnimales() {
		int cont = 0;
		for (int i = 0; i < zona.size(); i++)
	        cont += zona.get(i).cantidadAnimales();
		return cont;
	}
	
}
