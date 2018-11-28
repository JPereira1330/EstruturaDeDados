import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		executar();
	}
	
	// Metodo responsavel por executar a arvore, inserindo dados e retornnado
	public static void executar() {
		
		// Criando os objetos
		Arvore arvore = new Arvore();			// Criando arvore
		No raiz = new No(1);				// Criando raiz
		ArrayList<No> listaFilhos = new ArrayList<>();	// Criando lista de No
		
		// Criando filhos
		No filho01 = new No(2);
		No filho02 = new No(3);
		No filho03 = new No(4);
		No filho04 = new No(5);
		No filho05 = new No(6);
		
		// Inserindo valores na arvore
		arvore.inserir(null, raiz);		// Insere a raiz
		arvore.inserir(raiz, filho01);	// Inserir filho na raiz
		arvore.inserir(raiz, filho02);	// Inserir filho na raiz
		arvore.inserir(raiz, filho03);	// Inserir filho na raiz
		arvore.inserir(raiz, filho04);	// Inserir filho na raiz
		arvore.inserir(raiz, filho05);	// Inserir filho na raiz
		
		// Imprimindo raiz
		System.out.println("Raiz: "+arvore.getRaiz().valor);
		
		// Imprimindo quantia de filhos
		System.out.println("Quantia de filhos: "+listaFilhos.size());
		
		// Listando filhos
		for(int i = 0; i < listaFilhos.size(); i++) {
			filho01 = listaFilhos.get(i);
			System.out.println("Filho "+(i+1)+": "+filho01.valor);
		}
		
	}

}
