package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias1 = new Object[5];
		
		System.out.println(referencias1.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias1[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias1[1] = cc2;	
		
		Cliente cliente = new Cliente();
		referencias1[2] = cliente;
		
		//System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println( referenciaGenerica.getNumero()  );
		
		ContaPoupanca ref = (ContaPoupanca) referencias1[1];//type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
