package Aeropuerto;

import java.util.ArrayList;

public class Piloto {
	private String rut;
	private String idPiloto;
	public ArrayList<Vuelo> vuelosInscritos = new ArrayList<Vuelo>();

	private String getRut() {
		return this.rut;
	}

	private String getIdPiloto() {
		return this.idPiloto;
	}

	private Piloto(String rut, String idPiloto) {
		throw new UnsupportedOperationException();
	}
}