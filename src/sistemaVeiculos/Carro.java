package sistemaVeiculos;

public class Carro extends Veiculo {
	
	private int quantidadePortas;
	
	//construtor classe filho
	public Carro(String marca, String modelo, int ano, double valorDiaria, String placa, int quantidadePortas) {
		super(marca, modelo, ano, valorDiaria, placa);
		this.quantidadePortas = quantidadePortas;
	// usar super() para chamar o construtor da classe pai (veiculo)
	}
	
	@Override
	public double calcularAluguel(int dias) {
		return(valorDiaria * dias) + 50.0; 
		// 50.0 = taxa fixa de limpeza
	}
	
	@Override 
	public String toString() {
		return super.toString() + " | Portas:" + quantidadePortas;
	}
}
