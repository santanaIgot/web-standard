package br.com.fiap.exercicio2.view;

import java.time.LocalDate;

import br.com.fiap.exercicio2.model.Data;
import br.com.fiap.exercicio2.model.Data.DataUtils;

public class Terminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Data instancia = new Data();
		//instanciando um dia 
		instancia.setDia(05);
		
		//instanciando mes
		instancia.setMes(07);
		
		//instanciando ano
		instancia.setAno(2003);
		
		
		System.out.println("O dia do meu aniversario é dia"+ instancia.getDia()+ "o mês é "+ instancia.getMes() + "\n"
				+ " E o ano é "+instancia.getAno());
		
		
		LocalDate data = LocalDate.now();
		String dataFormatada = DataUtils.formatarData(data);
		
		System.out.println(dataFormatada);

	}

}
