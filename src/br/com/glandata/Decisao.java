package br.com.glandata;

public class Decisao {
    /**
     * Esta clase � responsavel por executar o programa principal
     * e mostra as opcoes de condicao com if
     * @param args recebe os argumentos  de execu��o
     */
	
	public static void main(String[] args) {
		
		int primeiranota = 5;
		int segundanota = 6;
        // Condi��o Se Menor que
//		if(primeiranota <segundanota) {
//			System.out.println("Segunda nota � maior");
//			
//		}else {
//			System.out.println("Primeira nota � maior");
//			
//		}
		
		 // Condi��o com nega��o
//		if(primeiranota != segundanota) {
//			System.out.println("� igual");
//			
//		}else {
//			System.out.println("� diferente");
//			
//		}
		//Condi��o com R
//		if((primeiranota > 1) && (segundanota>1)) {
//			System.out.println("Valor Positivo");
//			
//		}else {
//			System.out.println("Valor Negativo");
//			
//		}
		//Condi��o com OU
		if((primeiranota == 1) || (segundanota==1)) {
			System.out.println("Um dos valores � igual a 1");
			
		}else {
			System.out.println("N�o tem valor igual a 1");
			
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
		
		//Operador tern�rio
		System.out.println(idade<18 ? "N�o pode dirigir" : "Pode dirigir");
		
		//exemplo 2 - Operador tern�rio
		String texto = "";
		
		texto = idade<18 ? "N�o pode dirigir" : "Pode dirigir";
		System.out.println(texto);
			
		
		// �nica instru��o de retorno (Retorbo �nico em uma �nica linha)
		if(idade>=50) System.out.println("Voc� j� faz parte da velha guarda");
	}

}
