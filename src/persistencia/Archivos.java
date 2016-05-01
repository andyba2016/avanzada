package persistencia;

import negocio.empleado.spec.EmpleadoDTO;

public abstract class Archivos {

	
	public boolean saveEmpleado(EmpleadoDTO empleado){
		
		return true;
	}
	
	public EmpleadoDTO readEmpleado(String documento){
		return null;
		
	}
	
	public boolean updateEmpleado(EmpleadoDTO empleado){
		
		return true;
	}
	
	
}
