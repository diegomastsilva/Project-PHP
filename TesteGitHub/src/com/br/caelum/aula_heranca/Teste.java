package com.br.caelum.aula_heranca;

public class Teste {
	
	public static void main(String[] args) {
		
		//Criando novo Funcionario
		Funcionarios objFunc1 = new Funcionarios("Fulano","02234-777",3000.000);	
		
		//Criando Diretor
		Diretor objDiretor1 = new Diretor(1223, 50 );
		
		objDiretor1.setNome("Diego Silva");
		objDiretor1.setSalario(70000.000);
		//Exibindo Dados do Diretor
		//Usando Metodo de Socrista
		System.out.println(objDiretor1.toString());
		
				
	}
	

}
