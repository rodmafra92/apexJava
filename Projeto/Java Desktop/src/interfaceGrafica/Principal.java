package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Principal() {
		
		// Botões
		JButton btnListar = new JButton("LISTAR");
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastrar c = new Cadastrar();
				c.setVisible(true);
				
				dispose();
			}
		});
		JButton btnAlterar = new JButton("Alterar");
		JButton btnRemover = new JButton("Remover");
		
		// DefaultTableModel
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Filial");
		dtm.addColumn("Nome");
		dtm.addColumn("Cargo");
		dtm.addColumn("Turno");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbxFilial = new JComboBox();
		cbxFilial.setBounds(70, 10, 320, 21);
		contentPane.add(cbxFilial);
		
		JLabel lblFilial = new JLabel("Filial");
		lblFilial.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFilial.setBounds(10, 10, 61, 21);
		contentPane.add(lblFilial);
		
		JComboBox cbxCargo = new JComboBox();
		cbxCargo.addItem("Selecione o cargo");
		cbxCargo.addItem("DBA");
		cbxCargo.addItem("Front End");
		cbxCargo.addItem("Back End");
		cbxCargo.setBounds(70, 41, 320, 21);
		contentPane.add(cbxCargo);
		
		JComboBox cbxTurno = new JComboBox();
		cbxTurno.addItem("Selecione o turno");
		cbxTurno.addItem("Diurno");
		cbxTurno.addItem("Noturno");
		cbxTurno.setBounds(70, 72, 320, 21);
		contentPane.add(cbxTurno);
		
		
		btnCadastrar.setBounds(10, 134, 120, 21);
		contentPane.add(btnCadastrar);
		

		btnListar.setBounds(140, 103, 120, 21);
		contentPane.add(btnListar);
	
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCargo.setBounds(10, 43, 51, 19);
		contentPane.add(lblCargo);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTurno.setBounds(10, 76, 45, 13);
		contentPane.add(lblTurno);
		
		
		btnAlterar.setBounds(140, 134, 120, 21);
		contentPane.add(btnAlterar);
		
		
		btnRemover.setBounds(270, 134, 120, 21);
		contentPane.add(btnRemover);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 380, 140);
		contentPane.add(scrollPane);
		
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
	}
}
