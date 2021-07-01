package introducao;

import javax.swing.*;


//°F = °C × 1, 8 + 32
//°C = (°F − 32) ÷ 1, 8

public class desafio01 {
	public static void main (String[] args) {
		double temperatura = 25;
		String name = "Ed";
		
//		name = JOptionPane.showInputDialog("Digite teu nome:");
//		temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da temperatura em C° para conversão:"));
		System.out.println("Olá "+name);
		System.out.println("Em kelvin: "+  (temperatura+273.15)+"K°");
		temperatura = (temperatura*1.8)+32;
		System.out.println("Em Fahrenheit: "+temperatura+"F°");
		
		
		
	}
}
