package exercicio_7;

public class Principal {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		System.out.println("Saldo:"+cc.saldo);
		cc.depositar(2000);
		System.out.println("Saldo:"+cc.saldo);
		cc.sacar(800);
		cc.sacar(1500);
		System.out.println("Saldo:"+cc.saldo);
	}

}
