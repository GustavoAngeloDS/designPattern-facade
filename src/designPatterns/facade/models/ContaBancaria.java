package designPatterns.facade.models;

public class ContaBancaria {

	private Integer id;
	private Integer agencia;
	private Integer banco;
	
	private Cliente cliente;
	private Gerente gerenteResponsavel;
	
	private Double saldo; 
		
	public ContaBancaria() {}
	
	public ContaBancaria(Integer id, Integer agencia, Integer banco, Cliente cliente, Gerente gerenteResponsavel, Double saldo) {
		this.id = id;
		this.agencia = agencia;
		this.banco = banco;
		this.cliente = cliente;
		this.gerenteResponsavel = gerenteResponsavel;
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public Integer getBanco() {
		return banco;
	}
	public void setBanco(Integer banco) {
		this.banco = banco;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Gerente getGerenteResponsavel() {
		return gerenteResponsavel;
	}
	public void setGerenteResponsavel(Gerente gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}
}
