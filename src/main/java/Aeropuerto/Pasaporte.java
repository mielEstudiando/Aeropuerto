package Aeropuerto;

import java.util.Date;

public class Pasaporte {
	private String idPasaporte;
	private Date fechaEmisión;
	private boolean resultadoPCR;
	private Date fechaPCR;
	public Pasajero persona;

	private String getIdPasaporte() {
		return this.idPasaporte;
	}

	private Date getFechaEmisión() {
		return this.fechaEmisión;
	}

	private boolean getResultadoPCR() {
		return this.resultadoPCR;
	}

	private Date getFechaPCR() {
		return this.fechaPCR;
	}
}