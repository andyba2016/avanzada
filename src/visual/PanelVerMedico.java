package visual;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class PanelVerMedico extends JPanel {

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
	private JTextField txtCalle;
	private JTextField txtAltura;
	private JTextField txtCiudad;
	private JTextField txtProvincia;
	private JTextField txtPais;
	private JTextField txtCodPostal;
	private JTextField txtObraSocial;

	
	public PanelVerMedico() {
		
		setLayout(null);
		setBackground(UIManager.getColor("textHighlight"));
		
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNombre.setBounds(17, 52, 117, 16);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApellido.setBounds(17, 98, 73, 24);
		add(lblApellido);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFechaNacimiento.setBounds(17, 149, 176, 16);
		add(lblFechaNacimiento);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDocumento.setBounds(17, 195, 141, 16);
		add(lblDocumento);
		
		JLabel lblCuitcuil = new JLabel("CUIT/CUIL");
		lblCuitcuil.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCuitcuil.setBounds(17, 245, 117, 16);
		add(lblCuitcuil);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(239, 45, 176, 34);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(239, 95, 176, 34);
		add(txtApellido);
		txtApellido.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(239, 142, 176, 34);
		add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		txtDocumento = new JTextField();
		txtDocumento.setBounds(239, 188, 176, 34);
		add(txtDocumento);
		txtDocumento.setColumns(10);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setBounds(239, 234, 176, 34);
		add(txtCuitCuil);
		txtCuitCuil.setColumns(10);
		
		JButton btnGuardarEmpleado = new JButton("Guardar");
		btnGuardarEmpleado.setBounds(204, 648, 141, 46);
		add(btnGuardarEmpleado);
		
		JLabel lblDatosDelEmpleado = new JLabel("Datos del Empleado");
		lblDatosDelEmpleado.setFont(new Font("Arial", Font.BOLD, 22));
		lblDatosDelEmpleado.setBounds(17, 6, 234, 34);
		add(lblDatosDelEmpleado);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(93, 29));
		btnCancelar.setBounds(438, 648, 141, 46);
		add(btnCancelar);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Arial", Font.PLAIN, 20));
		lblEmail.setBounds(17, 287, 117, 16);
		add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(239, 280, 176, 34);
		add(txtEmail);
		
		JLabel lblObraSocial = new JLabel("Obra Social");
		lblObraSocial.setFont(new Font("Arial", Font.PLAIN, 20));
		lblObraSocial.setBounds(17, 600, 117, 16);
		add(lblObraSocial);
		
		txtObraSocial = new JTextField();
		txtObraSocial.setColumns(10);
		txtObraSocial.setBounds(239, 590, 176, 34);
		add(txtObraSocial);
		
		JLayeredPane layeredPaneTel = new JLayeredPane();
		layeredPaneTel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layeredPaneTel.setBounds(0, 328, 800, 123);
		add(layeredPaneTel);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(17, 13, 117, 16);
		layeredPaneTel.add(lblTelefono);
		lblTelefono.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNroPersonal = new JLabel("Personal");
		lblNroPersonal.setBounds(145, 13, 117, 16);
		layeredPaneTel.add(lblNroPersonal);
		lblNroPersonal.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtPersonal = new JTextField();
		txtPersonal.setBounds(239, 6, 176, 34);
		layeredPaneTel.add(txtPersonal);
		txtPersonal.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(145, 48, 117, 16);
		layeredPaneTel.add(lblCelular);
		lblCelular.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtCelular = new JTextField();
		txtCelular.setBounds(239, 41, 176, 34);
		layeredPaneTel.add(txtCelular);
		txtCelular.setColumns(10);
		
		JLabel lblLaboral = new JLabel("Laboral");
		lblLaboral.setBounds(145, 83, 117, 16);
		layeredPaneTel.add(lblLaboral);
		lblLaboral.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtLaboral = new JTextField();
		txtLaboral.setBounds(239, 76, 176, 34);
		layeredPaneTel.add(txtLaboral);
		txtLaboral.setColumns(10);
		
		JLayeredPane layeredPaneDir = new JLayeredPane();
		layeredPaneDir.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layeredPaneDir.setBounds(0, 450, 800, 123);
		add(layeredPaneDir);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(14, 13, 117, 16);
		layeredPaneDir.add(lblDireccion);
		lblDireccion.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(143, 13, 117, 16);
		layeredPaneDir.add(lblCalle);
		lblCalle.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(143, 47, 117, 16);
		layeredPaneDir.add(lblAltura);
		lblAltura.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(143, 86, 117, 16);
		layeredPaneDir.add(lblCiudad);
		lblCiudad.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtCalle = new JTextField();
		txtCalle.setBounds(239, 6, 176, 34);
		layeredPaneDir.add(txtCalle);
		txtCalle.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(239, 40, 176, 34);
		layeredPaneDir.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setBounds(239, 79, 176, 34);
		layeredPaneDir.add(txtCiudad);
		txtCiudad.setColumns(10);
		
		txtProvincia = new JTextField();
		txtProvincia.setBounds(577, 6, 176, 34);
		layeredPaneDir.add(txtProvincia);
		txtProvincia.setColumns(10);
		
		txtPais = new JTextField();
		txtPais.setBounds(577, 40, 176, 34);
		layeredPaneDir.add(txtPais);
		txtPais.setColumns(10);
		
		txtCodPostal = new JTextField();
		txtCodPostal.setBounds(577, 79, 176, 34);
		layeredPaneDir.add(txtCodPostal);
		txtCodPostal.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(462, 13, 117, 16);
		layeredPaneDir.add(lblProvincia);
		lblProvincia.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(462, 47, 117, 16);
		layeredPaneDir.add(lblPais);
		lblPais.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblCodPostal = new JLabel("Cod. Postal");
		lblCodPostal.setBounds(462, 86, 117, 16);
		layeredPaneDir.add(lblCodPostal);
		lblCodPostal.setFont(new Font("Arial", Font.PLAIN, 20));

	}
}
