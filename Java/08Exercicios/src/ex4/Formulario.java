package ex4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuantidade;
	private JTable tabela;
	private JTextField txtMarca;
	private JTextField txtValor;

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
		
		JComboBox cbxProduto = new JComboBox();
		JButton btnAdicionar = new JButton("Adicionar");
		JButton btnLimpar = new JButton("Limpar Carrinho");
		
		// ArrayList Quantidade
				ArrayList<Quantidade> lista = new ArrayList<Quantidade>();
		
		// Produto
		Produto p1 = new Produto("Arroz 1kg", "Urbano", 4.99);
		Produto p2 = new Produto("Feijão Preto 1kg", "Caldão",10.99);
		Produto p3 = new Produto("Açucar 1kg", "União", 4.59);
		Produto p4 = new Produto("Polentina 500gr","Sinhá",2.90);
		Produto p5 = new Produto("Espaguete 500gr", "Casaredo", 3.60);
		
		// ArrayList
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		
		//ComboBox
		DefaultComboBoxModel<Produto> dtc = new DefaultComboBoxModel<Produto>();
		for(int i = 0; i < produtos.size(); i++) {
			dtc.addElement(produtos.get(i));
		}
		
		//DefaultTableModel
		DefaultTableModel dtm = new DefaultTableModel();
		dtm.addColumn("Produto");
		dtm.addColumn("Marca");
		dtm.addColumn("Quantidade");
		dtm.addColumn("Valor");
		dtm.addColumn("Valor Total");
		
		// Botão Adicionar
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Extrair produto do ComboBox
				Produto obj = (Produto) cbxProduto.getSelectedItem();
				
				// Obter Dados
				String produto = obj.getProduto();
				String marca = obj.getMarca();
				double valor = obj.getValor();
				int quantidade = Integer.parseInt(txtQuantidade.getText());
				double total = valor * quantidade;
				
				// Instanciar
				Quantidade q = new Quantidade( produto, marca, valor, quantidade, total);
				
				// Cadastrar no ArrayList
				lista.add(q);
				
				// Limpar Campo
				cbxProduto.setSelectedItem(0);
				txtQuantidade.setText("");
				
				// Atualizar a DefaultTableModel
				dtm.setRowCount(0);
				for(int i=0;i<lista.size();i++) {
					dtm.addRow(new Object[] {
							lista.get(i).getProduto(),
							lista.get(i).getMarca(),
							lista.get(i).getQuantidade(),
							lista.get(i).getValor(),
							lista.get(i).getTotal()
					});
				}
				tabela.setModel(dtm);
			}
		});
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setBounds(10, 11, 46, 14);
		contentPane.add(lblProduto);
		
		cbxProduto.setBounds(66, 7, 343, 22);
		//Adicionar
		cbxProduto.setModel(dtc);
		contentPane.add(cbxProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setBounds(10, 47, 56, 14);
		contentPane.add(lblQuantidade);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(76, 44, 39, 20);
		contentPane.add(txtQuantidade);
		txtQuantidade.setColumns(10);
		
		
		btnAdicionar.setBounds(82, 75, 89, 23);
		contentPane.add(btnAdicionar);
		
		
		btnLimpar.setBounds(222, 75, 113, 23);
		contentPane.add(btnLimpar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 109, 401, 121);
		contentPane.add(scrollPane);
		
		tabela = new JTable(dtm);
		scrollPane.setViewportView(tabela);
		
		JButton btnFinalizar = new JButton("Finalizar Compra");
		btnFinalizar.setBounds(163, 241, 111, 23);
		contentPane.add(btnFinalizar);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(125, 47, 46, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setEditable(false);
		txtMarca.setBounds(171, 44, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(267, 47, 46, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setEditable(false);
		txtValor.setBounds(323, 44, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		
		
		cbxProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produto p = (Produto) cbxProduto.getSelectedItem();
				
				txtValor.setText(String.valueOf(p.getValor()));
				txtMarca.setText(p.getMarca());
				
			}
		});
	}
}
