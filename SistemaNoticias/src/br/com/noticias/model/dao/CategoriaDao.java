package br.com.noticias.model.dao;

import br.com.noticias.model.Categoria;

public class CategoriaDao {

	
	public void inserir(Categoria categoria) {

		//Criar objeto frameworkDao para realizar conexão com banco de dados
		FrameworkDao frameworkDao = new FrameworkDao();
		
		//Realizar conexão com banco de dados
		frameworkDao.conectar();
		
		//Verificar conexão com banco de dados "db_noticias"
		if(frameworkDao.estaConectado()) {
			System.out.println("Banco de dados está conectado");
		} else {
			System.out.println("Banco de dados NÂO está conectado :'(");
		}
	}
	
	
}
