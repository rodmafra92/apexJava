package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import bd.Conexao;
import modelo.FilialModelo;
import modelo.FuncionarioModelo;

public class CadastrarControle {
	
	public static boolean cadastrar(FuncionarioModelo fm) {
		
		// Variavel
		boolean status = false;
		
		// SQL
		String sql = "INSERT INTO funcionario(nomeFuncionario, cargoFuncionario, turnoFuncionario) VALUES(?,?,?)";
		
		// Acessar Banco de Dados
		Conexao.iniciarConexao();
		
		// PreparedStatement
		PreparedStatement pstmt = null;
		
		// Tentativa
		try {
			pstmt = Conexao.conexao.prepareStatement(sql);
			
			
			
		}catch(Exception erro) {
			System.out.println("Falha ao tentar cadastrar"+erro.getMessage());
		}
		return status;
		
	}

	public static ArrayList<FilialModelo> listarFilial() {
		
		ArrayList<FilialModelo> filiais = new ArrayList<FilialModelo>();

		
		// SQL
		String sql="SELECT codigoFilial, nomeFilial FROM filial";
		
		Conexao.iniciarConexao();
		
		// Tentativa
		try {
			
			Statement stmt = Conexao.conexao.createStatement();
		
			
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
				FilialModelo fm = new FilialModelo(rs.getInt(1), rs.getString(2));
				filiais.add(fm);
				
			}
			
			
			
			
		}catch(Exception erro) {
			System.out.println("Falha ao obter filias "+erro.getMessage());
		}finally {
			Conexao.finalizarConexao();
		}
		

		return filiais;
	}

}
