package br.com.noticias.model;

import java.sql.Date;

public class Comentarios {
	int id;
	Date data;
	String texto;
	Usuarios usuario;
	Noticias noticias;
	
	public Comentarios(int id, Date data, String texto, Usuarios usuario, Noticias noticias) {
		super();
		this.id = id;
		this.data = data;
		this.texto = texto;
		this.usuario = usuario;
		this.noticias = noticias;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	public Noticias getNoticias() {
		return noticias;
	}
	public void setNoticias(Noticias noticias) {
		this.noticias = noticias;
	}
	
	@Override
	public String toString() {
		return "Comentarios [id=" + id + ", data=" + data + ", texto=" + texto + ", usuario=" + usuario + ", noticias="
				+ noticias + ", getId()=" + getId() + ", getData()=" + getData() + ", getTexto()=" + getTexto()
				+ ", getUsuario()=" + getUsuario() + ", getNoticias()=" + getNoticias() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

