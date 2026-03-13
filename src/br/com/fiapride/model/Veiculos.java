package br.com.fiapride.model;

public class Veiculos {

	private String individuo;
	private String placa;
	private int gasolina;
	
	public Veiculos (String individuo, String placa) {
		this.setIndividuo(individuo);
		this.setPlaca(placa);
		this.setGasolina(0); // a quantidade de gasolina do usuário começa em 0
	}

	// métodos de alteração da gasolina
	public void adicionarGasolina(int valor_adicionado) {
		if (valor_adicionado <= 0) {
			System.out.println("Erro: O valor de recarga deve ser maior que zero.");
			return;
		}
		if (valor_adicionado >= 51) {
			System.out.println("Erro: Impossível adicionar mais de 50 litros.");
			return;
		}
		this.gasolina += valor_adicionado;
        String mensagem = String.format("Seu veículo agora tem %d litros de gasolina! ", this.gasolina); 
        System.out.println(mensagem);
        return;
	}

	public void gastarGasolina (int valor_gasto) {
		if (valor_gasto > this.gasolina) { 
			System.out.println("Erro: Impossível gastar mais gasolina do que você tem!");
			return;
		}
		if (valor_gasto < 0) { 
			System.out.println("Erro: Impossível gastar um valor negativo!");
			return;
		}
		this.gasolina -= valor_gasto;
        String mensagem = String.format("Seu veículo perdeu %d litros e agora tem %d litros de gasolina! ", valor_gasto, this.gasolina); 
        System.out.println(mensagem);
		return;
		
	}
	
	// get -> retornando o atributo
	public String getIndividuo() {
		return this.individuo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public int getGasolina() {
		return this.gasolina;
	}
	
	// set -> definindo o atributo privado
	private void setIndividuo (String individuo) {
		if (individuo == null || individuo == "") {
			System.out.println("Erro: Nome vazio.");
		}
		this.individuo = individuo;
	}

	private void setPlaca (String placa) {
		if (placa == null || placa == "") {
			System.out.println("Erro: Placa vazia.");
		}
		this.placa = placa;
	}
	
	private void setGasolina (int gasolina) {
		if (gasolina >= 50 || gasolina < 0) {
			System.out.println("Erro: Quantidade de gasolina inválida.");
		}
		this.gasolina = gasolina;
	}
	
	
}
