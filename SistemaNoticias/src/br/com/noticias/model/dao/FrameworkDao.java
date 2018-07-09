package br.com.noticias.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Para lembrar o nome do driver, tente importar com.mysql.cj.jdbc.Driver, ou coloque um nome errado que na execução o eclipse diz o nome certo.

public class FrameworkDao {

		//Parâmetros de acesso ao banco de dados - x
		private Connection connection = null;
		private Statement statement = null;
		private ResultSet resultset = null;

		//método para conexão com banco de dados
		
//		MariaDB [db_noticias]> set password for 'testuser'@'%' = 'teste123'
//			    -> ;
//			ERROR 1372 (HY000): Password hash should be a 41-digit hexadecimal number
//			MariaDB [db_noticias]> set password for 'testuser'@'%' = password('testuser123');
//			Query OK, 0 rows affected (0.03 sec)
//
//			MariaDB [db_noticias]> commit;
//			Query OK, 0 rows affected (0.00 sec)

		//Realizar conexão com banco de dados
		public void conectar() {
			String servidor = "jdbc:mysql://localhost:3306/db_noticias";
			String usuario = "testuser";
			String senha = "testuser123";
			String driver = "com.mysql.cj.jdbc.Driver";
			try {
					Class.forName(driver);
					this.connection = DriverManager.getConnection(servidor, usuario, senha);
					//this.statement = this.connection.createStatement();
				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
					e.printStackTrace();
				}
		}
		
		//Executar Statement SQL
		public  boolean executarStatement(String stmt) {
			try {
				this.statement = this.connection.createStatement();
				statement.execute(stmt);
//				statement.executeQuery(stmt);
				//Encerrar a conexão
				return true;
			} catch (Exception e) {
				System.out.println("Statement: " + stmt);
				System.out.println("Erro: " + e.getMessage());
				e.printStackTrace();
				return false;
			}

		}

		//Testar conexão com banco de dados
		public  boolean estaConectado() {
			if(this.connection != null) {
				return true;
			} else {
				return false;
			}
		}

		//Encerrar "#statement" para a tabela do Banco de dados
		public  boolean  EncerrarStatement() {
			if(this.statement != null) {
				try {
				statement.close();
				return true;
				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
					e.printStackTrace();
					return false;
				}
			} else {
				return true;
			}
		}

		//Encerrar "#Conexão" com banco de dados
		public  boolean  EncerrarConexao() {
			if(this.connection != null) {
				try {
				connection.close();
				return true;
				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
					e.printStackTrace();
					return false;
				}
			} else {
				return true;
			}
		}

		//Encerrar "#Resultset" com banco de dados
		public  boolean  EncerrarResultset() {
			if(this.resultset != null) {
				try {
				resultset.close();
				return true;
				} catch (Exception e) {
					System.out.println("Erro: " + e.getMessage());
					e.printStackTrace();
					return false;
				}
			} else {
				return true;
			}
		}

		//Getters e Setters
		public Connection getConnection() {
			return connection;
		}
		public void setConnection(Connection connection) {
			this.connection = connection;
		}
		public Statement getStatement() {
			return statement;
		}
		public void setStatement(Statement statement) {
			this.statement = statement;
		}
		public ResultSet getResultset() {
			return resultset;
		}
		public void setResultset(ResultSet resultset) {
			this.resultset = resultset;
		}
	
}
