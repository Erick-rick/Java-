package br.com.systembank;

public class Conta {
	
	private int numero;
	private int agencia;
	private int Cod_Cliente;
	private double saldo;
	
	public Conta(int numero, int agencia, int cod_Cliente, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		Cod_Cliente = cod_Cliente;
		this.saldo = saldo;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getCod_Cliente() {
		return Cod_Cliente;
	}
	public void setCod_Cliente(int cod_Cliente) {
		Cod_Cliente = cod_Cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
