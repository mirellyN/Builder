package ufpb.br;

public class VendaBuilder extends  Venda{
	
    private Venda venda;	
	
	
	public VendaBuilder(){
		venda = new Venda();
		 
	}
	
	public VendaBuilder data (String data) {
		venda.setData(data);
		return this;		
	}
	
	public VendaBuilder clientePf (String nome, String cpf) {
		Cliente clientePf = new ClientePf(nome, cpf); 
		venda.setCliente(clientePf);
		return this;
		
	}
	
	public VendaBuilder clientePj (String nome, String cnpj) {
		ClientePj clientePJ = new ClientePj (nome, cnpj); 
		venda.setCliente(clientePJ);
		return this;
		
	}
	
	
	public VendaBuilder frete (double valor) {
		Frete fret = new Frete(valor);
		this.venda.setFrete(fret);
		return this;
	}
	
	public VendaBuilder funcionario (String nome) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		venda.setFuncionario(funcionario);
		return this;
			
		}
	public VendaBuilder item (int quant, Produto produto) {
		ItemVenda item = new ItemVenda();
		item.setQuantidade(quant);
		item.setProduto(produto);
		venda.addItem(item);
		return this;
	}
	
	public Venda Build () {
		return this.venda;
		
	}
	
}


