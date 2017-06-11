package classes;

public class Funcoes {

	public static int movimentos=0;
	
	public static int equacaoRecorrencia(int num){
		if (num<0) num*=-1;
		if(num == 0){
			return 2;
		} else {
			return 2*equacaoRecorrencia(num-1)-4;
		}
	}
	
	public static int fibonacci(int num){
		if (num == 0){
			return 0;
		} else if (num == 1){
			return 1;
		} else {
			return fibonacci(num-1)+fibonacci(num-2);
		}
	}
	
	public static int somatorio(int i){
		if(i == 1){
			return (int) (2*Math.pow(i, 2)+2*i+8); 
		} else {
			return (int) ((2*Math.pow(i, 2)+2*i+8)+ somatorio(i-1));
		}
	}
	
	public static int somatorioIterativo(int i){
		int soma=0;
		while(i>=1){
			soma+=2*Math.pow(i, 2)+2*i+8;
			i--;
		}
		return soma;
	}
	
	public static int maiorVetor(int[] vetor, int ultimoIndice, int maior){
		if(ultimoIndice==0){
			return vetor[ultimoIndice]>maior?vetor[ultimoIndice]:maior;
		} else {
			if (vetor[ultimoIndice]>maior)
				maior = vetor[ultimoIndice];
			return maiorVetor(vetor, ultimoIndice-1, maior);
		}
	}
	
	public static int menorVetor(int[] vetor, int ultimoIndice, int menor){
		if(ultimoIndice==0){
			return vetor[ultimoIndice]<menor?vetor[ultimoIndice]:menor;
		} else {
			if (vetor[ultimoIndice]<menor)
				menor = vetor[ultimoIndice];
			return maiorVetor(vetor, ultimoIndice-1, menor);
		}
	}
	
	public static void hanoi(int quantidade, int origem, int destino, int trabalho){
		if(quantidade>0){
			hanoi(quantidade-1, origem, trabalho, destino);
			mover(quantidade, origem, destino);
			movimentos++;
			hanoi(quantidade-1, trabalho, destino, origem);
		}
	}
	
	public static void mover(int quantidade, int origem, int destino){
		System.out.println("O disco "+quantidade+" movendo de " + origem + " para " + destino);
	}
}
