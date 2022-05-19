package br.com.glandata;

public class Decisao {
    /**
     * Esta clase é responsavel por executar o programa principal
     * e mostra as opcoes de condicao com if
     * @param args recebe os argumentos  de execução
     */
	
	public static void main(String[] args) {
		
		int primeiranota = 5;
		int segundanota = 6;
        // Condição Se Menor que
//		if(primeiranota <segundanota) {
//			System.out.println("Segunda nota é maior");
//			
//		}else {
//			System.out.println("Primeira nota é maior");
//			
//		}
		
		 // Condição com negação
//		if(primeiranota != segundanota) {
//			System.out.println("É igual");
//			
//		}else {
//			System.out.println("É diferente");
//			
//		}
		//Condição com R
//		if((primeiranota > 1) && (segundanota>1)) {
//			System.out.println("Valor Positivo");
//			
//		}else {
//			System.out.println("Valor Negativo");
//			
//		}
		//Condição com OU
		if((primeiranota == 1) || (segundanota==1)) {
			System.out.println("Um dos valores é igual a 1");
			
		}else {
			System.out.println("Não tem valor igual a 1");
			
		}
		
		int hora = 20;
		
		if(hora < 10) {
		   System.out.println("Bom Dia!!");
		}else if(hora<20) {
			System.out.println("Boa Tarde||");
		}else {
			System.out.println("Boa Noite!");
		}
		
		int idade = 50;
		
		//Operador ternário
		System.out.println(idade<18 ? "Não pode dirigir" : "Pode dirigir");
		
		//exemplo 2 - Operador ternário
		String texto = "";
		
		texto = idade<18 ? "Não pode dirigir" : "Pode dirigir";
		System.out.println(texto);
			
		
		// Única instrução de retorno (Retorbo único em uma única linha)
		if(idade>=50) System.out.println("Você já faz parte da velha guarda");
	}

}
