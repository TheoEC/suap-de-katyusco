public class aluno {
	private String nome;
	private String Data_de_nascimento;
	private String Nome_da_mae;
	private String turma;
// ao criar notas, lembrar de adicionar no buscador a opção
	//-------------------------------------

	public void set_nome (String name) {
		this.nome = name;
	}

	public void set_DataNascimento(String data) {
		this.Data_de_nascimento = data;
	}

	public void set_nomemae (String namee) {
		this.Nome_da_mae = namee;
	}

	public void set_turma (String turm) {
		this.turma = turm;
	}

	// ------------ get ----------------------------


	public String get_nome() {
		return(this.nome);
	}
	
	public String get_nome_mae() {
		return(this.Nome_da_mae);
	}
	
	public String get_data() {
		return(this.Data_de_nascimento);
	}
	
	public String get_turma() {
		return(this.turma);
	}
	
	public void imprime_dados() {
		System.out.println("nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.Data_de_nascimento);
		System.out.println("Nome da mae: " + this.Nome_da_mae);
		System.out.println("Turma: " + this.turma);
	}
}