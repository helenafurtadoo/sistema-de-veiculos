package sistemaVeiculos;

public abstract class Veiculo {
	// Attributes (encapsulados)
	abstract double calcularAluguel(int dias);
	public String marca;
	public String modelo;
	public int ano;
	public double valorDiaria;
	public String placa;
	
	// Constructor
	public Veiculo(String marca, String modelo, int ano, double valorDiaria, String placa) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiaria = valorDiaria;
		this.placa = placa;
	}
	
	// getter e setters
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void Modelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void Ano(int ano) {
		this.ano = ano;
	}
	
	public double getValorDiaria() {
		return valorDiaria;
	}
	
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
