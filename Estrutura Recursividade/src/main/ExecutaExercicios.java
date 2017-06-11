package main;

import classes.Funcoes;

public class ExecutaExercicios {

	public static void main(String[] args) {
		int[] vetor = {100,2,32,4,5,6,7,8,20,9,2,101};
		
		System.out.println("Equação Recursiva de 5: "+Funcoes.equacaoRecorrencia(5));
		System.out.println("Somatório do 5 na fórmula, recursivo:"+Funcoes.somatorio(5));
		System.out.println("5º Fibonacci: "+Funcoes.fibonacci(5));
		System.out.println("Somatório do 5 na fórmula, iterativo:"+Funcoes.somatorioIterativo(5));
		System.out.println("Maior valor no vetor: "+Funcoes.maiorVetor(vetor, vetor.length-1, vetor[0]));
		System.out.println("Menor valor no vetor: "+Funcoes.menorVetor(vetor, vetor.length-1, vetor[0]));
		System.out.println("\n\nHanoi com 5 pinos: ");
		Funcoes.hanoi(5,1,3,2);
		
		System.out.println("\n\nTotal de movimentos realizados deve ser (2^n)-1. Realizados "+Funcoes.movimentos+" movimentos com 5 pinos.");
		
	}

}
