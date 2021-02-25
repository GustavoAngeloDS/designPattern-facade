package designPatterns.facade.controllers;

import designPatterns.facade.models.Cliente;
import designPatterns.facade.models.ContaBancaria;
import designPatterns.facade.models.Gerente;

public class ContaBancariaController {
		
	ContaBancaria contaBancaria;
	
	public ContaBancariaController(ContaBancaria contaBancariaReferencia) {
		contaBancaria = contaBancariaReferencia;
	}
	
	public void consultarSaldo() {
		System.out.println("O saldo da conta corrente é: R$"+contaBancaria.getSaldo());
	}
	
	public void depositar(Double valorDeposito) {
		double saldoAtual = contaBancaria.getSaldo();
		contaBancaria.setSaldo(saldoAtual + valorDeposito);
		System.out.println("Deposito realizado com sucesso.");
	}
	
	public void sacar(Double quantidadeSaque) {
		double saldoAtual = contaBancaria.getSaldo();
		if(quantidadeSaque > saldoAtual) {
			System.out.println("Saque negado. O valor solicitado é superior ao valor contido na conta");
		}else {
			contaBancaria.setSaldo(saldoAtual - quantidadeSaque);
			System.out.println("Saque realizado com sucesso.");
		}
	}
	
}
