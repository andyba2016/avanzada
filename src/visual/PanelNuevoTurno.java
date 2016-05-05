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
import javax.swing.JRadioButton;

public class PanelNuevoTurno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtFechaNacimiento;
	private JTextField txtDocumento;
	private JTextField txtCuitCuil;
	private JTextField txtNombrePac;
	private JTextField txtApellidoPac;
	private JTextField txtDocumentoPac;
	private JTextField txtEmail;
	private JTextField txtNombreMed;
	private JTextField txtApellidoMed;
	private JTextField txtEspecialidadMed;
	private JTextField txtObraSocialPac;

	
	public PanelNuevoTurno() {
		setPreferredSize(new Dimension(800, 700));
		
		setLayout(null);
		setBackground(UIManager.getColor("textHighlight"));
		
		
		JLabel lblIdTurno = new JLabel("ID Turno");
		lblIdTurno.setFont(new Font("Arial", Font.PLAIN, 20));
		lblIdTurno.setBounds(17, 52, 117, 16);
		add(lblIdTurno);
		
		JLabel lblTipoTurno = new JLabel("Tipo Turno");
		lblTipoTurno.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTipoTurno.setBounds(17, 98, 158, 24);
		add(lblTipoTurno);
		
		JLabel lblSala = new JLabel("Sala");
		lblSala.setFont(new Font("Arial", Font.PLAIN, 20));
		lblSala.setBounds(17, 149, 176, 16);
		add(lblSala);
		
		JLabel lblAtendidoPor = new JLabel("Atendido por");
		lblAtendidoPor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAtendidoPor.setBounds(17, 195, 141, 16);
		add(lblAtendidoPor);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setFont(new Font("Arial", Font.PLAIN, 20));
		lblFecha.setBounds(17, 245, 117, 16);
		add(lblFecha);
		
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
		
		JLabel lblNuevoTurno = new JLabel("Nuevo Turno");
		lblNuevoTurno.setFont(new Font("Arial", Font.BOLD, 22));
		lblNuevoTurno.setBounds(17, 6, 234, 34);
		add(lblNuevoTurno);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(93, 29));
		btnCancelar.setBounds(438, 648, 141, 46);
		add(btnCancelar);
		
		JLabel lblHorario = new JLabel("Horario");
		lblHorario.setFont(new Font("Arial", Font.PLAIN, 20));
		lblHorario.setBounds(17, 287, 117, 16);
		add(lblHorario);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(239, 280, 176, 34);
		add(txtEmail);
		
		JLayeredPane layeredPaneTel = new JLayeredPane();
		layeredPaneTel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layeredPaneTel.setBounds(0, 328, 800, 123);
		add(layeredPaneTel);
		
		JLabel lblPaciente = new JLabel("Paciente");
		lblPaciente.setBounds(17, 13, 117, 16);
		layeredPaneTel.add(lblPaciente);
		lblPaciente.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNombrePac = new JLabel("Nombre");
		lblNombrePac.setBounds(145, 13, 117, 16);
		layeredPaneTel.add(lblNombrePac);
		lblNombrePac.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtNombrePac = new JTextField();
		txtNombrePac.setBounds(272, 6, 176, 34);
		layeredPaneTel.add(txtNombrePac);
		txtNombrePac.setColumns(10);
		
		JLabel lblApellidoPac = new JLabel("Apellido");
		lblApellidoPac.setBounds(145, 48, 117, 16);
		layeredPaneTel.add(lblApellidoPac);
		lblApellidoPac.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtApellidoPac = new JTextField();
		txtApellidoPac.setBounds(272, 41, 176, 34);
		layeredPaneTel.add(txtApellidoPac);
		txtApellidoPac.setColumns(10);
		
		JLabel lblDocumentoPac = new JLabel("Documento");
		lblDocumentoPac.setBounds(145, 83, 117, 16);
		layeredPaneTel.add(lblDocumentoPac);
		lblDocumentoPac.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtDocumentoPac = new JTextField();
		txtDocumentoPac.setBounds(272, 76, 176, 34);
		layeredPaneTel.add(txtDocumentoPac);
		txtDocumentoPac.setColumns(10);
		
		JLabel lblObraSocialPac = new JLabel("Obra Social");
		lblObraSocialPac.setFont(new Font("Arial", Font.PLAIN, 20));
		lblObraSocialPac.setBounds(476, 13, 117, 16);
		layeredPaneTel.add(lblObraSocialPac);
		
		txtObraSocialPac = new JTextField();
		txtObraSocialPac.setColumns(10);
		txtObraSocialPac.setBounds(603, 6, 176, 34);
		layeredPaneTel.add(txtObraSocialPac);
		
		JLayeredPane layeredPaneDir = new JLayeredPane();
		layeredPaneDir.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		layeredPaneDir.setBounds(0, 450, 800, 123);
		add(layeredPaneDir);
		
		JLabel lblMedico = new JLabel("Medico");
		lblMedico.setBounds(14, 13, 117, 16);
		layeredPaneDir.add(lblMedico);
		lblMedico.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblNombreMed = new JLabel("Nombre");
		lblNombreMed.setBounds(143, 13, 117, 16);
		layeredPaneDir.add(lblNombreMed);
		lblNombreMed.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblApellidoMed = new JLabel("Apellido");
		lblApellidoMed.setBounds(143, 47, 117, 16);
		layeredPaneDir.add(lblApellidoMed);
		lblApellidoMed.setFont(new Font("Arial", Font.PLAIN, 20));
		
		JLabel lblEspecialidadMed = new JLabel("Especialidad");
		lblEspecialidadMed.setBounds(143, 86, 117, 16);
		layeredPaneDir.add(lblEspecialidadMed);
		lblEspecialidadMed.setFont(new Font("Arial", Font.PLAIN, 20));
		
		txtNombreMed = new JTextField();
		txtNombreMed.setBounds(272, 6, 176, 34);
		layeredPaneDir.add(txtNombreMed);
		txtNombreMed.setColumns(10);
		
		txtApellidoMed = new JTextField();
		txtApellidoMed.setBounds(272, 40, 176, 34);
		layeredPaneDir.add(txtApellidoMed);
		txtApellidoMed.setColumns(10);
		
		txtEspecialidadMed = new JTextField();
		txtEspecialidadMed.setBounds(272, 79, 176, 34);
		layeredPaneDir.add(txtEspecialidadMed);
		txtEspecialidadMed.setColumns(10);
		
		JRadioButton rdbtnParticular = new JRadioButton("Particular");
		rdbtnParticular.setBounds(17, 585, 141, 23);
		add(rdbtnParticular);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Obra Social");
		rdbtnNewRadioButton.setBounds(17, 616, 141, 23);
		add(rdbtnNewRadioButton);

	}
}
