package br.com.fiap.strings;

import javax.swing.JOptionPane;

public class Exemplo9Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Este método recebe como parâmetros a posição inicial (inclui) e a
//      posição final (exclui) do conjunto de caracteres a serem copiados da string original;

		String stringE = "um; dois; tres; quatro";
		
		String numeroDois = stringE.substring(4, 8);
		
		System.out.println("Numero 2: " + numeroDois);
//		
		
		//ler nome completo igor
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		
		//exibir nome 
		
		
		String nome2 = nome.substring(0, nome.indexOf("r"));
		
		//exibir sobrenome

		String nome3 = nome.substring(0, nome.indexOf("a"));
		
		
		System.out.println("O nome é" + nome2 + " "+ nome3);
	}

}
