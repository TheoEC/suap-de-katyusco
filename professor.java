/* numero de matricula utilizado para busca de dados,
então não é adicionado na classe professor, mas gerado
e aplicado na classe "busca_usuario", para busca de informações
pelo numero correspondente a posição do objeto em uma lista)*/
class professor {
	private String nome;
	private String grau;
	private double salario;
	
	//-------------set--------------------------------

	public void set_nome(String name) {
		this.nome = name;
	}

	public void set_grau(String instrucao) {
		this.grau = instrucao;
	}

	public void set_salario(double valor) {
		this.salario = valor;
	}

	// ------------ get ----------------------------

	public String get_nome() {
		return (this.nome);
	}

	public String get_grau () {
		return(this.grau);
	}

	public double get_salario () {
		return(this.salario);
	}

	public void imprime_dados () {
		System.out.println("Nome: " + this.nome);
		System.out.println("Grau de instrucao: " + this.grau);
		System.out.println("Salario" + this.salario);
	}
}