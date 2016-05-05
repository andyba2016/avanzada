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
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JTable;

public class PanelBorrarTurno extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtBuscar;
	private JTable tableTurnos;

	
	public PanelBorrarTurno() {
		setPreferredSize(new Dimension(800, 700));
		
		setLayout(null);
		setBackground(UIManager.getColor("textHighlight"));
		
		JButton btnBorrarEmpleado = new JButton("Borrar");
		btnBorrarEmpleado.setBounds(204, 648, 141, 46);
		add(btnBorrarEmpleado);
		
		JLabel lblBorrarTurno = new JLabel("Eliminar Turno");
		lblBorrarTurno.setFont(new Font("Arial", Font.BOLD, 22));
		lblBorrarTurno.setBounds(17, 6, 234, 34);
		add(lblBorrarTurno);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(93, 29));
		btnCancelar.setBounds(438, 648, 141, 46);
		add(btnCancelar);
		
		JComboBox comboBoxBuscar = new JComboBox();
		comboBoxBuscar.setModel(new DefaultComboBoxModel(new String[] {"ID", "Apelido", "Documento"}));
		comboBoxBuscar.setBounds(130, 60, 101, 46);
		add(comboBoxBuscar);
		
		JLabel lblBuscar = new JLabel("Buscar por");
		lblBuscar.setFont(new Font("Arial", Font.PLAIN, 20));
		lblBuscar.setBounds(17, 66, 117, 28);
		add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(243, 69, 189, 26);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JLabel lblListaEmpleados = new JLabel("Lista");
		lblListaEmpleados.setFont(new Font("Arial", Font.PLAIN, 20));
		lblListaEmpleados.setBounds(17, 183, 117, 28);
		add(lblListaEmpleados);
		
		tableTurnos = new JTable();
		tableTurnos.setBounds(17, 212, 777, 160);
		add(tableTurnos);

	}
}
