package negocio.medico.impl;

import negocio.medico.spec.MedicoDAO;
import negocio.medico.spec.MedicoDTO;

public class MedicoDAOFileImpl implements MedicoDAO{
	
	@Override
	public MedicoDTO setNombre(String nom) {
		
		MedicoDTO medico = new MedicoDTO();
		medico.setNombre(nom);
		return medico;
	}

}
