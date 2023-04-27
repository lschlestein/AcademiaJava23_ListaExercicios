package exercicio_6;

import java.util.Scanner;

public class Candidato {
	long cpf;
	String nome;
	String email;
	String curso;

	Scanner leitura = new Scanner(System.in);

	public void atribuiNome() {
		System.out.println("Insira o nome do Candidato");
		nome = leitura.nextLine().toString();
	}

	public void atribuiEmail() {
		System.out.println("Insira o email do Candidato");
		email = leitura.nextLine().toString();
	}

	public void atribuiCurso() {
		System.out.println("Insira o curso do Candidato");
		curso = leitura.nextLine().toString();
	}

	public boolean atribuiCpf() {
		System.out.println("Insira o CPF do Candidato");
		String cpfLido = leitura.nextLine().toString();
		boolean cpfValido = false;
		if (cpfLido.length() == 11) {
			cpf = Long.parseLong(cpfLido);
			cpfValido = true;
		}

		return cpfValido;

	}

	@Override
	public String toString() {
		return "Candidato [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", curso=" + curso + "]";
	}
}
