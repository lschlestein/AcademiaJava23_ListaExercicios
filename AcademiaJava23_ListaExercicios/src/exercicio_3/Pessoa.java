package exercicio_3;

import java.util.Scanner;

public class Pessoa {
	String nome;
	String email;
	long cpf;
	Scanner leitura = new Scanner(System.in);

	public void atribuiNome() {
		System.out.println("Insira o nome da Pessoa:");
		nome = leitura.nextLine();
		leitura.close();
	}

	public void atribuiEmail() {
		System.out.println("Insira o email da Pessoa:");
		email = leitura.nextLine();
		leitura.close();
	}

	public void atribuiCPF() {
		System.out.println("Insira o CPF da Pessoa:");
		cpf = Long.parseLong(leitura.nextLine());
		leitura.close();
	}
}
