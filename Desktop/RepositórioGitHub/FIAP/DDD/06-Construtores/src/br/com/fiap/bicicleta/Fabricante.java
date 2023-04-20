package br.com.fiap.bicicleta;

import java.util.Scanner;

public class Fabricante {
	Scanner entrada = new Scanner(System.in);
	private String nome,cnpj;

	
//	construtor é chamado na hora da intanciacao da classe 
	public Fabricante(String nome , String cnpj) {
		
		this.nome = nome ;
		this.cnpj = cnpj;
		
//		System.out.println("Digite o nome:");
//		nome= entrada.next();
//		
//		System.out.println("Digite o nome:");
//		cnpj= entrada.next();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
