package visual;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Dimension;

public class PanelNuevoMedico extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFechaNacimiento;
	private JTextField txtDocumento;
	private JTextField txtEspecialidad;
	private JTextField txtCuitCuil;

	
	public PanelNuevoMedico() {
		
		
		setLayout(null);
		setBackground(UIManager.getColor("textHighlight"));
		
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
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setBounds(6, 179, 78, 16);
		add(lblEspecialidad);
		
		JLabel lblCuitcuil = new JLabel("CUIT/CUIL");
		lblCuitcuil.setBounds(6, 207, 66, 16);
		add(lblCuitcuil);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(68, 57, 130, 26);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(70, 85, 130, 26);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(130, 118, 130, 26);
		add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(91, 146, 130, 26);
		add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setBounds(96, 174, 130, 26);
		add(txtEspecialidad);
		txtEspecialidad.setColumns(10);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setBounds(84, 202, 130, 26);
		add(txtCuitCuil);
		txtCuitCuil.setColumns(10);
		
		JButton btnGuardarMedico = new JButton("Guardar");
		btnGuardarMedico.setBounds(105, 294, 93, 29);
		add(btnGuardarMedico);
		
		JLabel lblDatosDelMedico = new JLabel("Datos del Medico");
		lblDatosDelMedico.setBounds(6, 6, 109, 16);
		add(lblDatosDelMedico);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(257, 294, 117, 29);
		add(btnCancelar);

	}
}
