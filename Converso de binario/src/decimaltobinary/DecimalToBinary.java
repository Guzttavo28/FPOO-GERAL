package decimaltobinary;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int decimal;
		String binario;
		
		System.out.println("Digite o número Decimal: ");
		decimal = scanner.nextInt();
		
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("O número decimal é: " + decimal);
		System.out.println("Valor decimal convertido em Binário: " + binario);
		
			
		
	}
	
	
	
	
	
}
