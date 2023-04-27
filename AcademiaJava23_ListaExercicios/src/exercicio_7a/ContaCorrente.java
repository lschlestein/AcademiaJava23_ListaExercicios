package exercicio_7a;

public class ContaCorrente {
	private float saldo = 0;

	public void depositar(float valorDeposito) {
		saldo += valorDeposito;
	}

	public boolean sacar(float valorSaque) {
		if (saldo - valorSaque < 0) {
			return true;
		} else {
			saldo -= valorSaque;
		}
		return false;
	}

	public float saldo() {
		return saldo;
	}

}
