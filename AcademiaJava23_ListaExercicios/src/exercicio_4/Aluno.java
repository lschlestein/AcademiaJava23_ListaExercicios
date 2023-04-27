package exercicio_4;

import java.util.Scanner;

public class Aluno {
	String nome;
	String email;
	int matricula;

	Scanner leitura = new Scanner(System.in);

	public void atribuirNome() {
		System.out.println("Insira o nome do Aluno");
		nome = leitura.nextLine().toString();
	}

	public void atribuirEmail() {
		System.out.println("Insira o email do Aluno");
		email = leitura.nextLine().toString();
	}

	public void atribuirMatricula() {
		System.out.println("Insira a matricula do Aluno");
		matricula = Integer.parseInt(leitura.nextLine().toString());
	}
	
	public void exibirAluno() {
		System.out.println("Nome: "+nome+" Email: "+email+" Matricula: "+matricula);
	}
}
