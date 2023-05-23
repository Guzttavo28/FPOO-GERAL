
public class Enunciado1 {
	
	private int N1;
	private int N2;
	
	public void exibirMaior() {
		
		if(this.getN1() > this.getN2()) {
			System.out.println("O 1° número é maior que 2° numero");
		}else {
			System.out.println("O 2° numero é maior que 1° número");
		}
		
	}
	
	
	/**return the n1*/
	public int getN1() {
		return N1;
	}
	/**param n1 the n1 to set*/
	public void setN1(int n1) {
		N1 = n1;
	}
	/**return the n2*/
	public int getN2() {
		return N2;
	}
	/**param n2 the n2 to set*/
	public void setN2(int n2) {
		N2 = n2;
	}
	
}