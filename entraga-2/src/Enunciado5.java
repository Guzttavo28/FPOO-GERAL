
public class Enunciado5 {
	
	private String op;
	private int n1, n2;
	private int r;
	
    public void Calculo() {
		switch (getOp()) {
		case "+":
			r = getN1() + getN2();
		break;	
		
        case "-":
		    r = getN1() - getN2();
	    break;	
    
        case "/":
	        r = getN1() / getN2();
	    break;
	    
        case "*":
	        r = getN1() * getN2();
	    break;
 	
	}
}	
	
	/**
	 * @return the r
	 */
	public int getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(int r) {
		this.r = r;
	}

	/**
	 * @return the op
	 */
	public String getOp() {
		return op;
	}


	/**
	 * @param op the op to set
	 */
	public void setOp(String op) {
		this.op = op;
	}


	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	
	
	
	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

}
