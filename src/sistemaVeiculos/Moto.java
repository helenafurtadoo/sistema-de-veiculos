package sistemaVeiculos;

class Moto extends Veiculo{

		private int cilindrada;
		
		//construtor classe filho
		public Moto(String marca, String modelo, int ano, double valorDiaria, String placa, int cilindrada) {
			super(marca, modelo, ano, valorDiaria, placa);
			this.cilindrada = cilindrada;
		}
		
		@Override
		public double calcularAluguel(int dias) {
			double total = valorDiaria * dias;
			return total * 0.95;
			// 0.95 = 5% de desonto
		}
		
		@Override
		public String toString() {
			return super.toString() + "| Cilindrada:" + cilindrada + "cc";
		}
}
