class aluno {
	private String nome;
	private String num_matricula;
	private String Data_de_nascimento;
	private String Nome_da_mae;
	
	//-------------------------------------

	public void set_nome (String name) {
		this.nome = name;
	}

	public void set_Matricula (String numero) {
		this.num_matricula = numero;
	}

	public void set_DataNascimento(String dia, String mes, String ano) {
		this.Data_de_nascimento = dia + "/" + mes + "/" + ano;
	}

	public void set_nomemae (String namee) {
		this.Nome_da_mae = namee;
	}

	// ------------ get ----------------------------

	public String get_nome() {
		return (this.nome);
	}

	public String get_Matricula () {
		return(this.num_matricula);
	}

	public String get_DataNascimento() {
		return(this.Data_de_nascimento);
	}

	public String get_nomemae () {
		return(this.Nome_da_mae);
	}

	public void imprime_dados() {
		System.out.println(this.nome);
		System.out.println(this.num_matricula);
		System.out.println(this.Data_de_nascimento);
		System.out.println(this.Nome_da_mae);
	}
}