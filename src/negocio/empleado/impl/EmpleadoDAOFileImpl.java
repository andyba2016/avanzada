package negocio.empleado.impl;

import java.sql.Date;

import negocio.empleado.spec.EmpleadoDAO;
import negocio.empleado.spec.EmpleadoDTO;
import persistencia.Archivos;


public class EmpleadoDAOFileImpl implements EmpleadoDAO {

	public EmpleadoDTO guardarEmpleado(EmpleadoDTO empleado) {	
		Archivos archivo = null;
		boolean response = false;
		response = archivo.saveEmpleado(empleado);
	    if(response){
	    	return empleado;
	    }else{
	    	return null;
	    }
	}

	public EmpleadoDTO obtenerEmpleado(EmpleadoDTO empleado) {
		Archivos archivo = null;
		boolean response = false;
		empleado = archivo.readEmpleado(empleado.getDocumento());
		return empleado;
	}


	public EmpleadoDTO ModificarEmpleado(EmpleadoDTO empleado) {
		// TODO Auto-generated method stub
		return empleado;
	}

	
	
}
