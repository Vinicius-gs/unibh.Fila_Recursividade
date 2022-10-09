package Recursividade;

public class Recursividade {
	
	
	public int ordencao(int num){
		if(num == 0) {
			return 0;
		}	
		return num + ordencao(num - 1);
    }
	
	public int imprimir(int fim, int inicio) {
		if (inicio != fim) {
			System.out.print(inicio+ ", ");
			return imprimir(fim ,inicio + 1);
		} else {
			return fim ;
		}

	}
	
	public int expoente(int k, int num) {
		if (num == 1) {
			return k;
		} else {
			return k * expoente(k, num -1);
		}
	}
    

}
