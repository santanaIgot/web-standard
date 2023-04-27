package br.com.fiap.strings;

public class Exemplo10ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para converter os caracteres de uma string para maiúsculo é utilizado o
		// método toUpperCase;

		String nomeCompleto = "Paulo Roberto de Souza";
		String nomeMaiusculo = nomeCompleto.toUpperCase();
		System.out.println("A string (" + nomeCompleto + ") em maiusculo fica (" + nomeMaiusculo + ")");

		// Para converter os caracteres de uma string para minúsculo é utilizado o
		// método toLowerCase;

		String nome = "Paulo Roberto de Souza";
		System.out.println("A string (" + nomeCompleto + ") em minusculofica (" + nomeCompleto.toLowerCase() + ")");

	}

}
