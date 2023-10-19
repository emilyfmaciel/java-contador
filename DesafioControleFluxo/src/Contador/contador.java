package Contador;

import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		
		Scanner captura = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = captura.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = captura.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}
			catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
			}
	}		
	
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
				
				if (parametroUm>parametroDois) {
					throw new ParametrosInvalidosException();
				}
				
				int contagem = parametroDois - parametroUm +1;
				
				for (int x =1; x <= contagem; x++) {
					System.out.println("A contagem dos parametros é: "+ (parametroUm + x -1));
				}
			
		}
		
	}
	