package br.com.noticias.model;

public class Imagens {
	int idimagens;
	String imagens;
	Categoria categoria;
	Usuarios usuario;
	
	public Imagens(int idimagens, String imagens, Categoria categoria, Usuarios usuario) {
		super();
		this.idimagens = idimagens;
		this.imagens = imagens;
		this.categoria = categoria;
		this.usuario = usuario;
	}
	
	public int getIdimagens() {
		return idimagens;
	}
	public void setIdimagens(int idimagens) {
		this.idimagens = idimagens;
	}
	public String getImagens() {
		return imagens;
	}
	public void setImagens(String imagens) {
		this.imagens = imagens;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Imagens [idimagens=" + idimagens + ", imagens=" + imagens + ", categoria=" + categoria + ", usuario="
				+ usuario + ", getIdimagens()=" + getIdimagens() + ", getImagens()=" + getImagens()
				+ ", getCategoria()=" + getCategoria() + ", getUsuario()=" + getUsuario() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
