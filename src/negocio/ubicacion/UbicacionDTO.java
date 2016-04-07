package negocio.ubicacion;

public class UbicacionDTO {
	private int tipoUbicacion; // habitacion, consultorio, quirofano, guardia
	private String codigoUbicacion; // numero de habitacion

	
	public int getTipoUbicacion() {
		return tipoUbicacion;
	}
	public void setTipoUbicacion(int tipoUbicacion) {
		this.tipoUbicacion = tipoUbicacion;
	}

	public String getCodigoUbicacion() {
		return codigoUbicacion;
	}
	public void setCodigoUbicacion(String codigoUbicacion) {
		this.codigoUbicacion = codigoUbicacion;
	}
	@Override
	public String toString() {
		return "UbicacionDTO [tipoUbicacion=" + tipoUbicacion + ", codigoUbicacion=" + codigoUbicacion + "]";
	}

	

}
