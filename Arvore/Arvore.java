import java.util.ArrayList;

public class Arvore {

	private No raiz;
	
	// Construtor
	public Arvore() {
		raiz = null;
	}
	
	// Metodo para inseir um novo filho
	public void inserir(No pai, No filho) {
		
		// Caso Raiz nula
		if(raiz == null)
			raiz = filho;
		
		// Adicionando um novo filho
		else {
			filho.pai = pai;		// Adicionando pai no objeto filho
			pai.filho.add(filho);   // Adicionando filho no objeto pai
		}
		
	}
	
	// Metodo para alterar o valor do No
	public int alterar(No antigo, No novo) {
	
		// Capturando valor antigo para retornar
		int valorAntigoElemento = antigo.valor;
		
		// Alterando os nós
		antigo.valor = novo.valor;
		
		return valorAntigoElemento;
		
	}
	
	public int remover(No pai, No noRemovido) {
		
		// Capturando valor a ser removido
		int valorASerRemovido = noRemovido.valor;
		
		// Percorrendo todos os filhos para remover o desejado
		for(int i = 0; i < pai.filho.size(); i++) {
			
			// Caso o filho seja igual o repassado no parametro, remove
			if(pai.filho.get(i) == noRemovido) {
				pai.filho.remove(i);
			}
			
		}
		
		return valorASerRemovido;
		
	}
	
	// Metodo que retorna todos os elementos da arvore
	public ArrayList<No> getElementos(No Pai){
		
		// Captura todos os elementos
		ArrayList<No> lista = new ArrayList<No>();
		lista.add(raiz);
		int i = 0;
		
		// Percorrendo os filhos da raiz
		while( i < lista.size() ) {
			
			// Capturando proximo pai
			No atual = lista.get(i);
			
			// Adicionando todos os filhos
			for(No n : atual.filho) {
				lista.add(n);
			}
			
			i++;
		}
		
		return lista;
	}
	
	
}
