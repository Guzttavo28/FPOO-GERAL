
public class Enunciado2 {
	
	private int N1;
	private int N2;
	private int N3;
	
	public void exibirOMaior() {
		
		if(this.getN1() > this.getN2()) {
			if(this.getN1() > this.getN3()) {
				System.out.println("O 1°número é maior que todos");
			}
		}else {
			if(this.getN2() > this.getN1()) {
		        if(this.getN2() > this.getN3()) {
				    System.out.println("O 2°número é maior que todos");
			}
		  } else {
			  if(this.getN3() > this.getN1()) {
					if(this.getN3() > this.getN2()) {
						System.out.println("O 3°número é maior que todos");
					}
			  }
		  }
		}	
		
	}
	
	
	/*return the n1*/
	public int getN1() {
		return N1;
	}
	/*param n1 the n1 to set*/
	public void setN1(int n1) {
		N1 = n1;
	}
	/*return the n2*/
	public int getN2() {
		return N2;
	}
	/*param n2 the n2 to set*/
	public void setN2(int n2) {
		N2 = n2;
	}
	/*return the n3*/
	public int getN3() {
		return N3;
	}
	/*param n3 the n3 to set*/
	public void setN3(int n3) {
		N3 = n3;
	}
	
	
}
