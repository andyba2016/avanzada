package negocio.medico.spec;

import negocio.especialidad.Especialidad;
import negocio.medico.impl.MedicoDAOFileImpl;
import negocio.persona.Persona;

public class MedicoDTO extends Persona{

	private String cuit;
	private Especialidad especialidad;
	
	public String getCuit() {
		return this.cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Especialidad getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

    public MedicoDTO guardarMedico(MedicoDTO medico){
    	MedicoDAOFileImpl file = new MedicoDAOFileImpl();
    	file.guardarMedico(medico);
		return null;
    	
    }


	
	
	
}
