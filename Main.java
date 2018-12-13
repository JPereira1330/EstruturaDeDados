import Pilha.Pilha;

public class Main {

	public static void main(String[] args) {
		
		loaderPilha();
		
	}

	public static void loaderPilha() {
		
		Pilha pilha = new Pilha();
		pilha.inserir(5);
		pilha.inserir(4);
		pilha.inserir(3);
		pilha.inserir(2);
		pilha.inserir(1);
		pilha.inserir(0);
		
		System.out.println(" LISTANDO ");
		
		pilha.listar();
		
		System.out.println(" BUSCANDO 0, 5 E 7");
		
		System.out.println( pilha.buscar(0, null) != null ? "Achou!" : "Não Achou" );
		System.out.println( pilha.buscar(5, null) != null ? "Achou!" : "Não Achou" );
		System.out.println( pilha.buscar(7, null) != null ? "Achou!" : "Não Achou" );
		
		System.out.println(" REMOVENDO ");
		
		pilha.remover();
		
		System.out.println(" LISTANDO ");
		
		pilha.listar();
		
	}
	
}
