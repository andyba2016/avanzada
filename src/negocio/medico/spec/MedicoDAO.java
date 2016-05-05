package negocio.medico.spec;

import java.sql.Date;

import negocio.especialidad.Especialidad;

public interface MedicoDAO {
	
    public MedicoDTO setNombre(String nom);
	public MedicoDTO setApellido(String ape);
	public MedicoDTO setDireccion(String direccion);
	public MedicoDTO setCuit(String cuit);
	public MedicoDTO setDocumento(String documento);
	public MedicoDTO setEspecialidad(Especialidad especialidad);
	public MedicoDTO setFechaNacimiento(String fechaNacimiento);
	public MedicoDTO guardarMedico(MedicoDTO medico);

}
