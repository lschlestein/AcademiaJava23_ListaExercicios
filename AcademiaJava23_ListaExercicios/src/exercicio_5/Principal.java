package exercicio_5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Insira o nome do Aluno");
		String nome = leitura.nextLine().toString();

		System.out.println("Insira o email do Aluno");
		String email = leitura.nextLine().toString();

		System.out.println("Insira a matricula do Aluno");
		int matricula = Integer.parseInt(leitura.nextLine().toString());
		leitura.close();
		
		Aluno a1 = new Aluno(nome, email, matricula);

		a1.exibirAluno();

	}

}
