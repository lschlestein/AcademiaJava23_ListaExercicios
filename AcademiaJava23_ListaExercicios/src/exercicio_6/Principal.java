package exercicio_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();
		boolean eValido = false;
		boolean cadastrarCandidato = true;
		Candidato c;
		Scanner leitura = new Scanner(System.in);

		while (cadastrarCandidato) {
			c = new Candidato();
			System.out.println("Cadastrar novo Candidato:");
			c.atribuiNome();
			c.atribuiEmail();
			c.atribuiCurso();
			do {
				if (c.atribuiCpf()) {
					eValido = true;
					System.out.println("CPF Válido");
					listaCandidatos.add(c);
					System.out.println("Deseja continuar o cadastro? S ou N");
					if (leitura.nextLine().toUpperCase().equals("N")) {
						System.out.println("Foram cadastrados "+listaCandidatos.size()+" candidatos.");
						System.out.println(listaCandidatos);
						cadastrarCandidato = false;
						leitura.close();
					}
				} else {
					System.out.println("CPF Inválido");
				}
			} while (eValido == false);
		}
	}
}
