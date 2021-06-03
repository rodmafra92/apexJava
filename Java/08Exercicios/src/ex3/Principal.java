package ex3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTable table;
	
	int indice = 0;

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
		
		// ArrayList
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Aluno");
		dtm.addColumn("Nota1");
		dtm.addColumn("Nota 2");
		dtm.addColumn("Média");
		dtm.addColumn("Situação");
		
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnRemover = new JButton("Remover");
		JButton btnCancelar = new JButton("Cancelar");
		JScrollPane scrlTabela = new JScrollPane();
		table = new JTable(dtm);
		
		// Botão Alterar
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
			String nome = txtNome.getText();
			double nota1 = Double.parseDouble(txtNota1.getText());
			double nota2 = Double.parseDouble(txtNota2.getText());
			double media = (nota1+nota2)/2;
			String situacao;
			if(media >=7) {
				situacao = "Aprovado";
			}else {
				situacao = "Reprovado";
			}
			
			// Intanciar objetos da classe aluno
			Aluno a = new Aluno(nome, nota1, nota2, media, situacao);
			
			// Alterar no ArrayList
			alunos.set(indice, a);
			
			// Limpar campos
			txtNome.setText("");
			txtNota1.setText("");
			txtNota2.setText("");
			
			txtNome.requestFocus();
			
			//Atualizar DefaultTableModel
			dtm.setRowCount(0);
			for(int i = 0; i < alunos.size(); i++) {
				dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getNota1(),
						alunos.get(i).getNota2(),
						alunos.get(i).getMedia(),
						alunos.get(i).getSituacao()
				});
			}
			table.setModel(dtm);	
				
			// Alterar Botoes
			btnCadastrar.setEnabled(true);
			btnAlterar.setEnabled(false);
			btnRemover.setEnabled(false);
			btnCancelar.setEnabled(false);	
				
			}
		});
		
		// Botão Remover
		btnRemover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Remover do ArrayList
				alunos.remove(indice);
				
				// Limpar campos
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				//Remover do ArrayList
				dtm.setRowCount(0);
				for(int i = 0; i < alunos.size(); i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getNota1(),
						alunos.get(i).getNota2(),
						alunos.get(i).getMedia(),
						alunos.get(i).getSituacao()
					});	
				}
				table.setModel(dtm);
				
				// Alterar Botoes
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		
		// Botão Cancelar
		
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				
				//Alterar Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(66, 8, 335, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 1");
		lblNewLabel_1.setBounds(10, 40, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(66, 36, 335, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 2");
		lblNewLabel_2.setBounds(10, 70, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(66, 67, 335, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNome.getText();
				double nota1 = Double.parseDouble(txtNota1.getText());
				double nota2 = Double.parseDouble(txtNota2.getText());
				double media = (nota1+nota2)/2;
				String situacao;
				if(media >=7) {
					situacao = "Aprovado";
				}else {
					situacao = "Reprovado";
				}
				
				
				// Instanciar
				Aluno a = new Aluno(nome, nota1, nota2, media, situacao);
				
				// Cadastrar no ArrayList
				alunos.add(a);
				
				// Limpar campos
				txtNome.setText("");
				txtNota1.setText("");
				txtNota2.setText("");
				
				dtm.setRowCount(0);
				for(int i=0 ; i<alunos.size();i++) {
					dtm.addRow(new Object[] {
						alunos.get(i).getNome(),
						alunos.get(i).getNota1(),
						alunos.get(i).getNota2(),
						alunos.get(i).getMedia(),
						alunos.get(i).getSituacao()
						
					});
				}
				
			}
			
		});
		btnCadastrar.setBounds(10, 98, 89, 23);
		contentPane.add(btnCadastrar);
		
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(109, 98, 89, 23);
		contentPane.add(btnAlterar);
		
	
		btnRemover.setEnabled(false);
		btnRemover.setBounds(208, 98, 89, 23);
		contentPane.add(btnRemover);
		
		
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(307, 98, 89, 23);
		contentPane.add(btnCancelar);
		
		
		scrlTabela.setBounds(10, 132, 389, 118);
		contentPane.add(scrlTabela);
		
		
		scrlTabela.setViewportView(table);
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				
				// Obter indice
				indice = table.getSelectedRow();
				
				
				// Exibir os dados dos alunos.
				txtNome.setText(alunos.get(indice).getNome());
				txtNota1.setText(String.valueOf(alunos.get(indice).getNota1()));
				txtNota2.setText(String.valueOf(alunos.get(indice).getNota2()));
				
				// Habilitar e desabilitar botoes
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnRemover.setEnabled(true);
				btnCancelar.setEnabled(true);
				
				
				
			}
		});
	}
}
