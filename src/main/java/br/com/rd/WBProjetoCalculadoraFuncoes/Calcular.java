package br.com.rd.WBProjetoCalculadoraFuncoes;

public class Calcular {
	private Integer val1;
	private Integer val2;
	
	
	
	public Calcular(Integer valor1, Integer valor2) {
		this.val1 = valor1;
		this.val2 = valor2; 
	}
	
	
	public int somar() {
		return (this.val1 + this.val2);
	}
	
	public int subtrair() {
		return (this.val1 - this.val2);
	}
	
	public int multiplicar() {
		return (this.val1 * this.val2);
	}
	
	public int dividir() {
		return (this.val1 / this.val2);
	}
}
