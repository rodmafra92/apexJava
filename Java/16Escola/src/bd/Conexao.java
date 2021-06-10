package bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	
	// Atributo de conexao
		public static Connection conexao = null;
		
		// Atributos para efetuar conex�o
		private static final String usuario = "root";
		private static final String senha = "root102030";
		private static final String base = "escola";
		private static final String timeZone = "?useTimezone=true&serverTimezone=UTC";
		
		// Iniciar conexao
		public static void iniciarConexao() {
			
			try {
				conexao = DriverManager.getConnection("jdbc:mysql://localhost/"+ base + timeZone, usuario, senha);
				//System.out.println(" Conex�o Ok");
			}catch(Exception erro) {
				System.out.println("Falha ao conectar " + erro.getMessage());
			}
			
		}
		
		// Finalizar conex�o
		public static void finalizarConexao() {
			
			try {
				conexao.close();
			}catch(Exception erro) {
				System.out.println("Falha ao finalizar conex�o");
			}
			
		}

}
