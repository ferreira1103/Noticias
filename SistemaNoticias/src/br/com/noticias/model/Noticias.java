package br.com.noticias.model;

//import java.util.Date;
import java.sql.Date;

public class Noticias {
	int id;
	String titulo;
	Date data;
	String texto;
	String imagem;
	Categoria categoria;
	Usuarios usuario;
	
	public Noticias(int id, String titulo, Date data, String texto, String imagem, Categoria categoria,
			Usuarios usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.data = data;
		this.texto = texto;
		this.imagem = imagem;
		this.categoria = categoria;
		this.usuario = usuario;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
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
		return "Noticias [id=" + id + ", titulo=" + titulo + ", data=" + data + ", texto=" + texto + ", imagem="
				+ imagem + ", categoria=" + categoria + ", usuario=" + usuario + ", getId()=" + getId()
				+ ", getTitulo()=" + getTitulo() + ", getData()=" + getData() + ", getTexto()=" + getTexto()
				+ ", getImagem()=" + getImagem() + ", getCategoria()=" + getCategoria() + ", getUsuario()="
				+ getUsuario() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
		
}
