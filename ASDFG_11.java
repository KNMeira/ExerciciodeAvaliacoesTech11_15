package exercicios11_15;
import java.util.Scanner;
public class ASDFG_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner scanner =  new Scanner(System.in);
		String palavra = scanner.next();
		String digitepalavra = "";
		for(int i = palavra.length() -1; i>=0; i--) {
			digitepalavra = digitepalavra + Character.toString(palavra.charAt(i));
			
			
		}
		
		System.out.println(digitepalavra);
		
		scanner.close();
	
	}

}
