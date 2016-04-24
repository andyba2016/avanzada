package visual;

import negocio.factory.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Console;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import negocio.medico.spec.MedicoDAO;
import negocio.medico.spec.MedicoDTO;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Toolkit;


public class VentanaPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	PanelGuardarMedico panelGuardarMedico;
	PanelModificarMedico panelModificarMedico;
	PanelGuardarEmpleado panelGuardarEmpleado;
	
	
	private MedicoDAO medDAO = FactoryDAO.getMedicoFactory(FactoryDAO.FILE);
	private MedicoDTO medico;
	
	private JMenuItem mntmNuevoMedico;
	private JMenuItem mntmModificarMedico;
	private JMenuItem mntmBorrarMedico;
	private JMenuItem mntmVerMedicos;
	private JMenuItem mntmNuevoEmpleado;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setPreferredSize(new Dimension(500, 400));
		
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
		
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Borrar Empleado");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ver listado");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Medicos");
		menuBar.add(mnNewMenu_2);
		
		mntmNuevoMedico = new JMenuItem("Agregar Medico");
		mntmNuevoMedico.addActionListener(this);
		mnNewMenu_2.add(mntmNuevoMedico);
		
		
		mntmModificarMedico = new JMenuItem("Modificar Empleado");
		mntmModificarMedico.addActionListener(this);
		mnNewMenu_2.add(mntmModificarMedico);
		
		
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
		panelModificarMedico = new PanelModificarMedico();
		
		panelGuardarEmpleado = new PanelGuardarEmpleado();
		
		panelGuardarMedico.setVisible(false);
		panelModificarMedico.setVisible(false);
		panelGuardarEmpleado.setVisible(false);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		panelModificarMedico.setVisible(false);
		panelGuardarMedico.setVisible(false);
		panelGuardarEmpleado.setVisible(false);
		
		if(e.getSource()==mntmNuevoEmpleado){
			
			try{
			panelGuardarEmpleado.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelGuardarEmpleado);
			panelGuardarEmpleado.setVisible(true);
			System.out.println("Se abrio el panel de nuevo empleado.");
			}catch(Exception exce){
				System.out.println("Error"+exce.getCause());
			}
		}
		else if(e.getSource()==mntmNuevoMedico){
			
			panelGuardarMedico.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelGuardarMedico);
			panelGuardarMedico.setVisible(true);
			System.out.println("Se abrio el panel de nuevo medico.");
			
		}
		else if(e.getSource()==mntmModificarMedico){
			
			panelModificarMedico.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelModificarMedico);
			panelModificarMedico.setVisible(true);
			System.out.println("se abrio el panel de modificar medico");
		}
		
	}
}
