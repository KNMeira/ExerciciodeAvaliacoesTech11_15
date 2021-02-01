package exercicios11_15;
import java.util.Scanner;
public class NumeroPrimo_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numero; 
		int divisores = 0;
		int continuar = 1;
		
		while(continuar ==1) {
		
		System.out.println("Digite um número");
		System.out.println("Numero: ");
		numero = scanner.nextInt();
					
				for(int i = 1; i <= numero; i++) {
					if((numero % i) == 0) {
						divisores++;
						
					}
					
				}
				
				if(divisores <=2) {
					System.out.println("O número " + numero + " é primo");
					System.out.println();
					
				}else {
					System.out.println("O número " + numero + " não é primo");
					System.out.println();
				}
				System.out.println("Deseja continuar o programa s(1)/n(0)?");
	            continuar = scanner.nextInt();
				
				  		}
		scanner.close();
	}	
	}
	
