import java.util.Scanner;

public class Media { 
	
	String [] nomes = new String[10];
	
	Scanner objScan = new Scanner (System.in);

	public void listarAlunos() {
		
		
		
		int cont = 0;
		while(cont<nomes.length) {
			
			System.out.println("Digite o nome: ");
			nomes[cont] = objScan.next();
			cont++;
			
		}
		
		for(int indice = 0; indice < nomes.length; indice++) {
			System.out.println("Nome do Aluno(a):" + nomes[indice]);
		}

		System.out.println("Total de Alunos: " + nomes.length);
			
		
	}
	
}
		
		
	

