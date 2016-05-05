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
import javax.swing.JTable;

import java.awt.Dimension;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private MedicoDAO medDAO = FactoryDAO.getMedicoFactory(FactoryDAO.FILE);
	private MedicoDTO medico;
	
	// declaracion de paneles
	private PanelNuevoEmpleado panelNuevoEmpleado;
	private PanelNuevoMedico panelNuevoMedico;
	private PanelNuevoPaciente panelNuevoPaciente;
	private PanelNuevoTurno panelNuevoTurno;
	
	private PanelModificarEmpleado panelModificarEmpleado;
	private PanelModificarMedico panelModificarMedico;
	private PanelModificarPaciente panelModificarPaciente;
	private PanelModificarTurno panelModificarTurno;
	
	private PanelBorrarEmpleado panelBorrarEmpleado;
	private PanelBorrarMedico panelBorrarMedico;
	private PanelBorrarPaciente panelBorrarPaciente;
	private PanelBorrarTurno panelBorrarTurno;
	
	private PanelVerEmpleado panelVerEmpleado;
	private PanelVerMedico panelVerMedico;
	private PanelVerPaciente panelVerPaciente;
	private PanelVerTurno panelVerTurno;
	
	
	// declaracion de botones del menu
	private JMenuItem mntmNuevoEmpleado;
	private JMenuItem mntmNuevoMedico;
	private JMenuItem mntmNuevoPaciente;
	private JMenuItem mntmNuevoTurno;
	
	private JMenuItem mntmModificarEmpleado;
	private JMenuItem mntmModificarMedico;
	private JMenuItem mntmModificarPaciente;
	private JMenuItem mntmModificarTurno;
	
	private JMenuItem mntmBorrarEmpleado;
	private JMenuItem mntmBorrarMedico;
	private JMenuItem mntmBorrarPaciente;
	private JMenuItem mntmEliminarTurno;
	
	private JMenuItem mntmVerEmpleados;
	private JMenuItem mntmVerMedicos;
	private JMenuItem mntmVerPacientes;
	private JMenuItem mntmVerTurnos;
	

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
		mntmModificarEmpleado = new JMenuItem("Modificar Empleado");
		mntmModificarEmpleado.addActionListener(this);
		mnEmpleados.add(mntmModificarEmpleado);
		mntmBorrarEmpleado = new JMenuItem("Borrar Empleado");
		mntmBorrarEmpleado.addActionListener(this);
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
		mntmBorrarMedico = new JMenuItem("Borrar Medico");
		mntmBorrarMedico.addActionListener(this);
		mnMedicos.add(mntmBorrarMedico);
		JMenuItem mntmVerMedicos = new JMenuItem("Ver listado");
		mnMedicos.add(mntmVerMedicos);
		
		//BOTONES PACIENTES
		JMenu mnPacientes = new JMenu("Pacientes");
		menuBar.add(mnPacientes);
		mntmNuevoPaciente = new JMenuItem("Nuevo Paciente");
		mntmNuevoPaciente.addActionListener(this);
		mnPacientes.add(mntmNuevoPaciente);
		mntmModificarPaciente = new JMenuItem("Modificar Paciente");
		mntmModificarPaciente.addActionListener(this);
		mnPacientes.add(mntmModificarPaciente);
		mntmBorrarPaciente = new JMenuItem("Borrar Paciente");
		mntmBorrarPaciente.addActionListener(this);
		mnPacientes.add(mntmBorrarPaciente);
		JMenuItem mntmVerPacientes = new JMenuItem("Ver listado");
		mnPacientes.add(mntmVerPacientes);
		
		//BOTONES TURNOS
		JMenu mnTurnos = new JMenu("Turnos");
		menuBar.add(mnTurnos);
		mntmNuevoTurno = new JMenuItem("Nuevo turno");
		mntmNuevoTurno.addActionListener(this);
		mnTurnos.add(mntmNuevoTurno);
		mntmModificarTurno = new JMenuItem("Modificar turno");
		mntmModificarTurno.addActionListener(this);
		mnTurnos.add(mntmModificarTurno);
		mntmEliminarTurno = new JMenuItem("Eliminar turno");
		mntmEliminarTurno.addActionListener(this);
		mnTurnos.add(mntmEliminarTurno);
		JMenuItem mntmVerTurnos = new JMenuItem("Ver turnos");
		mnTurnos.add(mntmVerTurnos);
		
		// PANELES EMPLEADOS
		panelNuevoEmpleado = new PanelNuevoEmpleado();
		panelModificarEmpleado = new PanelModificarEmpleado();
		panelBorrarEmpleado = new PanelBorrarEmpleado();
		panelVerEmpleado = new PanelVerEmpleado();
		
		// PANELES MEDICOS
		panelNuevoMedico = new PanelNuevoMedico();
		panelModificarMedico = new PanelModificarMedico();
		panelBorrarMedico = new PanelBorrarMedico();
		panelVerMedico = new PanelVerMedico();
		
		// PANELES PACIENTES
		panelNuevoPaciente = new PanelNuevoPaciente();
		panelModificarPaciente = new PanelModificarPaciente();
		panelBorrarPaciente = new PanelBorrarPaciente();
		panelVerPaciente = new PanelVerPaciente();
		
		// PANELES TURNOS
		panelNuevoTurno = new PanelNuevoTurno();
		panelModificarTurno = new PanelModificarTurno();
		panelBorrarTurno = new PanelBorrarTurno();
		panelVerTurno = new PanelVerTurno();
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		panelNuevoEmpleado.setVisible(false);
		panelNuevoMedico.setVisible(false);
		panelNuevoPaciente.setVisible(false);
		panelNuevoTurno.setVisible(false);
		panelModificarEmpleado.setVisible(false);
		panelModificarMedico.setVisible(false);
		panelModificarPaciente.setVisible(false);
		panelModificarTurno.setVisible(false);
		panelBorrarEmpleado.setVisible(false);
		panelBorrarMedico.setVisible(false);
		panelBorrarPaciente.setVisible(false);
		panelBorrarTurno.setVisible(false);
	
		
		if(e.getSource()==mntmNuevoEmpleado){
			
			try{
			panelNuevoEmpleado.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelNuevoEmpleado);
			panelNuevoEmpleado.setVisible(true);
			System.out.println("se abrio el panel de nuevo empleado.");
			}catch(Exception exce){
				System.out.println("Error"+exce.getCause());
			}
		}
		else if(e.getSource()==mntmNuevoMedico){
			
			panelNuevoMedico.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelNuevoMedico);
			panelNuevoMedico.setVisible(true);
			System.out.println("se abrio el panel de nuevo medico.");
			
		}
		else if(e.getSource()==mntmNuevoPaciente){
			
			panelNuevoPaciente.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelNuevoPaciente);
			panelNuevoPaciente.setVisible(true);
			System.out.println("se abrio el panel de nuevo paciente");
		}
		else if(e.getSource()==mntmNuevoTurno){
			
			panelNuevoTurno.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelNuevoTurno);
			panelNuevoTurno.setVisible(true);
			System.out.println("se abrio el panel de nuevo turno");
		}
		else if(e.getSource()==mntmModificarEmpleado){
			
			panelModificarEmpleado.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelModificarEmpleado);
			panelModificarEmpleado.setVisible(true);
			System.out.println("se abrio el panel de modificar empleado");
		}
		else if(e.getSource()==mntmModificarMedico){
			
			panelModificarMedico.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelModificarMedico);
			panelModificarMedico.setVisible(true);
			System.out.println("se abrio el panel de modificar medico");
		}
		else if(e.getSource()==mntmModificarPaciente){
			
			panelModificarPaciente.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelModificarPaciente);
			panelModificarPaciente.setVisible(true);
			System.out.println("se abrio el panel de modificar paciente");
		}
		else if(e.getSource()==mntmModificarTurno){
	
			panelModificarTurno.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelModificarTurno);
			panelModificarTurno.setVisible(true);
			System.out.println("se abrio el panel de modificar turno");
		}
		else if (e.getSource()==mntmBorrarEmpleado) {
			
			panelBorrarEmpleado.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelBorrarEmpleado);
			panelBorrarEmpleado.setVisible(true);
			System.out.println("se abrio el panel de modificar turno");
		}
		else if (e.getSource()==mntmBorrarMedico) {
			
			panelBorrarMedico.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelBorrarMedico);
			panelBorrarMedico.setVisible(true);
			System.out.println("se abrio el panel de modificar turno");
		}
		else if (e.getSource()==mntmBorrarPaciente) {
			
			panelBorrarPaciente.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelBorrarPaciente);
			panelBorrarPaciente.setVisible(true);
			System.out.println("se abrio el panel de modificar turno");
		}
		else if (e.getSource()==mntmEliminarTurno) {
			
			panelBorrarTurno.setPreferredSize(new Dimension(400, 800));
			getContentPane().add(panelBorrarTurno);
			panelBorrarTurno.setVisible(true);
			System.out.println("se abrio el panel de modificar turno");
		}

	}
}
