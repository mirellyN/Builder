package ufpb.br;

public class Frete {
	
	private double frete;

	public Frete(double frete) {
		super();
		this.frete = frete;
	}
	
	public Frete() {
		this.frete = 0.0;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}
		
	
}
