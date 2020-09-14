package numerosRacionais;

public class Racionais {
	
	private double racionais;
	
	public Racionais(double rac) {
		this.racionais = rac;
	}

	private double getRacionais() {
		return racionais;
	}

	private double setRacionais(double racionais) {
		this.racionais = racionais;
		return racionais;
	}
	
	public void somar(double somador) {
		this.setRacionais(this.getRacionais() + somador);		
	}
	
	public void multiplicar(double multiplicador) {
		this.setRacionais(this.getRacionais() * multiplicador);		
	}
	
	public void igualdade(double igual) {
		if (getRacionais() == igual) {
			System.out.println("São iguais.");
		} else {
			System.out.println("Não são iguais.");
		}
	}
	
	public void resultado() {
		System.out.println(getRacionais());
	}

}
