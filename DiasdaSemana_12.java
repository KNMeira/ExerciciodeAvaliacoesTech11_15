package exercicios11_15;

import javax.swing.JOptionPane;

public class DiasdaSemana_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaração de variáveis
		int dias;
		String d;
		
		dias = Integer.parseInt(JOptionPane.showInputDialog ("Entre com um número de 1 a 7"));
		
		switch (dias) {
		case 1:
			d = "Domingo";
			break;
		
		case 2: 
			d = "Segunda";
			break; 		
		case 3:
			d = "Terça";
			break;		
		case 4:
			d = "Quarta";
			break;		
		case 5:
			d = "Quinta";
			break;
		case 6:
			d = "Sexta";
			break;
		case 7: 
			d = "Sábado";
			break;
		
			 
		default:
			d = "Dia inválido";
			break;
		}
		JOptionPane.showMessageDialog(null, "Dia escolhido foi " +d );

}}
