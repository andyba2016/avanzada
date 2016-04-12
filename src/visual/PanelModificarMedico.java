package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Dimension;

public class PanelModificarMedico extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombreMedico;
	private JTextField txtApellidoMedico;
	private JTextField txtFechaNacimientoMedico;
	private JTextField txtDocumentoMedico;
	private JTextField txtEspecialidadMedico;
	private JTextField txtCuitCuil;

	/**
	 * Create the panel.
	 */
	public PanelModificarMedico() {
		
		setPreferredSize(new Dimension(400, 600));
		setLayout(null);
		
		
		JLabel lblModificarMedico = new JLabel("Modificar Medico");
		lblModificarMedico.setBounds(6, 6, 125, 16);
		add(lblModificarMedico);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(6, 51, 57, 16);
		add(lblNombre);
		
		txtNombreMedico = new JTextField();
		txtNombreMedico.setBounds(75, 46, 130, 26);
		add(txtNombreMedico);
		txtNombreMedico.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(6, 79, 61, 16);
		add(lblApellido);
		
		txtApellidoMedico = new JTextField();
		txtApellidoMedico.setBounds(75, 74, 130, 26);
		add(txtApellidoMedico);
		txtApellidoMedico.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(6, 107, 112, 16);
		add(lblFechaNacimiento);
		
		txtFechaNacimientoMedico = new JTextField();
		txtFechaNacimientoMedico.setBounds(130, 102, 130, 26);
		add(txtFechaNacimientoMedico);
		txtFechaNacimientoMedico.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(6, 135, 81, 16);
		add(lblDocumento);
		
		txtDocumentoMedico = new JTextField();
		txtDocumentoMedico.setBounds(99, 130, 130, 26);
		add(txtDocumentoMedico);
		txtDocumentoMedico.setColumns(10);
		
		JLabel lblEspecialidadMedico = new JLabel("Especialidad");
		lblEspecialidadMedico.setBounds(6, 163, 81, 16);
		add(lblEspecialidadMedico);
		
		txtEspecialidadMedico = new JTextField();
		txtEspecialidadMedico.setBounds(99, 158, 130, 26);
		add(txtEspecialidadMedico);
		txtEspecialidadMedico.setColumns(10);
		
		JLabel lblCuitCuilMedico = new JLabel("CUIT/CUIL");
		lblCuitCuilMedico.setBounds(6, 191, 81, 16);
		add(lblCuitCuilMedico);
		
		txtCuitCuil = new JTextField();
		txtCuitCuil.setBounds(99, 186, 130, 26);
		add(txtCuitCuil);
		txtCuitCuil.setColumns(10);
		
		JList list = new JList();
		list.setBounds(6, 246, 384, 195);
		add(list);
		
		JLabel lblListaDeMedicos = new JLabel("Lista de Medicos");
		lblListaDeMedicos.setBounds(6, 219, 112, 16);
		add(lblListaDeMedicos);

	}
}
