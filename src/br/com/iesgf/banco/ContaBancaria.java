package br.com.iesgf.banco;

public class ContaBancaria {

	String numero;
	
	double saldo;

	ContaBancaria(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	String getNumero() {
		return numero;
	}
	
	void depositar(double montante) {
		this.saldo += montante;
	}
	
	void sacar(double montante) {
		this.saldo -= montante;
	}
	
	double getSaldo() {
		return saldo;
	}

}
