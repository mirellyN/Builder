package ufpb.br;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String data;
	private Frete frete;
	private Funcionario funcionario;
	private List <ItemVenda> listaItens;
	private Cliente cliente;

	
	public Venda () {
		this.data = "";
		this.frete = new Frete(0);
		this.listaItens = new ArrayList<ItemVenda>(); 
		this.funcionario = new Funcionario(); 
		this.cliente = new Cliente();
		
	}
	
	public Venda(String data, Frete frete, Funcionario funcionario, List<ItemVenda> listaItens) {
		super();
		this.data = data;
		this.frete = frete;
		this.funcionario = funcionario;
		this.listaItens = listaItens;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Venda(String data) {
		super();
		this.data = data;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ItemVenda> getListaItens() {
		return listaItens;
	}
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setListaItens(List<ItemVenda> listaItens) {
		this.listaItens = listaItens;
	}

	public void addItem(ItemVenda item) {
		this.listaItens.add(item);
		
	}

	
	
	

}
