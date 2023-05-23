import java.util.Scanner;

public class Valor {
	
	int[] valores1 = new int [10];
	int[] valores2 = new int [10];
	
	Scanner objScan = new Scanner(System.in);
	
	public void Valor() {
		
		for(int indice = 0; indice < valores1.length; indice++) {
			valores1[indice] = objScan.nextInt();
			
		}
		
		System.out.println("Valores1");
		for(int indice = 0; indice < valores1.length; indice++) {
			System.out.println(valores1[indice]);
		}
		
		System.out.println("Valores2");
		for(int indice = 0; indice < valores1.length; indice++) {
			
			valores2[indice] = valores1[indice] * 3;
			System.out.println(valores2[indice]);
		}
		
		
	}

}
