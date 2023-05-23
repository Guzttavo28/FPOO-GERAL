
public class Enunciado4 {

	int n1, r;
	
	public void Calculo(){
	if (n1 > 0) {
		r = n1 % 2;
	}if(r == 0) {
		System.out.println("Par");
	}else {
		System.out.println("Impar");
	}
	}

	/**
	 * @return the n1
	 */
	public int getN1() {
		return n1;
	}

	/**
	 * @param n1 the n1 to set
	 */
	public void setN1(double n1) {
		this.n1 = (int) n1;
	}
}
