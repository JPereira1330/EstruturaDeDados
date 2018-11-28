import java.util.ArrayList;

public class Arvore {

	private No raiz;
	
	// 
	public Arvore() {
		raiz = null;
	}
	
	// Metodo para inserir novos valores
	public void inserir(No pai, No filho) {
	
		// Caso raiz nula
		if(raiz == null)
			raiz = filho;

		// Caso raiz preenchida
		else {
			filho.pai = pai;
			pai.filhos.add(filho);
		}
		
	}
	
	// Retorna Raiz
	public No getRaiz() {
		return raiz;
	}

	// Retorna o pai do no
	public No getPai(No no) {
		return no.pai;
	}
	
	// Pegar filhos do no
	public ArrayList<No> getFilhos(No no){
		return no.filhos;
	}
	
	// Testa se nó é interno
	public boolean verificaNoInterno(No no) {
		return no.filhos.size() > 0;
	}
	
	// Testa se o nó é externo
	public boolean verificaNoExterno(No no) {
		return !verificaNoInterno(no);
	}
	
	// Testa se o nó é da raiz
	public boolean verificaRaiz(No no) {
		return no.pai.valor == raiz.valor;
	}

	// Retorna uma lista com todos os nós da Árvore
	public ArrayList<No> elementos() {

		ArrayList<No> lista = new ArrayList<No>();
		lista.add(raiz);
		int i = 0;

		while (i < lista.size()) {
			No atual = lista.get(i);
			for (No n: atual.filhos) {
				lista.add(n);
			}
			i++;
		}
		return lista;
	}

	// Retorna o número de nós da Árvore
	public int tamanho() {
		return elementos().size();
	}

	// Retorna o elemento armazenado em elementoAntigo e o substitui por elementoNovo
	public int atualizaElemento(No elementoAntigo, No elementoNovo) {
		int aux = elementoAntigo.valor;
		elementoAntigo.valor = elementoNovo.valor;
		return aux;
	}	
	
}
