package visual;

import negocio.factory.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import negocio.medico.spec.MedicoDAO;
import negocio.medico.spec.MedicoDTO;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Dimension;


public class VentanaPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	PanelGuardarMedico panelGuardarMedico;
	private JMenuItem mntmNuevoEmpleado;
	private MedicoDAO medDAO = FactoryDAO.getMedicoFactory(FactoryDAO.FILE);
	private MedicoDTO medico;
	
	private JMenuItem mntmNuevoMedico;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Opciones");
		mnNewMenu.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_16);
		
		JMenu mnNewMenu_1 = new JMenu("Empleados");
		menuBar.add(mnNewMenu_1);
		
		/*Para tratar como separados al ActionListener del ActionPerformed, 
		 * hay que declarar el boton como variable global de la clase
		 */
		
		mntmNuevoEmpleado = new JMenuItem("Nuevo Empleado");  
		mntmNuevoEmpleado.addActionListener(this);
		mnNewMenu_1.add(mntmNuevoEmpleado);
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Modificar Empleado");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Borrar Empleado");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ver listado");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Medicos");
		menuBar.add(mnNewMenu_2);
		
		mntmNuevoMedico = new JMenuItem("Agregar Medico");
		mntmNuevoMedico.addActionListener(this);
		mnNewMenu_2.add(mntmNuevoMedico);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Modificar Medico");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Borrar Medico");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Ver listado");
		mnNewMenu_2.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_3 = new JMenu("Pacientes");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Nuevo Paciente");
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Modificar Paciente");
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Borrar Paciente");
		mnNewMenu_3.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Ver listado");
		mnNewMenu_3.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_4 = new JMenu("Fichas");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Nueva Ficha");
		mnNewMenu_4.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Modificar Ficha");
		mnNewMenu_4.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("Borrar Ficha");
		mnNewMenu_4.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Ver listado");
		mnNewMenu_4.add(mntmNewMenuItem_14);
		
		panelGuardarMedico = new PanelGuardarMedico();
		panelGuardarMedico.setMaximumSize(new Dimension(32767, 40000));
		panelGuardarMedico.setVisible(false);
		getContentPane().add(panelGuardarMedico, BorderLayout.CENTER);
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mntmNuevoEmpleado){
			
			medico = medDAO.setNombre("juan");
			System.out.println("se agrego el medico "+ medico.getNombre());
		}
		else if(e.getSource()==mntmNuevoMedico){
			
			panelGuardarMedico.setVisible(true);
			System.out.println("Se abrio el panel de nuevo medico.");
			
		}
		
	}
}
