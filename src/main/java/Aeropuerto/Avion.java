package Aeropuerto;

import java.util.ArrayList;

public class Avion {
	private String nombre;
	private Double kmRecorridos;
	private String modelo;
	private Aeropuerto aeropuerto;
	public ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

	private String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private Double getKmRecorridos() {
		return this.kmRecorridos;
	}

	private void setKmRecorridos(Double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	private String getModelo() {
		return this.modelo;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
}