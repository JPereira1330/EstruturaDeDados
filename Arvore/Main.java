import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		Arvore arvore = new Arvore();
		
		No raiz = new No(0);
		
		// Criando nós
		No no01 = new No(10);
		No no02 = new No(11);
		No no03 = new No(12);
		No no04 = new No(20);
		No no05 = new No(21);
		No no06 = new No(22);
		No no07 = new No(30);
		No no08 = new No(31);
		No no09 = new No(111);
		No no10 = new No(222);
		
		// Adiconando nós na arvore
		arvore.inserir(null, raiz);
		arvore.inserir(raiz,no01);
		arvore.inserir(no01,no02);
		arvore.inserir(no01,no03);
		arvore.inserir(raiz,no04);
		arvore.inserir(no04,no05);
		arvore.inserir(no04,no06);
		arvore.inserir(raiz,no07);
		arvore.inserir(no07,no08);
		arvore.inserir(no02, no09);
		arvore.inserir(no06, no10);
		
		// Listar Elementos
		printarArvore(arvore, raiz);
		
		// Removendo elemento
		System.out.println("Removendo nó");
		int aux = arvore.remover(no01, no03);
		System.out.println("nó "+aux+" removido");
		
		// Listar Elementos
		printarArvore(arvore, raiz);
		
		// Alterando elementos
		System.out.println("Alterando nó nó");
		arvore.alterar(no04, no10);
		System.out.println("Nó alterado");
		
		// Listar Elementos
		printarArvore(arvore, raiz);
		
	}
	
	// Metodo para printar toda a arvore
	public static void printarArvore(Arvore arvore, No origem) {
		ArrayList<No> elemento = arvore.getElementos(origem);
		for(int i = 0; i < elemento.size(); i++) {
			System.out.println(elemento.get(i).valor);
		}
	}
	
}
