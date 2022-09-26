package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	ArrayList<Reptil> listado = new ArrayList<Reptil>();
	int iguanas;
	int serpientes;
	String ColorEscamas;
	int largoCola;
	
	public Reptil() {
		listado.add(this);
	}

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
	}
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public cantidadResptiles() {
		return listado.size();
	}
	
	public movimiento() {
		return "reptar";
	}
	
	public void crearIguana() {
		Reptil nuevoIguana = new Reptil(n, e, "humedal", g, "verde", 3);
		iguanas++;
		return nuevoIguana;
	}	
	
	public void crearSerpiente() {
		Reptil nuevoSerpiente = new Reptil(n, e, "jungla", g, "blanco", 1);
		serpientes++;
		return nuevoSerpiente;
	}

}