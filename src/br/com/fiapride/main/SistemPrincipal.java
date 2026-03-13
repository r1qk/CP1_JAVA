package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class SistemPrincipal {
	
	public static void main(String[] args) {
		System.out.println("==== Sistema de registros de automóveis ====");
		System.out.println("Os automóveis devem ter, no máximo, 50 Litros.");
		
		// Criando objeto 1
		Veiculos veiculo1 = new Veiculos("Lucas", "QRM7E33");
		veiculo1.adicionarGasolina(25);
		veiculo1.gastarGasolina(15);
		
		// Criando objeto 2 (demonstrando erro)
		Veiculos veiculo2 = new Veiculos("João", "ABC0123");
		veiculo2.adicionarGasolina(51);
		veiculo2.gastarGasolina(4);
	
		
		System.out.println("Dono(a): " + veiculo1.getIndividuo() + " | Placa: " + veiculo1.getPlaca() + " | Gasolina: " + veiculo1.getGasolina());
		System.out.println("Dono(a): " + veiculo2.getIndividuo() + " | Placa: " + veiculo2.getPlaca() + " | Gasolina: " + veiculo2.getGasolina());
		
 }
}