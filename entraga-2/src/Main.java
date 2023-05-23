import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner objScanner = new Scanner(System.in);
		
		Enunciado1 objEnunciado1 = new Enunciado1();
		Enunciado2 objEnunciado2 = new Enunciado2();	
		Enunciado3 objEnunciado3 = new Enunciado3();
		Enunciado4 objEnunciado4 = new Enunciado4();
		Enunciado5 objEnunciado5 = new Enunciado5();
		
		
		/*Enunciado 1*/
//        System.out.println("--Bem-Vindo ao Enunciado1--");
//		
//		System.out.println("Digite o N1: ");
//		objEnunciado1.setN1(objScanner.nextInt());
//		
//		System.out.println("Digite o N2: ");
//		objEnunciado1.setN2(objScanner.nextInt());
//		
//		objEnunciado1.exibirMaior();
//		
//		System.out.println("--Obrigado por utilizar nosso site--");
//		
		/*Enunciado 2*/
//		System.out.println("--Bem-Vindo ao Enunciado2--");
		
//		System.out.println("Digite o 1°Número: ");
//		objEnunciado2.setN1(objScanner.nextInt());
//		
		
//		System.out.println("Digite o 2°Número: ");
//		objEnunciado2.setN2(objScanner.nextInt());
//		
//		System.out.println("Digite o 3°Número: ");
//		objEnunciado2.setN3(objScanner.nextInt());
//		
//		objEnunciado2.exibirOMaior();
//		
//		System.out.println("--Obrigado por utilizar nosso site--");
//		
		/*Enunciado 3*/
				
//		System.out.println("--Bem-Vindo ao Enunciado3--");
//
//		System.out.println("Digite a nota1: ");
//		objEnunciado3.setNota1(objScanner.nextDouble());
//		
//		System.out.println("Digite a nota2: ");
//		objEnunciado3.setNota2(objScanner.nextDouble());
//		
//		System.out.println("Digite a nota3: ");
//		objEnunciado3.setNota3(objScanner.nextDouble());
//		
//		System.out.println("Digite a nota4: ");
//		objEnunciado3.setNota4(objScanner.nextDouble());
//		
//	    if (objEnunciado3.Media1() >=7) {
//	    	objEnunciado3.CalcularMedia();
//	    }else {
//	    	System.out.println("Nota 5");
//	    	objEnunciado3.setNota5(objScanner.nextDouble());
//	    	
//	    	objEnunciado3.CalcularMedia2();
//	    }
		
		
		/*Enunciado 4*/
		
//		System.out.println("informe o Numero");
//		objEnunciado4.setN1(objScanner.nextDouble());
//		
//		objEnunciado4.Calculo();
		
		/*Enunciado 5*/
		
		System.out.println("Digite o 1°: ");
		objEnunciado5.setN1(objScanner.nextInt());
		
		System.out.println("Digite o 2°: ");
		objEnunciado5.setN2(objScanner.nextInt());
		
		System.out.println("Escolha um calculo ( + , - , / , *)");
		objEnunciado5.setOp(objScanner.nextInt());
		
		objEnunciado5.Calculo();

		System.out.println("Resultado: " + objEnunciado5.getR());
		
	}

}
