package Questao2;

public class FProdutividade extends Funcionario {
	private double valor;
	private int produção;
	
	


	public FProdutividade(int matricula, String nome, double salario, double valor, int produção) {
		super(matricula, nome, salario);
		this.valor = valor;//Supondo R$1,00 por produção 
		this.produção = produção;//Produção devera ser digitado pelo usuário
	}




	public double getValor() {
		return valor;
	}




	public void setValor(double valor) {
		this.valor = valor;
	}




	public int getProdução() {
		return produção;
	}




	public void setProdução(int produção) {
		this.produção = produção;
	}




	public double calcularProventos() {
		this.setSalario(this.getSalario() + (valor * produção));
		return this.getSalario();
	}

}
