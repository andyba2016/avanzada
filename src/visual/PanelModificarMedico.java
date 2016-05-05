package visual;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import negocio.empleado.spec.EmpleadoDTO;
import negocio.medico.spec.MedicoDAO;
import negocio.medico.spec.MedicoDTO;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;


public class PanelModificarMedico extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFechaNacimiento;
	private JTextField txtDocumento;
	private JTextField txtCuitCuil;
	private JTextField txtEmail;
	private JTextField txtObraSocial;
	private JTextField txtPersonal;
	private JTextField txtCelular;
	private JTextField txtLaboral;
	private JTextField txtCalle;
	private JTextField txtAltura;
	private JTextField txtCiudad;
	private JTextField txtProvincia;
	private JTextField txtPais;
	private JTextField txtCodPostal;
	private JTextField textField;

	
	public PanelModificarMedico() {
		
		
		setPreferredSize(new Dimension(800, 700));
		setLayout(null);
		setBackground(UIManager.getColor("textHighlight"));
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNombre.setBounds(17, 53, 117, 16);
		add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.PLAIN, 20));
		lblApellido.setBounds(17, 92, 73, 24);
		add(lblApellido);
		
		JLabel label_2 = new JLabel("Fecha Nacimiento");
		label_2.setFont(new Font("Arial", Font.PLAIN, 20));
		label_2.setBounds(17, 143, 176, 16);
		add(label_2);
		
		JLabel label_3 = new JLabel("Documento");
		label_3.setFont(new Font("Arial", Font.PLAIN, 20));
		label_3.setBounds(17, 189, 141, 16);
		add(label_3);
		
		JLabel label_4 = new JLabel("CUIT/CUIL");
		label_4.setFont(new Font("Arial", Font.PLAIN, 20));
		label_4.setBounds(17, 239, 117, 16);
		add(label_4);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(232, 46, 176, 34);
		add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(232, 89, 176, 34);
		add(txtApellido);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(232, 136, 176, 34);
		add(txtFechaNacimiento);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(232, 182, 176, 34);
		add(txtDocumento);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setColumns(10);
		txtCuitCuil.setBounds(232, 228, 176, 34);
		add(txtCuitCuil);
		
		JLabel label_5 = new JLabel("Email");
		label_5.setFont(new Font("Arial", Font.PLAIN, 20));
		label_5.setBounds(17, 281, 117, 16);
		add(label_5);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(232, 274, 176, 34);
		add(txtEmail);
		
		JLabel lblObraSocial = new JLabel("Obra Social");
		lblObraSocial.setFont(new Font("Arial", Font.PLAIN, 20));
		lblObraSocial.setBounds(10, 585, 117, 16);
		add(lblObraSocial);
		
		txtObraSocial = new JTextField();
		txtObraSocial.setColumns(10);
		txtObraSocial.setBounds(232, 578, 176, 34);
		add(txtObraSocial);
		
		JLabel label_6 = new JLabel("Telefono:");
		label_6.setFont(new Font("Arial", Font.PLAIN, 20));
		label_6.setBounds(10, 327, 117, 16);
		add(label_6);
		
		JLabel label_7 = new JLabel("Personal");
		label_7.setFont(new Font("Arial", Font.PLAIN, 20));
		label_7.setBounds(138, 327, 117, 16);
		add(label_7);
		
		txtPersonal = new JTextField();
		txtPersonal.setColumns(10);
		txtPersonal.setBounds(232, 320, 176, 34);
		add(txtPersonal);
		
		JLabel label_8 = new JLabel("Celular");
		label_8.setFont(new Font("Arial", Font.PLAIN, 20));
		label_8.setBounds(138, 362, 117, 16);
		add(label_8);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(10);
		txtCelular.setBounds(232, 355, 176, 34);
		add(txtCelular);
		
		JLabel label_9 = new JLabel("Laboral");
		label_9.setFont(new Font("Arial", Font.PLAIN, 20));
		label_9.setBounds(138, 397, 117, 16);
		add(label_9);
		
		txtLaboral = new JTextField();
		txtLaboral.setColumns(10);
		txtLaboral.setBounds(232, 390, 176, 34);
		add(txtLaboral);
		
		JLabel label_10 = new JLabel("Direccion:");
		label_10.setFont(new Font("Arial", Font.PLAIN, 20));
		label_10.setBounds(10, 449, 117, 16);
		add(label_10);
		
		JLabel label_11 = new JLabel("Calle");
		label_11.setFont(new Font("Arial", Font.PLAIN, 20));
		label_11.setBounds(136, 449, 117, 16);
		add(label_11);
		
		JLabel label_12 = new JLabel("Altura");
		label_12.setFont(new Font("Arial", Font.PLAIN, 20));
		label_12.setBounds(136, 483, 117, 16);
		add(label_12);
		
		JLabel label_13 = new JLabel("Ciudad");
		label_13.setFont(new Font("Arial", Font.PLAIN, 20));
		label_13.setBounds(136, 522, 117, 16);
		add(label_13);
		
		txtCalle = new JTextField();
		txtCalle.setColumns(10);
		txtCalle.setBounds(232, 442, 176, 34);
		add(txtCalle);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(232, 476, 176, 34);
		add(txtAltura);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(232, 515, 176, 34);
		add(txtCiudad);
		
		txtProvincia = new JTextField();
		txtProvincia.setColumns(10);
		txtProvincia.setBounds(570, 442, 176, 34);
		add(txtProvincia);
		
		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(570, 476, 176, 34);
		add(txtPais);
		
		txtCodPostal = new JTextField();
		txtCodPostal.setColumns(10);
		txtCodPostal.setBounds(570, 515, 176, 34);
		add(txtCodPostal);
		
		JLabel label_14 = new JLabel("Provincia");
		label_14.setFont(new Font("Arial", Font.PLAIN, 20));
		label_14.setBounds(455, 449, 117, 16);
		add(label_14);
		
		JLabel label_15 = new JLabel("Pais");
		label_15.setFont(new Font("Arial", Font.PLAIN, 20));
		label_15.setBounds(455, 483, 117, 16);
		add(label_15);
		
		JLabel label_16 = new JLabel("Cod. Postal");
		label_16.setFont(new Font("Arial", Font.PLAIN, 20));
		label_16.setBounds(455, 522, 117, 16);
		add(label_16);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 316, 800, 121);
		add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(0, 436, 800, 121);
		add(layeredPane_1);
		
		JLabel lblModificarMedico = new JLabel("Modificar Medico");
		lblModificarMedico.setFont(new Font("Arial", Font.BOLD, 22));
		lblModificarMedico.setBounds(17, 6, 234, 34);
		add(lblModificarMedico);

		JButton btnGuardarMedico = new JButton("Modificar");
		btnGuardarMedico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MedicoDTO medico = new MedicoDTO();
				medico.setApellido(txtApellido.getText());		        
                medico.setFechaNacimiento(txtFechaNacimiento.getText());

				medico.guardarMedico(medico);
				System.out.println("Guardando empleado");
			}
		});
		btnGuardarMedico.setBounds(162, 648, 141, 46);
		add(btnGuardarMedico);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(93, 29));
		btnCancelar.setBounds(395, 648, 141, 46);
		add(btnCancelar);
		
		JLabel label = new JLabel("Especialidad");
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(441, 48, 117, 27);
		add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(570, 46, 176, 34);
		add(textField);


	}
}
