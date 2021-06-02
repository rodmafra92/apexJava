package ex2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTurma;
	private JTable tabela;
	
	// Indice
	int indice = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {

		
		// ArrayList - Aluno
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		
		// Componentes
		JComboBox cbxCurso = new JComboBox();
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnAlterar = new JButton("Alterar");
		JButton btnRemover = new JButton("Remover");
		JButton btnCancelar = new JButton("Cancelar");
		
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Nome");
		dtm.addColumn("Curso");
		dtm.addColumn("Valor");
		dtm.addColumn("Turma");
		
		btnAlterar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Extrair nome do curso e valor (JComboBox)
				Cursos obj = (Cursos) cbxCurso.getSelectedItem();				
				
				// Obter dados
				String nome= txtNome.getText();
				String curso = obj.getNome();
				double valor = obj.getValor();
				String turma = txtTurma.getText();
				
				// Instanciar objeto da classe Aluno
				Aluno a = new Aluno(nome, curso, valor, turma);
				
				// Alterar no ArrayList
				alunos.set(indice, a);
				
				// Limpar campos
				txtNome.setText("");
				cbxCurso.setSelectedItem(0);
				txtTurma.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e Jtable
				dtm.setRowCount(0);
				for (int i = 0 ; i<alunos.size(); i++) {
					dtm.addRow(new Object[]{
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma()
					});
				}
				tabela.setModel(dtm);
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		

		
		btnRemover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Remover do ArrayList
				alunos.remove(indice);
				
				// Limpar campos
				txtNome.setText("");
				cbxCurso.setSelectedItem(0);
				txtTurma.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e Jtable
				dtm.setRowCount(0);
				for (int i = 0 ; i<alunos.size(); i++) {
					dtm.addRow(new Object[]{
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma()
					});
				}
				tabela.setModel(dtm);
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
	
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				// Set dos campos
				txtNome.setText("");
				cbxCurso.setSelectedIndex(0);
				txtTurma.setText("");
				
				// Botões
				btnCadastrar.setEnabled(true);
				btnAlterar.setEnabled(false);
				btnRemover.setEnabled(false);
				btnCancelar.setEnabled(false);
			}
		});
		
		// Carregar Cursos
		Cursos c1 = new Cursos("Java", 5000);
		Cursos c2 = new Cursos("C#", 4800);
		Cursos c3 = new Cursos("Python", 3300);
		Cursos c4 = new Cursos("Front-End", 4500);
		Cursos c5 = new Cursos("PHP", 3500);
		
		// ArrayList
		ArrayList<Cursos> cursos = new ArrayList<Cursos>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		cursos.add(c5);
		
		// Modelo ComboBox
		DefaultComboBoxModel<Cursos> dtc = new DefaultComboBoxModel<Cursos>();
		for(int i=0; i < cursos.size(); i++) {
			dtc.addElement(cursos.get(i));
		}
		
		
		
		
		
		JScrollPane barraRolagem = new JScrollPane();
		tabela = new JTable(dtm);
		
		tabela.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				
				// Obter indice
				indice = tabela.getSelectedRow();
				
				// Exibir os dados no formulário
				txtNome.setText(alunos.get(indice).getNome());
				txtTurma.setText(alunos.get(indice).getTurma());
				
				String cursoSelecionado = alunos.get(indice).getCurso();
				for(int i = 0 ; i<cursos.size(); i++) {
					if(cbxCurso.getSelectedItem().equals(cursos.get(i).getClass())) {
						cbxCurso.setSelectedIndex(i);
						break;
					}
				}
				
				// Habilidar e desabilitar botões
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnRemover.setEnabled(true);
				btnCancelar.setEnabled(true);
				
			}
		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(28, 22, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(28, 57, 46, 14);
		contentPane.add(lblCurso);
		
		JLabel lblTurma = new JLabel("Turma");
		lblTurma.setBounds(28, 92, 46, 14);
		contentPane.add(lblTurma);
		
		txtNome = new JTextField();
		txtNome.setBounds(84, 19, 290, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtTurma = new JTextField();
		txtTurma.setBounds(84, 89, 290, 20);
		contentPane.add(txtTurma);
		txtTurma.setColumns(10);
		
		
		cbxCurso.setBounds(84, 54, 290, 20);
		cbxCurso.setModel(dtc);
		contentPane.add(cbxCurso);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				// Extrair nome do curso e valor (JComboBox)
				Cursos obj = (Cursos) cbxCurso.getSelectedItem();				
				
				// Obter dados
				String nome= txtNome.getText();
				String curso = obj.getNome();
				double valor = obj.getValor();
				String turma = txtTurma.getText();
				
				// Instanciar objeto da classe Aluno
				Aluno a = new Aluno(nome, curso, valor, turma);
				
				// Cadastrar no ArrayList
				alunos.add(a);
				
				// Limpar campos
				txtNome.setText("");
				cbxCurso.setSelectedItem(0);
				txtTurma.setText("");
				
				// Cursor no campo nome
				txtNome.requestFocus();
				
				// Atualizar DefaultTableModel e Jtable
				dtm.setRowCount(0);
				for (int i = 0 ; i<alunos.size(); i++) {
					dtm.addRow(new Object[]{
						alunos.get(i).getNome(),
						alunos.get(i).getCurso(),
						alunos.get(i).getValor(),
						alunos.get(i).getTurma()
					});
				}
				tabela.setModel(dtm);
			}
		});
		btnCadastrar.setBounds(10, 120, 89, 23);
		contentPane.add(btnCadastrar);
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(109, 120, 89, 23);
		contentPane.add(btnAlterar);
		
		btnRemover.setEnabled(false);
		btnRemover.setBounds(208, 120, 89, 23);
		contentPane.add(btnRemover);
		
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(307, 120, 89, 23);
		contentPane.add(btnCancelar);
		
		
		barraRolagem.setBounds(10, 175, 389, 175);
		contentPane.add(barraRolagem);
		
		
		barraRolagem.setViewportView(tabela);
	}
}
