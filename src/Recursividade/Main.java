package Recursividade;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursividade ob = new Recursividade();		
		
		// 1 - Crie uma função recursiva que receba um número  inteiro positivo N e calcule o somatório dos números  de 1 a N.
		System.out.println("Ordenação: "+ob.ordencao(5)); 
		
		// 2 - Faça uma função recursiva que receba um número  inteiro positivo N e imprima todos os números  naturais de 0 até N em ordem crescente.
		System.out.println(ob.imprimir(5, 1));
		
		// 3 - Crie um programa, que contenha uma função  recursiva que receba dois inteiros positivos k e n e  calcule kn. Utilize apenas multiplicações. O programa  principal deve solicitar ao usuário os valores de k e n  e imprimir o resultado da chamada da função.
		System.out.println("Expoente: " +ob.expoente(3, 5) );

	}

}
