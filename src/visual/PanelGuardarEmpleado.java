package visual;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class PanelGuardarEmpleado extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFechaNacimiento;
	private JTextField txtDocumento;
	private JTextField txtCuitCuil;

	/**
	 * Create the panel.
	 */
	public PanelGuardarEmpleado() {
		
		setPreferredSize(new Dimension(500, 350));
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(6, 62, 50, 16);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(6, 90, 52, 16);
		add(lblApellido);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(6, 123, 112, 16);
		add(lblFechaNacimiento);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(6, 151, 73, 16);
		add(lblDocumento);
		
		JLabel lblCuitcuil = new JLabel("CUIT/CUIL");
		lblCuitcuil.setBounds(6, 182, 66, 16);
		add(lblCuitcuil);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(91, 57, 130, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(91, 85, 130, 26);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(91, 118, 130, 26);
		add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(91, 146, 130, 26);
		add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setBounds(91, 177, 130, 26);
		add(txtCuitCuil);
		txtCuitCuil.setColumns(10);
		
		JButton btnGuardarEmpleado = new JButton("Guardar");
		btnGuardarEmpleado.setBounds(105, 294, 93, 29);
		add(btnGuardarEmpleado);
		
		JLabel lblDatosDelEmpleado = new JLabel("Datos del Empleado");
		lblDatosDelEmpleado.setBounds(6, 6, 109, 16);
		add(lblDatosDelEmpleado);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(257, 294, 117, 29);
		add(btnCancelar);

	}
}
