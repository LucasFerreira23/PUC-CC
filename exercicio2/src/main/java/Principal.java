

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Carro carro = new Carro("AAA0000", "Uno");
		if(dao.inserirCarro(carro) == true) {
			System.out.println("Inserção com sucesso -> " + carro.toString());
		}

		//Atualizar carro
		carro.setModelo("novo modelo");
		dao.atualizarCarro(carro);

		//Excluir carro
		dao.excluirCarro(carro.getPlaca());
		
		//Mostrar carros
		Carro[] carros = dao.getCarros();
		System.out.println("==== Mostrar carros === ");		
		for(int i = 0; i < carros.length; i++) {
			System.out.println(carros[i].toString());
		}
		
		dao.close();
	}
}