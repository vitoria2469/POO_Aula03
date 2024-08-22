package edu.curso;

public class Carro {
	char placa;
	String modelo;
	int ano;
	String cor;
	String chassi;
	
	public static void main(String[] args) {
		Carro spin = new Carro();
		spin.modelo ="oi";
		spin.ano = 2000;
		Carro spin1 = new Carro();
		spin1.modelo = "neve";
		spin1.ano = 2100;
		Carro spin2 = new Carro();
		spin2.modelo = "nina";
		spin2.ano = 2024;
	}
	public void ligarMotor() {
		System.out.println("aa");
	}
		
	public void abrirPorta() {
		System.out.println("bb");
	}
		
	public void andar() {
		System.out.println("cc");
	}

}