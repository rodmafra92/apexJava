package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ProvaControle;
import controle.UsuarioControle;
import modelo.ProvaModelo;
import modelo.UsuarioModelo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Notas extends JFrame {
	
	// Variaveis Globais
			int codigoProva = 0;
			int codigoAluno = 0;
			int nota = 0;
			
			
			
	private JPanel contentPane;
	private JTextField txtNota;

	/**
	 * Create the frame.
	 */
	public Notas(UsuarioModelo um) {
		
		txtNota = new JTextField();
		
		
		//Obter todos os alunos
		ArrayList<UsuarioModelo> alunos = UsuarioControle.listarAlunos();
		
		// DefaultComboBoxModel
		DefaultComboBoxModel<UsuarioModelo> cbxmAlunos = new DefaultComboBoxModel<UsuarioModelo>();
		
		for(int i=0; i<alunos.size(); i++) {
			cbxmAlunos.addElement(alunos.get(i));
		}
		
		// Obter todas as provas atraves do codigo do professor
		ArrayList<ProvaModelo> provas = ProvaControle.listarProvas(um.getCodigo());
		
		// DefaultComboxModel
		DefaultComboBoxModel<ProvaModelo> cbxmProvas = new DefaultComboBoxModel<ProvaModelo>();
		
		
		
		for(int i=0 ; i<provas.size() ; i++) {
			cbxmProvas.addElement(provas.get(i));
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\apexJava\\Java\\16Escola\\imagem\\notas.png.png"));
		lblNewLabel.setBounds(72, 17, 73, 79);
		contentPane.add(lblNewLabel);
		
		JComboBox cbxProvas = new JComboBox();
		cbxProvas.setModel(cbxmProvas);
		cbxProvas.setBounds(10, 106, 202, 21);
		contentPane.add(cbxProvas);
		
		JComboBox cbxAluno = new JComboBox();
		cbxAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Código prova
				ProvaModelo pm = (ProvaModelo) cbxProvas.getSelectedItem();
				codigoProva = pm.getCodigoProva();
				
				// Código Aluno
				UsuarioModelo usm = (UsuarioModelo) cbxAluno.getSelectedItem();
				codigoAluno = usm.getCodigo();
				
				//System.out.println(ProvaControle.retornarNota(codigoProva, codigoAluno));
				
				// Nota
				nota = ProvaControle.retornarNota(codigoProva, codigoAluno);
				
				// Exibir no txt
				txtNota.setText(nota == -1 ? "" : String.valueOf(nota));
				
			}
		});
		cbxAluno.setModel(cbxmAlunos);
		cbxAluno.setBounds(10, 151, 202, 21);
		contentPane.add(cbxAluno);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Fechar o JFrame
				dispose();
				
				// Exibir o JFrame Professor
				Professor p = new Professor(um);
				p.setVisible(true);
			}
		});
		btnSair.setBounds(60, 233, 85, 21);
		contentPane.add(btnSair);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean status;
				
				// Efetuar cadastro ou Alteracao
				if(nota == -1) {
					status = ProvaControle.cadastrarNota(codigoProva, codigoAluno, Integer.parseInt(txtNota.getText()));
					// Mensagem
					JOptionPane.showMessageDialog(null, status == true ? "Cadastro efetuado.":"Falha ao cadastrar.");
				}else {
					status = ProvaControle.alterarNota(codigoProva, codigoAluno, Integer.parseInt(txtNota.getText()));
					JOptionPane.showMessageDialog(null, status == true ? "Alteração efetuada.":"Falha ao alterar.");
				}

				
				// Reset de Campos
				cbxAluno.setSelectedIndex(0);
				cbxProvas.setSelectedIndex(0);
				txtNota.setText("");
				
				
			}
		});
		btnCadastrar.setBounds(60, 213, 85, 21);
		contentPane.add(btnCadastrar);
		
		
		txtNota.setBounds(10, 184, 202, 19);
		contentPane.add(txtNota);
		txtNota.setColumns(10);
	}
}
