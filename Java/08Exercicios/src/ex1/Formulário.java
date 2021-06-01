package ex1;

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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulário extends JFrame {
	
	ArrayList<Pessoa> vetor = new ArrayList<Pessoa>();

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtidade;
	private JTextField txtcidade;
	private JTable tblPessoas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulário frame = new Formulário();
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
	public Formulário() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(41, 28, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(41, 59, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(41, 95, 46, 14);
		contentPane.add(lblCidade);
		
		txtnome = new JTextField();
		txtnome.setBounds(87, 25, 304, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtidade = new JTextField();
		txtidade.setBounds(87, 56, 304, 20);
		contentPane.add(txtidade);
		txtidade.setColumns(10);
		
		txtcidade = new JTextField();
		txtcidade.setBounds(87, 92, 304, 20);
		contentPane.add(txtcidade);
		txtcidade.setColumns(10);
		
		DefaultTableModel dtm = new DefaultTableModel();
		tblPessoas = new JTable(dtm);
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				String nome = txtnome.getText();
				int idade = Integer.parseInt(txtidade.getText());
				String cidade = txtcidade.getText();
				
				// Criar objeto
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
				// Adicionar ArrayList
				vetor.add(p);
				
				// Limpar o DefaultTableModel
				dtm.setRowCount(0);
				
				// Cadastrar dados no DefaultTableModel
				for(int i = 0; i < vetor.size(); i++){
					dtm.addRow(new Object[] {
							vetor.get(i).getNome(),
							vetor.get(i).getIdade(),
							vetor.get(i).getCidade(),
					});
				}
				
				// Atualizar DefaultTableModel no componente JTable
				tblPessoas.setModel(dtm);
				
				// exibir contagem de cadastro
				System.out.println(vetor.size());
				
				// Limpar os campos
				txtnome.setText("");
				txtidade.setText("");
				txtcidade.setText("");
			}
		});
		btncadastrar.setBounds(183, 142, 89, 23);
		contentPane.add(btncadastrar);
		
		
		dtm.addColumn("Nome");
		dtm.addColumn("Idade");
		dtm.addColumn("Cidade");
		
		JScrollPane scrlTabela = new JScrollPane();
		scrlTabela.setBounds(41, 205, 354, 165);
		contentPane.add(scrlTabela);
		
		
		
		scrlTabela.setViewportView(tblPessoas);
	}
}
