import java.util.ArrayList;

public class No {

	// Atributos
	No pai;			// Atributo Pai
	int valor;		// Valor
	ArrayList<No> filho;	// Lista de filhos
	
	// Construtor
	public No(int valor) {
		this.valor = valor;
		pai = null;
		filho = new ArrayList<No>();
	}	
	
}
