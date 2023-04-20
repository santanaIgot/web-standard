package br.com.fiap.bicicleta;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		Fabricante caloi = new Fabricante("Caloi", "17316326-01");
		
		

		
//		caloi.setCnpj("93274857");
//		caloi.setNome("caloi");
		
		
		
		
//		--------------------bike---------------------------------
		Bicicleta bike = new Bicicleta(29,"veloster",207);
		
//		bike.retornarDetalhes();
//		bike.setAro(23);
//		bike.setFabricante(null);
		
		System.out.println(bike.retornarDetalhes());
		
	}

}
