package exercicios11_15;
import java.util.Scanner;
public class Mes_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes, ano;
	     System.out.println("Digite o mês");
	     Scanner scanner;
	     scanner = new Scanner (System.in);
	     mes=scanner.nextInt();
	     System.out.println("Digite o ano");
	     ano=scanner.nextInt(); 
	     
	     
	     if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)){
	         System.out.println("O mês "+mes+"/"+ano+" tem 31 dias");
	     }
	     else if ((mes==4)||(mes==6)||(mes==9)||(mes==11)){
	         System.out.println("O mês "+mes+"/"+ano+" tem 30 dias");
	    }
	     else if ((mes==2)&&((ano%4==0) && (ano%100!=0))){
	        System.out.println("O mês "+mes+"/"+ano+" tem 29 dias");

	}
	     else System.out.println("O mês "+mes+"/"+ano+" tem 28 dias");
	     
	     scanner.close();
	   }
	
	}


