package sistemaVeiculos;

public class Caminhao extends Veiculo {

		private double capacidadeCarga;
		
		//contrutor classe filho
		public Caminhao(String marca, String modelo, int ano, double valorDiaria, String placa, double capacidadeCarga) {
			super(marca, modelo, ano, valorDiaria, placa);
			this.capacidadeCarga = capacidadeCarga;
		}
		
		@Override
		public double calcularAluguel(int dias) {
			return(valorDiaria * dias) + 200.0;
			//200.0 = taxa fxa de manutenção
		}
		
		//getter e setter
		public double getCapacidadeCarga() {
			return capacidadeCarga;}
			
		public void setCapacidadeCarga(double capacidadeCarga) {
			this.capacidadeCarga = capacidadeCarga;}
		}
			
		}
		
		
}

