
public class Enunciado3 {
	

	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double nota5;
	private double media1;
	private double media2;
	
	public void CalcularMedia() {
		if(Media1() >= 7) {
			
		}
	}
	
	public void CalcularMedia2() {
		if(Media2() >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Desaprovado");
		}
	}
	
	public double Media1() {
		media1 = getNota1()+ getNota2()+ getNota3()+ getNota4()/4;
	    return media1;
	}
	
	public double Media2() {
		media2 = getNota1()+ getNota2() + getNota3()+ getNota4()+ getNota5()/4;
        return media2;
	}
	
	
	/**
	 * @return the nota1
	 */
	public double getNota1() {
		return nota1;
	}
	/**
	 * @param nota1 the nota1 to set
	 */
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	/**
	 * @return the nota2
	 */
	
    public double getNota2() {
		return nota2;
	}
	/**
	 * @param nota2 the nota2 to set
	 */
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	/**
	 * @return the nota3
	 */
	
    public double getNota3() {
		return nota3;
	}
	/**
	 * @param nota3 the nota3 to set
	 */
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	/**
	 * @return the nota4
	 */
	
    public double getNota4() {
		return nota4;
	}
	/**
	 * @param nota4 the nota4 to set
	 */
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	/**
	 * @return the nota5
	 */
	
    public double getNota5() {
		return nota5;
	}
	/**
	 * @param nota5 the nota5 to set
	 */
	public void setNota5(double nota5) {
		this.nota5 = nota5;
	}
		
}    
  
