package exercicio02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;

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
		setBounds(100, 100, 320, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntro = new JLabel("Informe os dados a seguir para saber seu IMC.");
		lblIntro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIntro.setBounds(10, 11, 293, 38);
		contentPane.add(lblIntro);
		
		JLabel lblPedirPeso = new JLabel("Informe seu peso.");
		lblPedirPeso.setBounds(20, 56, 111, 14);
		contentPane.add(lblPedirPeso);
		
		JLabel lblPedirAltura = new JLabel("Informe sua altura.");
		lblPedirAltura.setBounds(192, 56, 111, 14);
		contentPane.add(lblPedirAltura);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(20, 81, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(192, 81, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				double alt = Double.parseDouble(txtAltura.getText());
				double pes = Double.parseDouble(txtPeso.getText());
				
				double imc = pes/(alt*alt);
				
				if(imc < 18.5) {
					JOptionPane.showMessageDialog(null,"IMC de "+imc+".\nAbaixo do peso.");
				}else if(imc<25) {
					JOptionPane.showMessageDialog(null, "IMC de "+imc+".\nPeso normal.");
				}else if(imc<30) {
					JOptionPane.showMessageDialog(null, "IMC de "+imc+".\nacima do peso");
				}else{
					JOptionPane.showMessageDialog(null, "IMC de "+imc+".\n obesidade");
				}
			}catch(Exception erro) {
				JOptionPane.showMessageDialog(btnCalcular, "Faltou informação "+erro.getMessage());
			}	
				
				
			}
		});
		btnCalcular.setBounds(107, 111, 89, 23);
		contentPane.add(btnCalcular);
	}

}
