import java.util.ArrayList;
public class turnos {
	private ArrayList<String> manha = new ArrayList<String>();
	private ArrayList<String> tarde = new ArrayList<String>();
	private ArrayList<String> noite = new ArrayList<String>();

	//-----------------------------------------------------------
	public void set_manha(String primeira, String segunda, String terceira, String quarta, String quinta){
		manha.add(primeira);
		manha.add(segunda);
		manha.add(terceira);
		manha.add(quarta);
		manha.add(quinta);

		//imprime os horarios da manha:

		for (int i = 0; i < this.manha.size(); i++) {
			System.out.println((i + 1) + "ª aula: " + this.manha.get(i));
		}
	}

	public void set_tarde(String primeira, String segunda, String terceira, String quarta, String quinta){
		tarde.add(primeira);
		tarde.add(segunda);
		tarde.add(terceira);
		tarde.add(quarta);
		tarde.add(quinta);

		//imprime os horarios da tarde:

		for (int i = 0; i < this.tarde.size(); i++) {
			System.out.println((i + 1) + "ª aula: " + this.tarde.get(i));
		}
	}

	public void set_noite(String primeira, String segunda, String terceira, String quarta, String quinta){
		noite.add(primeira);
		noite.add(segunda);
		noite.add(terceira);
		noite.add(quarta);
		noite.add(quinta);

		//imprime os horarios da noite:

		for (int i = 0; i < this.noite.size(); i++) {
			System.out.println((i + 1) + "ª aula: " + this.noite.get(i));
		}
	}

	public void get_all() {												// imprime todos os horarios

		for (int i = 0; i < this.manha.size(); i++) {
			System.out.println((i + 1) + "ª aula: " + this.manha.get(i));
		}

		for (int i = 0; i < this.tarde.size(); i++) {
			System.out.println((i + 1) + "ª aula: " + this.tarde.get(i));
		}

		for (int i = 0; i < this.noite.size(); i++) {
			System.out.println((i + 1) + "ª aula: " + this.noite.get(i));
		}

	}

}
