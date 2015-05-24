package com.br.caelum.aula_heranca;

public class Funcionarios {
	
	private String nome;
	private String cpf;
	private Double salario;	
	
	/**
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public Funcionarios(String nome, String cpf, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public Funcionarios(){ }
	
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":: Ficha do Funcionario :: \n"+
				"Nome: "+this.getNome()+"\n"+
				"CPF: "+this.getCpf()+"\n"+
				"Salario: "+this.getSalario();
	}
	
	//Aumento_Salario
	public double getBonificacao(){
		return this.salario * 0.10;
	}
	
	

}
