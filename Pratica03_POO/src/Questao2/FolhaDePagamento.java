package Questao2;

import javax.swing.JOptionPane;

public class FolhaDePagamento {

	public static void main(String[] args) {
	String op;
	int opcao;
	opcao=Integer.parseInt(op = JOptionPane.showInputDialog(null, "Escolha o tipo de Funcion�rio:\n1)Sal�rio Fixo\n2)Comiss�o\n3)Produtividade"));
	
	switch(opcao){
	case 1:
		FPadrao f1 = new FPadrao(11111,"Lazaro", 5000);
		f1.calcularProventos();
		JOptionPane.showMessageDialog(null, f1);
		break;
	case 2:
		FComissionado f2 = new FComissionado(22222, "Joao", 1000);
		f2.calcularProventos();
		JOptionPane.showMessageDialog(null,f2.toString() + "\nSalario + Comissao: R$" + f2.calcularProventos());
		break;
	case 3:
		break;
	default:
			
		
			
	
		
	}

	}

}
