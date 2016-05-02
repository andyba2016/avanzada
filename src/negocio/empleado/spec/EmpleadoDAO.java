package negocio.empleado.spec;

import java.sql.Date;

public interface EmpleadoDAO {

	public EmpleadoDTO guardarEmpleado(EmpleadoDTO empleado);
	public EmpleadoDTO obtenerEmpleado(EmpleadoDTO empleado);
	public EmpleadoDTO ModificarEmpleado(EmpleadoDTO empleado);
	
}
