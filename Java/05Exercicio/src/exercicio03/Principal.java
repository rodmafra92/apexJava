package exercicio03;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtReal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntro = new JLabel("Informe a moeda que deseja converter.");
		lblIntro.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIntro.setBounds(10, 27, 286, 39);
		contentPane.add(lblIntro);
		
		JComboBox Cripto = new JComboBox();
		Cripto.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma moeda", "Bitcoin", "Litecoin", "Dogecoin", "XRPcoin"}));
		Cripto.setBounds(150, 93, 134, 22);
		contentPane.add(Cripto);
		
		txtReal = new JTextField();
		txtReal.setBounds(24, 94, 86, 20);
		contentPane.add(txtReal);
		txtReal.setColumns(10);
		
		JLabel lblRS = new JLabel("R$");
		lblRS.setBounds(10, 97, 46, 14);
		contentPane.add(lblRS);
		
		JLabel lblPara = new JLabel("para");
		lblPara.setBounds(120, 97, 36, 14);
		contentPane.add(lblPara);
		
		JButton btnConvert = new JButton("Converter");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			try {
				int moeda = Cripto.getSelectedIndex();
				double pila = Double.parseDouble(txtReal.getText());
				
				if(moeda==1) {
					JOptionPane.showMessageDialog(btnConvert, (pila*208864.23));
				}else if(moeda==2) {
					JOptionPane.showMessageDialog(btnConvert, (pila*1057.73));
				}else if (moeda==3) {
				JOptionPane.showMessageDialog(btnConvert, (pila*1.84));
				}else if(moeda==4){
					JOptionPane.showMessageDialog(btnConvert, (pila*4.94));
				}else {
					JOptionPane.showMessageDialog(btnConvert, "Selecione uma moeda");
				}
			}catch(Exception erro){
				JOptionPane.showMessageDialog(btnConvert, "Erro de validação "+erro.getMessage());
			}
				
			}
		});
		btnConvert.setBounds(90, 148, 97, 23);
		contentPane.add(btnConvert);
	}
}
