/*Classe dedicada ao mecanismo de busca e armazenamento(em listas)
de alunos professores, e pagamentos cadastrados na escola;
*/

import java.util.ArrayList;

public class busca_usuario{
	private ArrayList<aluno> alunos_na_escola = new ArrayList<aluno>();
	private int total_de_alunos;
	
	private ArrayList<professor> professores_na_escola = new ArrayList<professor>();
	private int total_de_professores;
	
	private ArrayList<Pagamentos> pagamentos = new ArrayList<Pagamentos>();
	private int numero_do_boleto;
	
	//--------------------- Metodos ------------------------------------
	
	public void set_aluno_escola(aluno alguem) {
		this.alunos_na_escola.add(alguem);
		System.out.println("Numero de matricula:" + this.total_de_alunos);
		this.total_de_alunos += 1;
	}
	
	public void set_professor_escola(professor alguem) {
		this.professores_na_escola.add(alguem);
		System.out.println("Numero de matricula:" + this.total_de_professores);
		this.total_de_professores += 1;
		
	}
	
	public void set_boleto(Pagamentos um_pagamento) {
		this.pagamentos.add(um_pagamento);
		System.out.println("Numero do boleto:" + this.numero_do_boleto);
		this.numero_do_boleto += 1;
	}
	
	//--------------------- Get --------------------------------------------------
	
	public void get_dados_aluno(int numero_de_matricula) {							// imprime os dados do aluno correspondente a matricula(posição na lista)
		if (numero_de_matricula + 1 > total_de_alunos) {
			System.out.println("Aluno nao identificado");
		}
		
		else {
			this.alunos_na_escola.get(numero_de_matricula).imprime_dados();
		}
	}
	
	public void get_dados_professor(int numero_de_matricula) {
		if (numero_de_matricula + 1 > total_de_professores) {
			System.out.println("Professor nao identificado");
		}
		
		else {
			this.professores_na_escola.get(numero_de_matricula).imprime_dados();
		}
		
	}
	
	public void get_pagamento(int Numero_do_boleto) {
		if (Numero_do_boleto + 1 > numero_do_boleto) {
			System.out.println("Boleto nao identificado");
		}
		
		else {
			this.pagamentos.get(Numero_do_boleto).imprime_boleto();
		}
		
	}
	
}