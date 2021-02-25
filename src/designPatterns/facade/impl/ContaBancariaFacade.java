package designPatterns.facade.impl;

import designPatterns.facade.controllers.ContaBancariaController;
import designPatterns.facade.models.ContaBancaria;

public class ContaBancariaFacade {
		
	public static void efetivaAberturaConta(ContaBancaria contaBancaria, Double quantidade) {
		ContaBancariaController contaBancariaController = new ContaBancariaController(contaBancaria);
		contaBancariaController.depositar(quantidade);
		contaBancariaController.consultarSaldo();
		contaBancariaController.sacar(quantidade);
		
		System.out.println("Efetivação de conta executada com sucesso - COM FACADE.");
	}
}
