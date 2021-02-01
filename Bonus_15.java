package exercicios11_15;
import java.util.Scanner;
import java.util.Arrays;
public class Bonus_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[6];
		
		for(int a = 0; a < numeros.length; a++)
			{
			System.out.println("Digite o " + (a+1) + "º numero: ");
			Scanner scanner = new Scanner(System.in);
			numeros[a] = (scanner.nextInt());
			}
		 Arrays.sort(numeros);
		 System.out.println("Ordem ordenada: ");
		 for (int b = 0; b < numeros.length; b++)
		 {
			 System.out.print(numeros[b] + " ");
			
		 }
		 
		
	}

	
}
