package negocio.medico.impl;

import java.sql.Date;

import negocio.especialidad.Especialidad;
import negocio.medico.spec.MedicoDAO;
import negocio.medico.spec.MedicoDTO;

public class MedicoDAOFileImpl implements MedicoDAO{
	
	@Override
	public MedicoDTO setNombre(String nom) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setNombre(nom);
		return medico;
	}
	public MedicoDTO setApellido(String ape) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setApellido(ape);
		return medico;
	}
	public MedicoDTO setCuit(String cuit) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setCuit(cuit);
		return medico;
	}
	public MedicoDTO setDireccion(String direccion) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setDireccion(direccion);
		return medico;
	}
	public MedicoDTO setDocumento(String documento) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setDocumento(documento);
		return medico;
	}
	public MedicoDTO setEspecialidad(Especialidad especialidad) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setEspecialidad(especialidad);
		return medico;
	}
	public MedicoDTO setFechaNacimiento(Date fechaNacimiento) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setFechaNacimiento(fechaNacimiento);
		return medico;
	}
	
}
