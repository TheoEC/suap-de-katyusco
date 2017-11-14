/*Classe dedicada ao mecanismo de busca e armazenamento(em listas)
de alunos e professores cadastrados na escola;
*/

import java.util.ArrayList;

public class busca_usuario{
	private ArrayList<aluno> alunos_na_escola = new ArrayList<aluno>();
	private int total_de_alunos;
	private ArrayList<professor> professores_na_escola = new ArrayList<professor>();
	private int total_de_professores;
	
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
	
	//--------------------- Get ----------------------------------------
	
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
	
}