package br.com.fiap.exercicio2.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {

	int dia, mes, ano;

	public class DataUtils {
		public static String formatarData(LocalDate data) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return data.format(formatter);
		}
	}

	
	
	// o método vai atribuir 1 ao atributo dia se ele for maior oou menor que 1
	// caso contrario o metodo vai atribuir o valor recebido ao como argumento ao
	// atributo dia
	public int Dia(int dia) {

		if (dia < 1 || dia > 31) {
			this.dia = 1;
		} else {
			this.dia = dia;
		}

		return dia;

	}

	public int Mes(int mes) {

		if (mes < 1 || mes > 12) {
			this.mes = 1;
		} else {
			this.mes = mes;
		}

		return mes;

	}
	
	
	public int Ano(int ano) {

		if (ano < 0) {
			this.ano = 2023;//inicializa em 2023
		} else {
			this.ano = ano;
		}

		return ano;

	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	

	
}
