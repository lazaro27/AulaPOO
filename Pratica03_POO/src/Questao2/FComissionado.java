package Questao2;

public class FComissionado extends Funcionario{
	public double percentual = 0.1;//Supondo um percentual de comissão de 10% sobre as vendas
	public double vendas = 100;
		
	
	public FComissionado(int matricula, String nome, double salario) {
		super(matricula, nome, salario);
		
	}
	
	


	public double getPercentual() {
		return percentual;
	}




	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}




	public double getVendas() {
		return vendas;
	}




	public void setVendas(double vendas) {
		this.vendas = vendas;
	}




	public double calcularProventos() { //Método presisou ser publico
			
		return this.getSalario( ) + (this.percentual * this.vendas);
	}
	

}
