package br.com.iesgf.banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteContaBancaria {

	@Test
	void numeroDaContaCorrente() {
		ContaBancaria contaBancaria = new ContaBancaria("38473-2", 1000.0);
		assertEquals("38473-2", contaBancaria.getNumero());
	}
	
	@Test
	void saldoInicialDaContaCorrente() {
		ContaBancaria contaBancaria = new ContaBancaria("38473-2", 1000.0);
		assertEquals(1000.0, contaBancaria.getSaldo());
	}
	
	@Test
	void saqueDeduzMontanteDoSaldo() {
		ContaBancaria contaBancaria = new ContaBancaria("38473-2", 1000.0);
		contaBancaria.sacar(100.0);
		assertEquals(900.0, contaBancaria.getSaldo());
	}
	
	@Test
	void depositoAcresceMontanteDoSaldo() {
		ContaBancaria contaBancaria = new ContaBancaria("38473-2", 1000.0);
		contaBancaria.depositar(100.0);
		assertEquals(1100.0, contaBancaria.getSaldo());
	}

}
