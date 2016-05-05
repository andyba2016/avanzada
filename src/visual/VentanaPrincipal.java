package visual;

/* NOTA: Para tratar como separados al ActionListener del ActionPerformed, 
 * hay que declarar el boton como variable global de la clase
 */


import negocio.factory.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import negocio.medico.spec.MedicoDAO;
import negocio.medico.spec.MedicoDTO;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	PanelNuevoMedico panelNuevoMedico;
	PanelModificarMedico panelModificarMedico;
	PanelNuevoEmpleado panelNuevoEmpleado;
	
	
	private MedicoDAO medDAO = FactoryDAO.getMedicoFactory(FactoryDAO.FILE);
	private MedicoDTO medico;
	
	private JMenuItem mntmNuevoMedico;
	private JMenuItem mntmModificarMedico;
	private JMenuItem mntmBorrarMedico;
	private JMenuItem mntmVerMedicos;
	private JMenuItem mntmNuevoEmpleado;
	

	public VentanaPrincipal() {
		getContentPane().setBackground(UIManager.getColor("textHighlight"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800, 750));
		
		// BARRA CON OPCIONES ARCHIVO, EMPLEADOS, MEDICOS, PACIENTES, TURNOS
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		setJMenuBar(menuBar);
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Opciones");
		mnNewMenu.add(mntmNewMenuItem_15);
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_16);
		
		// BOTONES DE EMPLEADO
		JMenu mnEmpleados = new JMenu("Empleados");
		menuBar.add(mnEmpleados);
		mntmNuevoEmpleado = new JMenuItem("Nuevo Empleado");  
		mntmNuevoEmpleado.addActionListener(this);
		mnEmpleados.add(mntmNuevoEmpleado);
		JMenuItem mntmModificarEmpleado = new JMenuItem("Modificar Empleado");
		mnEmpleados.add(mntmModificarEmpleado);
		JMenuItem mntmBorrarEmpleado = new JMenuItem("Borrar Empleado");
		mnEmpleados.add(mntmBorrarEmpleado);
		JMenuItem mntmVerEmpleados = new JMenuItem("Ver listado");
		mnEmpleados.add(mntmVerEmpleados);
		
		//BOTONES MEDICOS
		JMenu mnMedicos = new JMenu("Medicos");
		menuBar.add(mnMedicos);
		mntmNuevoMedico = new JMenuItem("Nuevo Medico");
		mntmNuevoMedico.addActionListener(this);
		mnMedicos.add(mntmNuevoMedico);
		mntmModificarMedico = new JMenuItem("Modificar Medico");
		mntmModificarMedico.addActionListener(this);
		mnMedicos.add(mntmModificarMedico);
		JMenuItem mntmBorrarMedico = new JMenuItem("Borrar Medico");
		mnMedicos.add(mntmBorrarMedico);
		JMenuItem mntmVerMedicos = new JMenuItem("Ver listado");
		mnMedicos.add(mntmVerMedicos);
		
		//BOTONES PACIENTES
		JMenu mnPacientes = new JMenu("Pacientes");
		menuBar.add(mnPacientes);
		JMenuItem mntmNuevoPaciente = new JMenuItem("Nuevo Paciente");
		mnPacientes.add(mntmNuevoPaciente);
		JMenuItem mntmModificarPaciente = new JMenuItem("Modificar Paciente");
		mnPacientes.add(mntmModificarPaciente);
		JMenuItem mntmBorrarPaciente = new JMenuItem("Borrar Paciente");
		mnPacientes.add(mntmBorrarPaciente);
		JMenuItem mntmVerPacientes = new JMenuItem("Ver listado");
		mnPacientes.add(mntmVerPacientes);
		
		//BOTONES TURNOS
		JMenu mnTurnos = new JMenu("Turnos");
		menuBar.add(mnTurnos);
		JMenuItem mntmNuevoTurno = new JMenuItem("Nuevo turno");
		mnTurnos.add(mntmNuevoTurno);
		JMenuItem mntmModificarTurno = new JMenuItem("Modificar turno");
		mnTurnos.add(mntmModificarTurno);
		JMenuItem mntmEliminarTurno = new JMenuItem("Eliminar turno");
		mnTurnos.add(mntmEliminarTurno);
		JMenuItem mntmVerTurnos = new JMenuItem("Ver turnos");
		mnTurnos.add(mntmVerTurnos);
		
		// PANELES EMPLEADOS
		panelNuevoEmpleado = new PanelNuevoEmpleado();
		
		
		// PANELES MEDICOS
		panelNuevoMedico = new PanelNuevoMedico();
		panelModificarMedico = new PanelModificarMedico();
		
		
		// PANELES PACIENTES
		
		// PANELES TURNOS
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		panelModificarMedico.setVisible(false);
		panelNuevoMedico.setVisible(false);
		panelNuevoEmpleado.setVisible(false);
		
		if(e.getSource()==mntmNuevoEmpleado){
			
			try{
			panelNuevoEmpleado.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelNuevoEmpleado);
			panelNuevoEmpleado.setVisible(true);
			System.out.println("Se abrio el panel de nuevo empleado.");
			}catch(Exception exce){
				System.out.println("Error"+exce.getCause());
			}
		}
		else if(e.getSource()==mntmNuevoMedico){
			
			panelNuevoMedico.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelNuevoMedico);
			panelNuevoMedico.setVisible(true);
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
