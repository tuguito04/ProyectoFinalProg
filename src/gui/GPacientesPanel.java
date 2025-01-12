package gui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;

public class GPacientesPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField nameTF;
	private JTextField surnameTF;
	private JTextField birthTF;
	private JTextField neighborhoodTF;
	private JTextField stateTF;
	private JTextField diseaseTF;
	private JTable table;
	private JTextField searchTF;

	/**
	 * Create the panel.
	 */
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public GPacientesPanel() {
		
		setBackground(new Color(238, 238, 238));
		setBounds(0, 0, screenSize.width-250, screenSize.height-40);
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, screenSize.width-250, screenSize.height-40);
		scrollPane.setBackground(new Color(238, 238, 238));
		add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(null);
		
		JLabel title = new JLabel("Añadir pacientes");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		title.setBounds(10, 11, 241, 48);
		panel.add(title);
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(new Color(0, 128, 192));
		namePanel.setBounds(50, 100, 130, 50);
		panel.add(namePanel);
		namePanel.setLayout(null);
		
		JLabel nameLbl = new JLabel("Nombre:");
		nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nameLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		nameLbl.setForeground(new Color(255, 255, 255));
		nameLbl.setBounds(0, 0, 130, 50);
		namePanel.add(nameLbl);
		
		nameTF = new JTextField();
		nameTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		nameTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		nameTF.setBounds(180, 100, 300, 50);
		panel.add(nameTF);
		nameTF.setColumns(10);
		
		JPanel surnamePanel = new JPanel();
		surnamePanel.setLayout(null);
		surnamePanel.setBackground(new Color(0, 128, 192));
		surnamePanel.setBounds(50, 200, 130, 50);
		panel.add(surnamePanel);
		
		JLabel surnameLbl = new JLabel("Apellido:");
		surnameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		surnameLbl.setForeground(Color.WHITE);
		surnameLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		surnameLbl.setBounds(0, 0, 130, 50);
		surnamePanel.add(surnameLbl);
		
		surnameTF = new JTextField();
		surnameTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		surnameTF.setColumns(10);
		surnameTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		surnameTF.setBounds(180, 200, 300, 50);
		panel.add(surnameTF);
		
		JPanel birthPanel = new JPanel();
		birthPanel.setLayout(null);
		birthPanel.setBackground(new Color(0, 128, 192));
		birthPanel.setBounds(530, 100, 200, 50);
		panel.add(birthPanel);
		
		JLabel birthLbl = new JLabel("Fecha Nacimiento:");
		birthLbl.setHorizontalAlignment(SwingConstants.CENTER);
		birthLbl.setForeground(Color.WHITE);
		birthLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		birthLbl.setBounds(0, 0, 200, 50);
		birthPanel.add(birthLbl);
		
		birthTF = new JTextField();
		birthTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		birthTF.setColumns(10);
		birthTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		birthTF.setBounds(730, 100, 200, 50);
		panel.add(birthTF);
		
		JPanel neighborhoodPanel = new JPanel();
		neighborhoodPanel.setLayout(null);
		neighborhoodPanel.setBackground(new Color(0, 128, 192));
		neighborhoodPanel.setBounds(530, 200, 100, 50);
		panel.add(neighborhoodPanel);
		
		JLabel neighborhoodLbl = new JLabel("Sector:");
		neighborhoodLbl.setHorizontalAlignment(SwingConstants.CENTER);
		neighborhoodLbl.setForeground(Color.WHITE);
		neighborhoodLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		neighborhoodLbl.setBounds(0, 0, 100, 50);
		neighborhoodPanel.add(neighborhoodLbl);
		
		neighborhoodTF = new JTextField();
		neighborhoodTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		neighborhoodTF.setColumns(10);
		neighborhoodTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		neighborhoodTF.setBounds(630, 200, 200, 50);
		panel.add(neighborhoodTF);
		
		JPanel statePanel = new JPanel();
		statePanel.setLayout(null);
		statePanel.setBackground(new Color(0, 128, 192));
		statePanel.setBounds(875, 200, 140, 50);
		panel.add(statePanel);
		
		JLabel stateLbl = new JLabel("Provincia:");
		stateLbl.setHorizontalAlignment(SwingConstants.CENTER);
		stateLbl.setForeground(Color.WHITE);
		stateLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		stateLbl.setBounds(0, 0, 140, 50);
		statePanel.add(stateLbl);
		
		stateTF = new JTextField();
		stateTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		stateTF.setColumns(10);
		stateTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		stateTF.setBounds(1015, 200, 200, 50);
		panel.add(stateTF);
		
		JPanel diseasePanel = new JPanel();
		diseasePanel.setLayout(null);
		diseasePanel.setBackground(new Color(0, 128, 192));
		diseasePanel.setBounds(50, 300, 250, 50);
		panel.add(diseasePanel);
		
		JLabel diseaseLbl = new JLabel("Malestar / Enfermedad:");
		diseaseLbl.setHorizontalAlignment(SwingConstants.CENTER);
		diseaseLbl.setForeground(Color.WHITE);
		diseaseLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		diseaseLbl.setBounds(0, 0, 250, 50);
		diseasePanel.add(diseaseLbl);
		
		diseaseTF = new JTextField();
		diseaseTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		diseaseTF.setColumns(10);
		diseaseTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		diseaseTF.setBounds(300, 300, 300, 50);
		panel.add(diseaseTF);
		
		JComboBox gender = new JComboBox();
		gender.setBackground(new Color(255, 255, 255));
		gender.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		gender.setFont(new Font("Roboto Condensed", Font.BOLD, 22));
		gender.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Femenino"}));
		gender.setBounds(646, 300, 184, 48);
		panel.add(gender);
		
		JPanel addBtn = new JPanel();
		addBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				addBtn.setBackground(new Color(50, 142, 227));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				addBtn.setBackground(new Color(0, 128, 192));
			}
		});
		addBtn.setBackground(new Color(0, 128, 192));
		addBtn.setBounds(875, 300, 219, 48);
		panel.add(addBtn);
		addBtn.setLayout(null);
		
		JLabel addLbl = new JLabel("Agregar paciente");
		addLbl.setBounds(0, 0, 219, 48);
		addBtn.add(addLbl);
		addLbl.setHorizontalAlignment(SwingConstants.CENTER);
		addLbl.setForeground(Color.WHITE);
		addLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		
		JScrollPane tableScrollPane = new JScrollPane();
		tableScrollPane.setBounds(50, 450, 1165, 369);
		panel.add(tableScrollPane);
		
		table = new JTable();
		table.setShowVerticalLines(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "C\u00E9dula", "Nombre", "Apellido", "G\u00E9nero", "Fecha Nacimiento", "Tel\u00E9fono", "Direcci\u00F3n", "Enfermedad"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tableScrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(50, 365, 723, 3);
		panel.add(separator);
		
		JPanel searchPanel = new JPanel();
		searchPanel.setLayout(null);
		searchPanel.setBackground(new Color(0, 128, 192));
		searchPanel.setBounds(50, 384, 250, 50);
		panel.add(searchPanel);
		
		JLabel searchLbl = new JLabel("Buscar por teléfono:");
		searchLbl.setHorizontalAlignment(SwingConstants.CENTER);
		searchLbl.setForeground(Color.WHITE);
		searchLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		searchLbl.setBounds(0, 0, 250, 50);
		searchPanel.add(searchLbl);
		
		searchTF = new JTextField();
		searchTF.setFont(new Font("Roboto Condensed", Font.BOLD, 18));
		searchTF.setColumns(10);
		searchTF.setBorder(new LineBorder(new Color(0, 128, 192), 3));
		searchTF.setBounds(300, 384, 300, 50);
		panel.add(searchTF);
		
		JPanel searchBtn = new JPanel();
		searchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				searchBtn.setBackground(new Color(50, 142, 227));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				searchBtn.setBackground(new Color(0, 128, 192));
			}
		});
		searchBtn.setLayout(null);
		searchBtn.setBackground(new Color(0, 128, 192));
		searchBtn.setBounds(599, 384, 50, 50);
		panel.add(searchBtn);
		
		JLabel searchIcon = new JLabel("");
		searchIcon.setIcon(new ImageIcon(GPacientesPanel.class.getResource("/gui/images/lupa (1).png")));
		searchIcon.setHorizontalAlignment(SwingConstants.CENTER);
		searchIcon.setForeground(Color.WHITE);
		searchIcon.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		searchIcon.setBounds(0, 0, 50, 50);
		searchBtn.add(searchIcon);
		
		JPanel editBtn = new JPanel();
		editBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				editBtn.setBackground(new Color(50, 142, 227));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				editBtn.setBackground(new Color(0, 128, 192));
			}
		});
		editBtn.setLayout(null);
		editBtn.setBackground(new Color(0, 128, 192));
		editBtn.setBounds(744, 384, 219, 48);
		panel.add(editBtn);
		
		JLabel editLbl = new JLabel("Editar paciente");
		editLbl.setHorizontalAlignment(SwingConstants.CENTER);
		editLbl.setForeground(Color.WHITE);
		editLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		editLbl.setBounds(0, 0, 219, 48);
		editBtn.add(editLbl);
		
		JPanel delBtn = new JPanel();
		delBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				delBtn.setBackground(new Color(50, 142, 227));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				delBtn.setBackground(new Color(0, 128, 192));
			}
		});
		delBtn.setLayout(null);
		delBtn.setBackground(new Color(0, 128, 192));
		delBtn.setBounds(996, 384, 219, 48);
		panel.add(delBtn);
		
		JLabel delLbl = new JLabel("Eliminar paciente");
		delLbl.setHorizontalAlignment(SwingConstants.CENTER);
		delLbl.setForeground(Color.WHITE);
		delLbl.setFont(new Font("Roboto Condensed", Font.BOLD, 24));
		delLbl.setBounds(0, 0, 219, 48);
		delBtn.add(delLbl);
		
	}
}
