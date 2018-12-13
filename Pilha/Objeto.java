package Pilha;

public class Objeto {

	int valor;
	Objeto anterior;

	public Objeto(int valor) {
		this.valor = valor;
		anterior = null;
	}
	
	public Objeto(int valor, Objeto anterior) {
		this.valor = valor;
		this.anterior = anterior;
	}
	
	public int getValor() {
		return valor;
	}
	
}
