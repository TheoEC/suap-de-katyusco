class professor {
	private String nome;
	private String grau;
	private double salario;
	private String num_matricula;
	
	//-------------set--------------------------------

	public void set_nome(String name) {
		this.nome = nome;
	}

	public void set_grau(String instrucao) {
		this.grau = instrucao;
	}

	public void set_salario(double valor) {
		this.salario = valor;
	}

	public void set_matricula(String mat) {
		this.num_matricula = mat;
	}

	// ------------ get ----------------------------

	public String get_nome() {
		return (this.nome);
	}

	public String get_Matricula () {
		return(this.num_matricula);
	}

	public String get_grau () {
		return(this.grau);
	}

	public double get_salario () {
		return(this.salario);
	}

	public void imprime_dados () {
		System.out.println(this.nome);
		System.out.println(this.num_matricula);
		System.out.println(this.grau);
		System.out.println(this.salario);
	}
}