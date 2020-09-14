package contaBancaria;

public class Conta {
	
	private double saldo;
	
	public Conta(double valor) {
		this.saldo = valor;
	}
	
	private double getSaldo() {
		return saldo;
	}
	
	private double SetSaldo(double valor) {
		this.saldo = valor;
		return valor;
	}
	
	public void visualizar() {
		this.getSaldo();
	}
	
	public void depositar(double adicionar) {
		this.SetSaldo(getSaldo() + adicionar);
	}
	
	public void sacar(double sacar) {
		if (this.getSaldo() - sacar < 0) {
			System.out.println("Impossível sacar. Saque menor que saldo bancário.");
		} else {
			this.SetSaldo(this.getSaldo() - sacar);
		}
	}
}
