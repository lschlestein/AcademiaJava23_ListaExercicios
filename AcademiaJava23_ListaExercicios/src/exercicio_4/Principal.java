package exercicio_4;

public class Principal {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();

		a1.atribuirNome();
		a1.atribuirEmail();
		a1.atribuirMatricula();

		a2.atribuirNome();
		a2.atribuirEmail();
		a2.atribuirMatricula();

		a3.atribuirNome();
		a3.atribuirEmail();
		a3.atribuirMatricula();

		a1.exibirAluno();
		a2.exibirAluno();
		a3.exibirAluno();

	}

}
