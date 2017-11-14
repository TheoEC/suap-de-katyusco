public class Pagamentos{
	
	private double Valor;
	private String Metodo_de_pagamento;
	private String Data_de_vencimento;
	private String Referente;

	
	public void set_Valor(double valor) {
		this.Valor = valor;
	}
	
	public void set_data_de_vencimento(String data) {
		this.Data_de_vencimento = data;
	}
	
	public void set_referente(String mensalidade) {
		this.Referente = mensalidade;
	}
	
	public void set_forma(String forma) {
		this.Metodo_de_pagamento =  forma;
	}
	
	public void imprime_boleto() {
		System.out.println("Pagamento:");
		System.out.println("Referente a " + Referente);
		System.out.println("Valor: " + Valor);
		System.out.println("Metodo de pagamento: " + Metodo_de_pagamento);
		System.out.println("Data de vencimento: " + Data_de_vencimento);
	}
	
}