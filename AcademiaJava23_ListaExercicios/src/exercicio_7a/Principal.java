package exercicio_7a;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		System.out.println("Saldo:" + cc.saldo());
		cc.depositar(2000);
		System.out.println("Saldo:" + cc.saldo());
		if (cc.sacar(800)) {
			System.out.println("Não foi possível realizar o saque, saldo insuficiente para o saque");
		}
		;
		if (cc.sacar(1500)) {
			System.out.println("Não foi possível realizar o saque, saldo insuficiente para o saque");
		}
		;
		System.out.println("Saldo:" + cc.saldo());
	}

}
