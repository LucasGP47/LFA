package lfa;

public class Funcoes {
	
	public Funcoes() {
		
	}
	
	public void introd() {
		System.out.println("Alfabetos Aceitos: {a,b}" + "\n");
		System.out.print("Informe a cadeia: ");
	}
	
	public void empilhaDesimpilha(String cadeia) {
		Pilha pilha = new Pilha(cadeia.length());
		
		char[] aux = new char[cadeia.length()];
		
		char[] arrayfinal = new char[cadeia.length()*2];
		
		int contador = 0;
		
		boolean f = false;
		
		System.out.println("///////////////////////////////////////////////////////////"+ "\n" + "Empilhando... ");
		for(int i = 0; i < cadeia.length(); i++) {
			aux[i] = cadeia.charAt(i);
			arrayfinal[i]= cadeia.charAt(i);
			
			if(aux[i] != 'a' && aux[i] != 'b') {
				System.out.println(aux[i] + " não pertence ao alfabeto! Cadeia Negada!");
				f = true;
				break;
			} else {			
				contador++;
				pilha.push(aux[i]);
			}
			
		}
		
		if(!f) {
			
			System.out.println("Desempilhando... ");
			for(int i = cadeia.length(); i < (cadeia.length() + contador); i++) {
				arrayfinal[i]= pilha.pop();
				if(arrayfinal[i] == 'z') {
					System.out.println("Pilha vazia. ");
				}
			}
			
			System.out.println("///////////////////////////////////////////////////////////" + "\n" +"Palavra final: ");
			for (int i = 0; i < cadeia.length() * 2; i++) {
	            if (i == cadeia.length()) {
	                System.out.print("X");
	            }
	            System.out.print(arrayfinal[i]);
	        }
		}
			
		}
			
}
