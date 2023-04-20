package br.com.fiap.bicicleta;

public class Bicicleta {

	private int aro;
	private String modelo = "caloi";
	private float peso;
	private Fabricante fabricante;

	public String retornarDetalhes() {

		return modelo + "Aro " + aro + "Peso " + peso;

	}
	
//	implementar construtor modelo e aro 

	public Bicicleta(int aro, String modelo) {
		this.aro = aro;
		this.modelo = modelo;
	}

	
	
	
	//Criar um construtor biccicleta 
	
	public Bicicleta(int aro, String modelo, float peso){
		this(aro,modelo);
//		this.aro =aro;
//		this.modelo=modelo;
		this.peso=peso;
		
		}
	
	
//	como no exemplo a cima podemos chmar um construtor dentro de um construtor

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

}
