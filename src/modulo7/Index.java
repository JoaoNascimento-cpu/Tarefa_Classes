package modulo7;

public class Index {
	public static void main(String[] args) {

		//Instanciando objetos
		Motorista motorista = new Motorista();
		Carro carro = new Carro();
		//Importando os métodos

			//Motorista
		System.out.println("=========Dados do Motorista=========");
		System.out.println(motorista.getId());
		System.out.println(motorista.getNome());
		System.out.println(motorista.getEndereco());

			//Carro
		System.out.println("=========Dados do Veículo=========");
		System.out.println(carro.getPlaca());
		System.out.println(carro.getMarca());
	}
}
