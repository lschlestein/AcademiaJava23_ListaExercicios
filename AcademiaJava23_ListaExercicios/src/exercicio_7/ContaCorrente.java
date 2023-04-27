package exercicio_7;

public class ContaCorrente {
	public float saldo=0;
	
	public void depositar(float valorDeposito) {
		saldo += valorDeposito;
	}
	public void sacar(float valorSaque) {
		saldo -= valorSaque;
	}

}
