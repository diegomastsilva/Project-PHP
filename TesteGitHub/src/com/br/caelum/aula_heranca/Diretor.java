package com.br.caelum.aula_heranca;

public class Diretor extends Funcionarios{
	
	private int senha;
	private int numFuncGerenciados;

	/**
	 * @param senha
	 * @param numFuncGerenciados
	 */
	public Gerente(int senha, int numFuncGerenciados) {
		this.senha = senha;
		this.numFuncGerenciados = numFuncGerenciados;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumFuncGerenciados() {
		return numFuncGerenciados;
	}

	public void setNumFuncGerenciados(int numFuncGerenciados) {
		this.numFuncGerenciados = numFuncGerenciados;
	}

	public boolean autentica(int pSenha) {

		if (pSenha == this.getSenha()) {
			System.out.println("Acesso Permitido..");
			return true;
		} else {
			System.out.println("Acesso Negado !");
			return false;
		}

	}
	
	@Override
	public String toString() {
		return  "Nome: "+this.getNome()+"\n"+
				"CPF:  "+this.getCpf()+"\n"+
				"Salario Atual: "+this.getSalario()+"\n"+
				"Bonificação Aumento: "+this.getBonificacao()+"\n"+
				"Senha: "+this.getSenha()+"\n"+
				"Numero de Funcionarios: "+this.getNumFuncGerenciados();
	}
	
	@Override	
	public double getBonificacao(){
		return this.getSalario() * 0.20;
	}
	

}
