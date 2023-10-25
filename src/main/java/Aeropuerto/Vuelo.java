package Aeropuerto;

import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private Date horaPartida;
	private Date horaVuelta;
	public Avion avion;
	public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
	public ArrayList<Piloto> pilotos = new ArrayList<Piloto>();
	public Ciudad ciudadDestino;
	public Ciudad ciudadOrigen;

	private Date getHoraPartida() {
		return this.horaPartida;
	}

	private void setHoraPartida(Date horaPartida) {
		this.horaPartida = horaPartida;
	}

	private Date setHoraVuelta() {
		throw new UnsupportedOperationException();
	}

	private void setHoraVuelta(Date horaVuelta) {
		this.horaVuelta = horaVuelta;
	}
}