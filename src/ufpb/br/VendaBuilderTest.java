package ufpb.br;



import org.junit.jupiter.api.Test;

class VendaBuilderTest {

	@Test
	void testSemBuilder() {
		
		Venda venda= new Venda();
		Cliente clientePf = new ClientePf("Maria", "022.939.666.51");
		venda.setCliente(clientePf);
		Produto arroz =   new Produto("Arroz", 4.00 );
		Produto feijao =   new Produto("feijão", 8.00 );
		ItemVenda item1 = new ItemVenda(5, arroz);
		ItemVenda item2 = new ItemVenda(3, feijao);
		venda.addItem(item1);
		venda.addItem(item2);
		Funcionario funcionario= new Funcionario("Marcio");
		venda.setData("03/05/2020");
		Frete frete = new Frete(20.00);
		venda.setFrete(frete);
		venda.setFuncionario(funcionario);

	}
	
	@Test
	void testeComBuilder() {
		Produto leite= new Produto("Leite", 3.00);
		Produto soja = new Produto("soja", 7.00);
		Venda venda= new VendaBuilder()
				.data("04/02/2020")
				.clientePf("Luiz", "023.533.563.77")
				.item(3, leite)
				.item(2, soja)
				.frete(10.00)
				.funcionario ("João")
				.Build();
	
	}
}
