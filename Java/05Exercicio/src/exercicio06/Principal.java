package exercicio06;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtcpf;
	private JTextField txtemail;
	private JTextField txtdata;

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
		setBounds(100, 100, 450, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblintro = new JLabel("Preencha o cadastro.");
		lblintro.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblintro.setBounds(10, 11, 259, 33);
		contentPane.add(lblintro);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 55, 46, 14);
		contentPane.add(lblNome);
		
		txtnome = new JTextField();
		txtnome.setBounds(10, 74, 163, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setBounds(10, 105, 46, 14);
		contentPane.add(lblCPF);
		
		txtcpf = new JTextField();

		txtcpf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String cpf = txtcpf.getText();
				
					if(cpf.length() < 15) {
					
					if(cpf.length()==3 || cpf.length()==7) {
						txtcpf.setText(cpf+".");
					}
					if(cpf.length()==11) {
						txtcpf.setText(cpf+"-");
					}
					
				}else {
					txtcpf.setText(cpf.substring(0, 14));
				}
			}
		});
		txtcpf.setBounds(10, 123, 163, 20);
		contentPane.add(txtcpf);
		txtcpf.setColumns(10);
		
		JLabel lblemail = new JLabel("E-mail");
		lblemail.setBounds(10, 154, 46, 14);
		contentPane.add(lblemail);
		
		txtemail = new JTextField();
		txtemail.setBounds(10, 172, 163, 20);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtnome.getText();
				
				String email = txtemail.getText();
				
				// Contar espaços
				int espacos = 0;
				int arrobas = 0;
				int especiais = 0;
				
				for(int i=0; i<email.length(); i++) {
					char caractere = email.charAt(i);
					
					if(caractere == ' ') {
						espacos++;
					}
					
					if(caractere == '@') {
						arrobas++;
					}
					
					int ascii = (int) caractere;
					
					if((ascii >= 0 && ascii <= 44) || (ascii == 47) || (ascii >= 58 && ascii <= 63) || (ascii >= 65 && ascii <= 94) || (ascii == 96) || (ascii>=123)) {
						especiais++;
					}
					
				}
				
				// Verificar se o último caractere é arroba
				boolean ultimoCaractereArroba = email.substring(email.length()-1).equals("@") ? true : false;
				
				// Posição do arroba
				int posicaoArroba = email.indexOf("@") + 1;
				
				// Verificar se há números depois do arroba
				int numerosDepoisArroba = 0;
				for(int i=posicaoArroba; i<email.length(); i++) {
					
					int carac = (int) email.charAt(i);
					
					if(carac >= 48 && carac <= 57) {
						numerosDepoisArroba++;
					}
					
				}
				
				String dataDia = txtdata.getText();
				int dia = Integer.parseInt(dataDia.substring(0, 2));
				
				String dataMes = txtdata.getText();	
				int mes = 0;
				if(Integer.parseInt(dataMes.substring(3, 4)) == 0) {
					mes = Integer.parseInt(dataMes.substring(4, 5));
				}else {
					mes = Integer.parseInt(dataMes.substring(3, 5));
				}
				
				String signo = "";
				
				if(mes == 03 && dia > 21 || mes == 04 && dia <20) {
					signo = "Áries";
				}else if(mes == 04 && dia >21 || mes == 05 && dia <20) {
					signo = "Touro";
				}else if(mes == 05 && dia >21 || mes == 06 && dia <20) {
					signo = "Gêmeo";
				}else if(mes == 06 && dia >21 || mes == 07 && dia <21) {
					signo = "Câncer";
				}else if(mes == 07 && dia >22 || mes == 8 && dia <22) {
					signo = "Leão";
				}else if(mes == 8 && dia >23 || mes == 9 && dia <22) {
					signo = "Virgem";
				}else if(mes == 9 && dia >23 || mes == 10 && dia <22) {
					signo = "Libra";
				}else if(mes == 10 && dia >23 || mes == 11 && dia <21) {
					signo = "Escorpião";
				}else if(mes == 11 && dia >22 || mes == 12 && dia <21) {
					signo = "Sagitária";
				}else if(mes == 12 && dia >22 || mes == 01 && dia <20) {
					signo = "Capricórnio";
				}else if(mes == 01 && dia >21 || mes == 02 && dia <19) {
					signo = "Aquário";
				}else{
					signo = "Peixe";
				}
				
				// Retorno
				if(espacos != 0) {
					JOptionPane.showMessageDialog(null, "O e-mail não pode ter espaços");
				}else if(arrobas != 1) {
					JOptionPane.showMessageDialog(null, "O e-mail precisa ter apenas um @");
				}else if(especiais != 0) {
					JOptionPane.showMessageDialog(null, "O e-mail não pode ter caracteres especiais");
				}else if(ultimoCaractereArroba == true) {
					JOptionPane.showMessageDialog(null, "O último caractere não pode ser @");
				}else if(numerosDepoisArroba != 0) {
					JOptionPane.showMessageDialog(null, "O e-mail não pode possuir números depois do @");
				}else {
					JOptionPane.showMessageDialog(null, "Seu signo é "+signo+"\nE-mail "+email+" é validado.");
				}

			
			}
			
		});
		btncadastrar.setBounds(47, 248, 89, 23);
		contentPane.add(btncadastrar);
		
		JLabel lbldata = new JLabel("Data");
		lbldata.setBounds(10, 203, 46, 14);
		contentPane.add(lbldata);
		
		txtdata = new JTextField();
		txtdata.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String date = txtdata.getText();
				
				if(date.length()==2 || date.length()==5) {
					txtdata.setText(date+"/");
				}
			}
		});
		txtdata.setBounds(10, 217, 163, 20);
		contentPane.add(txtdata);
		txtdata.setColumns(10);
	}
}
