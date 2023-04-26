package br.com.fiap.teste;

import javax.swing.JOptionPane;

public class ConersaoExplicita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ler um numero do tipo double: peso da pessoa 
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
		
		//converter o peso para um float
		
		float pesoFloat = (float)peso;
		
		
		//coverter peso para um int
		
		int pesoInt = (int)peso;
		
		
		//exibir peso float e int
		
		JOptionPane.showMessageDialog(null, "Double" + peso + "Float"+ pesoFloat);
		
		
		float altura = 1.7f; //f no final, define o numero como do tipo float
		
		int i = 10;
		short s = (short) i;
	}

}
