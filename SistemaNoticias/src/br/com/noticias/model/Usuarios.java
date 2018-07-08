package br.com.noticias.model;

public class Usuarios {
	int id;
	String nome;
	String email;
	String senha;
	int tipo;
	int status;
	String usuarioscol;
	SexoTipo sexo;
	
	public Usuarios(int id, String nome, String email, String senha, int tipo, int status, String usuarioscol,
			SexoTipo sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tipo = tipo;
		this.status = status;
		this.usuarioscol = usuarioscol;
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getUsuarioscol() {
		return usuarioscol;
	}
	public void setUsuarioscol(String usuarioscol) {
		this.usuarioscol = usuarioscol;
	}
	public SexoTipo getSexo() {
		return sexo;
	}
	public void setSexo(SexoTipo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", tipo=" + tipo
				+ ", status=" + status + ", usuarioscol=" + usuarioscol + ", sexo=" + sexo + ", getId()=" + getId()
				+ ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha()
				+ ", getTipo()=" + getTipo() + ", getStatus()=" + getStatus() + ", getUsuarioscol()=" + getUsuarioscol()
				+ ", getSexo()=" + getSexo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
