package br.com.systembank;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String endere�o;
	private int telefone;
	private String email;
	
	public Cliente(String nome, String cpf, String endere�o, int telefone, String email, String profissao,
			double renda) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.email = email;
		this.profissao = profissao;
		this.renda = renda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndere�o() {
		return endere�o;
	}
	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	private String profissao;
	private double renda;
	
	

}
