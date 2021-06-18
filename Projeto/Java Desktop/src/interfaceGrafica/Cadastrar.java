package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.CadastrarControle;
import modelo.FilialModelo;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Cadastrar extends JFrame {
	
	// Varialvel Global
	
		int codigoFilial = 0;

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastrar frame = new Cadastrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastrar() {
		
		// Obter todas as Filiais
		ArrayList<FilialModelo> filial = CadastrarControle.listarFilial();
		
//		for(int i=0; i<filial.size(); i++) {
//			System.out.println(filial.get(i).getFilial());
//		}
		
		DefaultComboBoxModel<FilialModelo> cbxmFilial = new DefaultComboBoxModel<FilialModelo>();
		
		for(int i = 0; i<filial.size();i++) {
			cbxmFilial.addElement(filial.get(i));
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 198);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(81, 10, 284, 19);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JComboBox cbxCargo = new JComboBox();
		cbxCargo.addItem("Selecione o cargo");
		cbxCargo.addItem("DBA");
		cbxCargo.addItem("Front End");
		cbxCargo.addItem("Back End");
		cbxCargo.setBounds(81, 72, 284, 19);
		contentPane.add(cbxCargo);
		
		JComboBox cbxTurno = new JComboBox();
		cbxTurno.addItem("Selecione o turno");
		cbxTurno.addItem("Diurno");
		cbxTurno.addItem("Noturno");
		cbxTurno.setBounds(81, 101, 283, 21);
		contentPane.add(cbxTurno);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(3, 10, 61, 19);
		contentPane.add(lblNome);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(3, 72, 61, 19);
		contentPane.add(lblCargo);
		
		JLabel lblTurno = new JLabel("Turno");
		lblTurno.setBounds(3, 102, 68, 19);
		contentPane.add(lblTurno);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnConcluir.setBounds(45, 132, 142, 21);
		contentPane.add(btnConcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(244, 132, 142, 21);
		contentPane.add(btnCancelar);
		
		JComboBox cbxFilial = new JComboBox();
		cbxFilial.setModel(cbxmFilial);
		cbxFilial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FilialModelo fm = (FilialModelo) cbxFilial.getSelectedItem();
				codigoFilial = fm.getCodigo();
			}
		});
		cbxFilial.setBounds(81, 39, 284, 19);
		contentPane.add(cbxFilial);
		
		JLabel lvlFilia = new JLabel("Filial");
		lvlFilia.setBounds(3, 39, 68, 19);
		contentPane.add(lvlFilia);
	}

}
