package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.Conexao;
import modelo.ProvaModelo;
import modelo.UsuarioModelo;

public class UsuarioControle {
	
	// Autenticar usu�rio
	public static boolean autenticar(String email, String senha) throws SQLException{
		
		// Vari�vel Boolean
		boolean existe = false;
		
		// SQL
		String sql = "SELECT COUNT(*) FROM usuarios WHERE emailUsuario=? AND senhaUsuario=?";
		
		// Acessar o banco de dados
		Conexao.iniciarConexao();
		
		// PreparedStatement
		PreparedStatement pstmt = null;
	
		// ResultSet
		ResultSet rs = null;
		
		// Tentativa
		try {
			pstmt = Conexao.conexao.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, senha);
			
			rs = pstmt.executeQuery();

			while(rs.next()) {			
			existe = rs.getInt(1) == 1 ? true : false;
			}
		
		}catch(Exception erro){
			System.out.println("Falha ao autenticar "+ erro.getMessage());
		}finally {
			rs.close();
			pstmt.close();	
			Conexao.finalizarConexao();
		}
		
		// Retorno
		return existe;
	};

	// Retornar aluno e codigo aluno
	public static ArrayList<UsuarioModelo> listarAlunos(){
		
		// ArrayList
		ArrayList<UsuarioModelo> alunos = new ArrayList<UsuarioModelo>();
		//SQL
		String sql = "SELECT codigoUsuarios,nomeUsuario FROM usuarios WHERE tipoUsuario=?";
		
		// Acessar Banco de dados
		Conexao.iniciarConexao();


		// Tentativa
		try {
			PreparedStatement pstmt = Conexao.conexao.prepareStatement(sql);
			pstmt.setInt(1, 3);
			ResultSet rs = pstmt.executeQuery();
			
			UsuarioModelo cabecalho = new UsuarioModelo(0,"Aluno");
			alunos.add(cabecalho);
			
			while(rs.next()){
				UsuarioModelo am = new UsuarioModelo(rs.getInt(1),rs.getString(2));
				alunos.add(am);
			}
			rs.close();
			pstmt.close();	
				
		}catch(Exception erro) {
			System.out.println("Falha ao encontrar aluno "+erro.getMessage());
		}finally {
			Conexao.finalizarConexao();
		}
		return alunos;
	}
	
	
	
	
	
	// Retornar um objeto usu�rio
	public static UsuarioModelo obterUsuario(String email, String senha) throws SQLException{

		
		// Variavel UsuarioModelo
		UsuarioModelo um = null;
		
		// SQL
				String sql = "SELECT * FROM usuarios WHERE emailUsuario=? AND senhaUsuario=?";
				
				// Acessar o banco de dados
				Conexao.iniciarConexao();
				
				// PreparedStatement
				PreparedStatement pstmt = null;
			
				// ResultSet
				ResultSet rs = null;
				
				// Tentativa
				try {
					pstmt = Conexao.conexao.prepareStatement(sql);
					pstmt.setString(1, email);
					pstmt.setString(2, senha);
					
					rs = pstmt.executeQuery();

					while(rs.next()) {			
						
						um = new UsuarioModelo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getInt(10));
						
					}
				
				}catch(Exception erro){
					System.out.println("Falha ao autenticar "+ erro.getMessage());
				}finally {
					rs.close();
					pstmt.close();	
					Conexao.finalizarConexao();
				}
		
		// Retorno
		return um;
		
	}

	// Cadastrar um Usu�rio
	public static boolean cadastrar(UsuarioModelo um) throws SQLException{
		
		// Vari�vel
		boolean status = false;
		
		// SQL
			String sql = "INSERT INTO usuarios (nomeUsuario, senhaUsuario, emailUsuario, bairroUsuario, ruaUsuario, numeroUsuario, complementoUsuario, telefoneUsuario, tipoUsuario) VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			// Acessar o banco de dados
			Conexao.iniciarConexao();
			
			// PreparedStatement
			PreparedStatement pstmt = null;
			
			// Tentativa
			try {
				pstmt = Conexao.conexao.prepareStatement(sql);
				pstmt.setString(1, um.getNome());
				pstmt.setString(2, um.getSenha());
				pstmt.setString(3, um.getEmail());
				pstmt.setString(4, um.getBairro());
				pstmt.setString(5, um.getRua());
				pstmt.setInt(6, um.getNumero());
				pstmt.setString(7, um.getComplemento());
				pstmt.setString(8, um.getTelefone());
				pstmt.setInt(9, um.getTipo());
				
				pstmt.execute();
				
				status = true;
			
			}catch(Exception erro){
				System.out.println("Falha ao cadastrar "+ erro.getMessage());
			}finally {
				pstmt.close();	
				Conexao.finalizarConexao();
			}
		
		// Retorno
		return status;
		
	}

	
}


