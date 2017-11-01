public class turma {
	private int quantidade_de_alunos;
	private String Sala;

	//-------------------------------------------------------

	public void set_aluno (String alguem) {
		this.quantidade_de_alunos += 1;
	}

	public void set_sala(String letra) {
		this.Sala = letra;
	}
}