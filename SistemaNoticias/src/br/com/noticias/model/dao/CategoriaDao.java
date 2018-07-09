package br.com.noticias.model.dao;

//import br.com.noticias.model.Categoria;

public class CategoriaDao {

	static String stmt;
	
	public static void main(String[] args) {
//	public void inserir(Categoria categoria) {

		//Criar objeto frameworkDao para realizar conexão com banco de dados
		FrameworkDao frameworkDao = new FrameworkDao();
		
		//Realizar conexão com banco de dados
		frameworkDao.conectar();
		
		//Verificar conexão com banco de dados "db_noticias"
		if(frameworkDao.estaConectado()) {
			System.out.println("db_noticias SIM conectado :)");
		} else {
			System.out.println("db_noticias NÂO conectado :(");
		}
		
		//Preparar statement SQL

		stmt = ("insert into categoria(id, nome) values (1, 'categoria 01')");
		
		//Verificar conexão com banco de dados "db_noticias"
		if(frameworkDao.executarStatement(stmt)){
			System.out.println("db_noticias/categoria - Registro inserido com SUCESSO! :)");
		} else {
			System.out.println("db_noticias/categoria - ERRO ao inserir registro  :(");
		}
		
		
	}
	
	
}
