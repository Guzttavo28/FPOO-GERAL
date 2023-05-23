import java.util.Scanner;

public class While {

	public void SomaDeValor(){
		
		Scanner objScanner = new Scanner(System.in);
		
		int sentinela = 0;
		int soma = 0;
		
		
		while(sentinela >= 0) {
			
			System.out.println("--Bem-Vindo--");
			
			System.out.println("Digite um valor:");
			sentinela = objScanner.nextInt();
			
			if (sentinela >= 0) {
				soma += sentinela;
			}
			
		}
		System.out.println("O do valor dado é: " + soma);
		System.out.println("--Obrigado por usar nosso site--");
	}
}
