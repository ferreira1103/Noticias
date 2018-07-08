package br.com.noticias.model;

public enum SexoTipo {
	M ("Masculino")
	,F ("Feminino");
	
	private String descricao;
	
	private SexoTipo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
