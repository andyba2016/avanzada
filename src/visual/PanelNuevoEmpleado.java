package visual;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.Font;

public class PanelNuevoEmpleado extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFechaNacimiento;
	private JTextField txtDocumento;
	private JTextField txtCuitCuil;
	private JTextField txtPersonal;
	private JTextField txtCelular;
	private JTextField txtLaboral;
	private JTextField txtEmail;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	
	public PanelNuevoEmpleado() {
		
		setLayout(null);
		setBackground(UIManager.getColor("textHighlight"));
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNombre.setBounds(17, 90, 117, 16);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApellido.setBounds(17, 136, 73, 16);
		add(lblApellido);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFechaNacimiento.setBounds(17, 182, 176, 16);
		add(lblFechaNacimiento);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDocumento.setBounds(17, 239, 141, 16);
		add(lblDocumento);
		
		JLabel lblCuitcuil = new JLabel("CUIT/CUIL");
		lblCuitcuil.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCuitcuil.setBounds(17, 283, 117, 16);
		add(lblCuitcuil);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(204, 83, 176, 34);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(204, 129, 176, 34);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(204, 175, 176, 34);
		add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(204, 221, 176, 34);
		add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setBounds(204, 265, 176, 34);
		add(txtCuitCuil);
		txtCuitCuil.setColumns(10);
		
		JButton btnGuardarEmpleado = new JButton("Guardar");
		btnGuardarEmpleado.setBounds(204, 648, 141, 46);
		add(btnGuardarEmpleado);
		
		JLabel lblDatosDelEmpleado = new JLabel("Datos del Empleado");
		lblDatosDelEmpleado.setFont(new Font("Arial", Font.BOLD, 22));
		lblDatosDelEmpleado.setBounds(6, 6, 234, 34);
		add(lblDatosDelEmpleado);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(438, 648, 141, 46);
		add(btnCancelar);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEmail.setBounds(17, 329, 117, 16);
		add(lblEmail);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTelefono.setBounds(17, 363, 117, 16);
		add(lblTelefono);
		
		JLabel lblNroPersonal = new JLabel("Personal");
		lblNroPersonal.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNroPersonal.setBounds(146, 364, 117, 16);
		add(lblNroPersonal);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDireccion.setBounds(17, 483, 117, 16);
		add(lblDireccion);
		
		txtPersonal = new JTextField();
		txtPersonal.setColumns(10);
		txtPersonal.setBounds(239, 357, 176, 34);
		add(txtPersonal);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCelular.setBounds(146, 399, 117, 16);
		add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(239, 392, 176, 34);
		add(txtCelular);
		
		JLabel lblLaboral = new JLabel("Laboral");
		lblLaboral.setFont(new Font("Arial", Font.PLAIN, 20));
		lblLaboral.setBounds(146, 434, 117, 16);
		add(lblLaboral);
		
		txtLaboral = new JTextField();
		txtLaboral.setColumns(10);
		txtLaboral.setBounds(239, 427, 176, 34);
		add(txtLaboral);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(204, 311, 176, 34);
		add(txtEmail);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(239, 483, 176, 34);
		add(textField);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCalle.setBounds(146, 490, 117, 16);
		add(lblCalle);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAltura.setBounds(146, 525, 117, 16);
		add(lblAltura);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(239, 518, 176, 34);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(239, 553, 176, 34);
		add(textField_2);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCiudad.setBounds(146, 560, 117, 16);
		add(lblCiudad);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(555, 483, 176, 34);
		add(textField_3);
		
		JLabel label = new JLabel("Personal");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(462, 490, 117, 16);
		add(label);
		
		JLabel label_1 = new JLabel("Celular");
		label_1.setFont(new Font("Arial", Font.PLAIN, 20));
		label_1.setBounds(462, 525, 117, 16);
		add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(555, 518, 176, 34);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(555, 553, 176, 34);
		add(textField_5);
		
		JLabel label_2 = new JLabel("Laboral");
		label_2.setFont(new Font("Arial", Font.PLAIN, 20));
		label_2.setBounds(462, 560, 117, 16);
		add(label_2);

	}
}
