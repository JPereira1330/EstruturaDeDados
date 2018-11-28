import java.util.ArrayList;

public class No {

	// Variaveis de controle
	No pai;
	ArrayList<No> filhos;
	
	// Variaveis do objeto
	int valor;	
	
	public No(int valor) {
		this.valor = valor;
		pai = null;
		filhos = new ArrayList<No>();
	}	
	
}
