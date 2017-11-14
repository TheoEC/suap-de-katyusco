import java.util.ArrayList;
public class turma {
	private int matriculados;
	private	dia segunda = new dia();
	private	dia terca = new dia();
	private dia quarta = new dia();
	private dia quinta = new dia();
	private	dia sexta = new dia();
	private aluno[] Aluno = new aluno[40]; 
	
	//---------------------------------------------------------------------------------

	public boolean set_aluno (aluno alguem) {
		if (matriculados < 40) {
			this.Aluno[matriculados] = (alguem);	
			matriculados += 1;
			return true;
		}

		else {
			System.out.println("Turma lotada");
			return false;
		}

	}
	
	//------------------GET------------------------------------------------------------

	public void get_lista() {					// imprime a lista de alunos
		for (int i = 0; i < matriculados; i++) {
			System.out.println((i + 1) + " - " + this.Aluno[i].get_nome());
		}
	}

	public int matriculados() {					// retorna a quantidade de alunos cadastrados na turma.
		return (this.matriculados);
	}
}
