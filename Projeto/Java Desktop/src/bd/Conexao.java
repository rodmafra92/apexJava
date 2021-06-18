package bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	// Atributos Conexao
	public static Connection conexao = null;
	
	// Atributos para efetuar conexao
	private static final String usuario = "root";
	private static final String senha = "root102030";
	private static final String base = "empresa";
	private static final String timeZone = "?useTimezone=true&serverTimezone=UTC";
	
	// Iniciar conexão
	public static void iniciarConexao() {
		
		try {
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+ base + timeZone, usuario, senha);
			System.out.println("Conexao OK.");
		}catch(Exception erro){
			System.out.println("Falha ao estabelecer conexao "+erro.getMessage());
		}
		
	}
	
	// Finalizar conexao
	public static void finalizarConexao(){
		
		try {
			conexao.close();
		}catch(Exception erro) {
			System.out.println("Falha ao finalizar conexão"+erro.getMessage());
		}
	}
}
