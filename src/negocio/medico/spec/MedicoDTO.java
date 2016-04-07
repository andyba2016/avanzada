package negocio.medico.spec;

import negocio.especialidad.Especialidad;
import negocio.persona.Persona;

public class MedicoDTO extends Persona{

	private String cuit;
	private Especialidad especialidad;
	
	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


	
	
	
	
}
