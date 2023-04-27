package br.com.fiap.strings;

public class ExemploComparacaoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare duas strings
		
		
		String nome = "Igot";
		String nome2 = "igot";
		
		// O equals vai igualar as strings , "==" não funciona para string ele vai comparar end de memoria
		//equals vai comparar o texto
		
		
		if(nome.equals(nome2)) {
			System.out.println("O nome inteiro é:");
		}else {
			System.out.println("nomes diferentes");
		}
		
		
		//validar se nome tem mais de 5 caracteres
		
		int nome1 = nome.length();
		
		if(nome1 > 5) {
			System.out.println("tem mais que 5 caracter");
		}else {
			System.out.println("não tem");
		}
	}

}
