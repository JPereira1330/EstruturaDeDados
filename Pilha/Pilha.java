package Pilha;
public class Pilha {

	private Objeto topo;
	
	// Metodo para inserir um objoto no topo da pilha
	public void inserir(int valor) {

		// Caso topo nullo, objeto criado é inserido no topo
		if( this.topo == null )
			this.topo = new Objeto (valor);
		
		// Caso topo preenchido, joga topo para baixo
		else
			this.topo = new Objeto (valor, this.topo);
		
	}
	
	// Retirar objeto da pilha
	public void remover() {
		
		// Caso o proximo objeto exista
		if(topo.anterior != null)
			this.topo = topo.anterior;
		
		// Caso o proximo objeto não exista
		else
			this.topo = null;
		
	}
	
	// Lista os valores da pilha
	public void listar() {
		
		Objeto atual = topo;
		
		do {
			System.out.println(atual.getValor());
			atual = atual.anterior;
		}while(atual != null);
	}
	
	
	// Buscar valor na pilha
	public Objeto buscar (int valor, Objeto prox) {
		
		// Caso primeira vez rodando
		if( prox == null )
			prox = topo;
		
		// Testa se achou valor
		if(prox.getValor() == valor)
			return prox;
		
		else if( prox.anterior == null )
			return null;
		
		else 
			prox = buscar(valor, prox.anterior);
		
		return prox;
	}
	
}
