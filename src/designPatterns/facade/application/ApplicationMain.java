package designPatterns.facade.application;

import designPatterns.facade.controllers.ContaBancariaController;
import designPatterns.facade.impl.ContaBancariaFacade;
import designPatterns.facade.models.Cliente;
import designPatterns.facade.models.ContaBancaria;
import designPatterns.facade.models.Gerente;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNome("Gustavo Angelo da Silva");
		cliente.setCpf("12345678909");
		cliente.setEndereco("Rua das flores nº 190, Bairro São Francisco, Curitiba - Paraná");
		
		Gerente gerente = new Gerente();
		gerente.setMatricula(102994);
		gerente.setNome("Gerente Teste");
		gerente.setCpf("10238798700");
		
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setId(0001);
		contaBancaria.setAgencia(2863);
		contaBancaria.setBanco(9999);
		contaBancaria.setGerenteResponsavel(gerente);
		contaBancaria.setSaldo(0.00);
		contaBancaria.setCliente(cliente);
		
		ContaBancariaController contaBancariaController = new ContaBancariaController(contaBancaria);
		/* PARA EFETIAVAR A CRIAÇÃO DA CONTA, O USUÁRIO DEVERÁ DEPOSITAR QUALQUER QUANTIA, CONSULTAR O SALDO E LOGO APÓS SACAR O QUE FOI DEPOISTADO */
		/* FORMA DE RESOLUÇÃO SEM A UTILIZAÇÃO DO PROJETO FACADE ABAIXO: */
		contaBancariaController.depositar(100.00);
		contaBancariaController.consultarSaldo();
		contaBancariaController.sacar(100.00);
		System.out.println("Efetivação de conta executada com sucesso - SEM FACADE.");
		
		System.out.println("\n************************************************\n");
		
		/* RESOLVENDO UTILIZANDO FACADE */
		ContaBancariaFacade.efetivaAberturaConta(contaBancaria, 100.00);
	}
}
