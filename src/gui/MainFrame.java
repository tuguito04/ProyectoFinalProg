package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel sidebar;
	private JPanel topbar;
	
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public MainFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel bg = new JPanel();
		bg.setLayout(null);
		bg.setBackground(new Color(238, 238, 238));
		bg.setBounds(0, 0, 1200, 800);
		contentPane.add(bg);
		
		topbar = new JPanel();
		topbar.setBackground(new Color(0, 71, 130));
		topbar.setBounds(0, 0, 1200, 40);
		bg.add(topbar);
		
		JPanel exitBtn = new JPanel();
		exitBtn.setBounds(1160, 0, 40, 40);
		exitBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitBtn.setBackground(new Color(0, 90, 164));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				exitBtn.setBackground(new Color(0, 71, 130));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		exitBtn.setBackground(new Color(0, 71, 130));
		exitBtn.setLayout(null);
		
		JLabel exitIcon = new JLabel("");
		exitIcon.setBounds(10, 10, 20, 20);
		exitBtn.add(exitIcon);
		exitIcon.setHorizontalTextPosition(SwingConstants.CENTER);
		exitIcon.setPreferredSize(new Dimension(40, 40));
		exitIcon.setHorizontalAlignment(SwingConstants.CENTER);
		exitIcon.setIcon(new ImageIcon(MainFrame.class.getResource("/gui/x (1).png")));
		
		JPanel maxBtn = new JPanel();
		maxBtn.setBounds(1120, 0, 40, 40);
		maxBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				maxBtn.setBackground(new Color(0, 90, 164));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				maxBtn.setBackground(new Color(0, 71, 130));
			}
			@Override
			public void mouseClicked(MouseEvent e) {

				if (getExtendedState() != MainFrame.MAXIMIZED_BOTH) {
					setExtendedState(MainFrame.MAXIMIZED_BOTH);
					topbar.setBounds(0, 0, 1600, 40);
				
				} else {
					setExtendedState(MainFrame.NORMAL);
				}
			}
		});
		maxBtn.setBackground(new Color(0, 71, 130));
		maxBtn.setLayout(null);
		
		JLabel maxIcon = new JLabel("");
		
		maxIcon.setForeground(new Color(255, 255, 255));
		maxIcon.setBounds(5, 5, 30, 30);
		maxBtn.add(maxIcon);
		maxIcon.setIcon(new ImageIcon(MainFrame.class.getResource("/gui/maximizar (2) (2).png")));
		topbar.setLayout(null);
		topbar.add(exitBtn);
		topbar.add(maxBtn);
		bg.setLayout(null);
		
		sidebar = new JPanel();
		sidebar.setBackground(new Color(27, 85, 139));
		sidebar.setBounds(0, 0, 250, 800);
		sidebar.setPreferredSize(null);
		bg.add(sidebar);
		sidebar.setLayout(null);
		
		JSeparator line = new JSeparator();
		line.setBounds(20, 126, 210, 3);
		sidebar.add(line);
		
		JLabel hospital = new JLabel("HOSPITAL DR. TUGO");
		hospital.setHorizontalAlignment(SwingConstants.CENTER);
		hospital.setForeground(Color.WHITE);
		hospital.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
		hospital.setBounds(0, 91, 250, 27);
		sidebar.add(hospital);
		
		JPanel bienvenida = new JPanel();
		bienvenida.setBackground(new Color(50, 142, 227));
		bienvenida.setBounds(0, 200, 250, 60);
		sidebar.add(bienvenida);
		bienvenida.setLayout(null);
		
		JLabel bienvenidaLbl = new JLabel("Bienvenida");
		bienvenidaLbl.setForeground(new Color(255, 255, 255));
		bienvenidaLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		bienvenidaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		bienvenidaLbl.setBounds(0, 0, 250, 60);
		bienvenida.add(bienvenidaLbl);
		
		JPanel gPacientes = new JPanel();
		gPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gPacientes.setBackground(new Color(50, 142, 227));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				gPacientes.setBackground(new Color(33, 131, 222));
			}
		});
		gPacientes.setBackground(new Color(33, 131, 222));
		gPacientes.setBounds(0, 260, 250, 60);
		sidebar.add(gPacientes);
		gPacientes.setLayout(null);
		
		JLabel gPacientesLbl = new JLabel("Gestión de pacientes");
		gPacientesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		gPacientesLbl.setForeground(Color.WHITE);
		gPacientesLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		gPacientesLbl.setBounds(0, 0, 250, 60);
		gPacientes.add(gPacientesLbl);
		
		JPanel gPersonal = new JPanel();
		gPersonal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gPersonal.setBackground(new Color(50, 142, 227));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				gPersonal.setBackground(new Color(33, 131, 222));
			}
		});
		gPersonal.setBackground(new Color(33, 131, 222));
		gPersonal.setBounds(0, 320, 250, 60);
		sidebar.add(gPersonal);
		gPersonal.setLayout(null);
		
		JLabel gPersonalLbl = new JLabel("Gestión de personal");
		gPersonalLbl.setHorizontalAlignment(SwingConstants.CENTER);
		gPersonalLbl.setForeground(Color.WHITE);
		gPersonalLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		gPersonalLbl.setBounds(0, 0, 250, 60);
		gPersonal.add(gPersonalLbl);
		
		JPanel gInventario = new JPanel();
		gInventario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gInventario.setBackground(new Color(50, 142, 227));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				gInventario.setBackground(new Color(33, 131, 222));
			}
		});
		gInventario.setBackground(new Color(33, 131, 222));
		gInventario.setBounds(0, 380, 250, 60);
		sidebar.add(gInventario);
		gInventario.setLayout(null);
		
		JLabel gInventarioLbl = new JLabel("Gestión de inventario");
		gInventarioLbl.setHorizontalAlignment(SwingConstants.CENTER);
		gInventarioLbl.setForeground(Color.WHITE);
		gInventarioLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		gInventarioLbl.setBounds(0, 0, 250, 60);
		gInventario.add(gInventarioLbl);
		
		JPanel facturacionPagos = new JPanel();
		facturacionPagos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				facturacionPagos.setBackground(new Color(50, 142, 227));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				facturacionPagos.setBackground(new Color(33, 131, 222));
			}
		});
		facturacionPagos.setBackground(new Color(33, 131, 222));
		facturacionPagos.setBounds(0, 440, 250, 60);
		sidebar.add(facturacionPagos);
		facturacionPagos.setLayout(null);
		
		JLabel facturacionPagosLbl = new JLabel("Facturación y pagos");
		facturacionPagosLbl.setHorizontalAlignment(SwingConstants.CENTER);
		facturacionPagosLbl.setForeground(Color.WHITE);
		facturacionPagosLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		facturacionPagosLbl.setBounds(0, 0, 250, 60);
		facturacionPagos.add(facturacionPagosLbl);
		
		JPanel gVentas = new JPanel();
		gVentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gVentas.setBackground(new Color(50, 142, 227));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				gVentas.setBackground(new Color(33, 131, 222));
			}
		});
		gVentas.setBackground(new Color(33, 131, 222));
		gVentas.setBounds(0, 500, 250, 60);
		sidebar.add(gVentas);
		gVentas.setLayout(null);
		
		JLabel gVentasLbl = new JLabel("Gestión de ventas");
		gVentasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		gVentasLbl.setForeground(Color.WHITE);
		gVentasLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		gVentasLbl.setBounds(0, 0, 250, 60);
		gVentas.add(gVentasLbl);
		
		JPanel gReportes = new JPanel();
		gReportes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				gReportes.setBackground(new Color(50, 142, 227));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				gReportes.setBackground(new Color(33, 131, 222));
			}
		});
		gReportes.setBackground(new Color(33, 131, 222));
		gReportes.setBounds(0, 560, 250, 60);
		sidebar.add(gReportes);
		gReportes.setLayout(null);
		
		JLabel gReportesLbl = new JLabel("Generación de reportes");
		gReportesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		gReportesLbl.setForeground(Color.WHITE);
		gReportesLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 20));
		gReportesLbl.setBounds(0, 0, 250, 60);
		gReportes.add(gReportesLbl);
		
		
		setUndecorated(true);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}