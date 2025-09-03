package sistemaVeiculos;

public class Principal {
	public static void main(String[] args) {
		int dias = 5;
			
			Veiculo carro = new Carro("Spin", "Ltz", 2014, 100.0, "ABC1234", 4);
			Veiculo moto = new Moto("Yamaha", "XTZ", 2011, 50.0, "XYZ5678", 660);
			Veiculo caminhao = new Caminhao("Volvo", "FH", 2020, 300.0, "TRK9012", 15.0);
		
		//chamar os metodos um de cada vez
		System.out.println(carro + " | Valor do aluguel: R$ " + carro.calcularAluguel(dias));
        System.out.println(moto + " | Valor do aluguel: R$ " + moto.calcularAluguel(dias));
        System.out.println(caminhao + " | Valor do aluguel: R$ " + caminhao.calcularAluguel(dias));
        
	}
}
