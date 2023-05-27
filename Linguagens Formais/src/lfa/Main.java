package lfa;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		Funcoes aux = new Funcoes();
		
		aux.introd();
		
		String cadeia = entrada.next();
		
		System.lineSeparator();
		
		aux.empilhaDesimpilha(cadeia);		
		
		entrada.close();		
		
	}
	
}

