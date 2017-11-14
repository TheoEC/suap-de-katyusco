import java.util.ArrayList;
public class dia {

	private turnos dia = new turnos();

	//--------------------------------------------------------------------------

	public void set_horario(int dia, String primeira, String segunda, String terceira, String quarta, String quinta) {
		if (dia == 1) { 											// se o dia for igual a 1, se aplicara os dados a manhã;
			this.dia.set_manha(primeira, segunda, terceira, quarta, quinta);					// aplica os horarios da manha;
			
		}

		else if (dia == 2) {											// para a tarde;
			this.dia.set_manha(primeira, segunda, terceira, quarta, quinta);					// aplica os horarios da tarde;
		}

		else if (dia == 3) {											// para a noite;
			this.dia.set_noite(primeira, segunda, terceira, quarta, quinta);				// aplica os horarios da noite;
		}

	}   

}