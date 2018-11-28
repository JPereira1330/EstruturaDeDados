// classe ArvoreB
public class ArvoreB {
	
   private NoArvoreB raiz;

   public ArvoreB(){
      raiz = null;
   }

   // retorna o nó raiz da ArvoreB
   public NoArvoreB raiz(){
	return raiz;
   }
  
   // insere um novo nó na ArvoreB
   public void insereNo( int v ) {
      if ( raiz == null )
         raiz = new NoArvoreB( v ); // insere um no como raiz
      else
         raiz.insere( v ); // insere o nó através do método insere (busca a partir do nó raiz)
   }

 public static NoArvoreB excluir(NoArvoreB aux, int num) {
        NoArvoreB p;
        if (aux.valor == num) { 			// se achou o nó a ser excluído
            if (aux.noEsq == aux.noDir) { // 1o. caso - nó sem filhos
                return null;
            } else if (aux.noEsq == null) { // 2o. caso nó com um filho (direita)
                aux.noDir.noPai = aux.noPai;
                return aux.noDir;
            } else if (aux.noDir == null) { // 2o. caso nó com um filho (esquerda)
                aux.noEsq.noPai = aux.noPai;
                return aux.noEsq;
            } else {   						// 3o. caso nó com dois filhos, pega o mais a esquerda da subarvore da direita
                p = aux.noDir;
                while (p.noEsq != null) {
                    p = p.noEsq;
                }
                p.noEsq = aux.noEsq;
                p.noEsq.noPai = p;
                p.noPai.noEsq = null; // desaloca o nó abaixo (foi realocado acima na arvore)
                if (p.noDir != null) { // se o nó que vai assumir o lugar do excluido possuir subarvore a direita, tem que realocar esta subarvore
                						// abaixo do pai do nó que vai assumir o lugar do no excluido.
                	p.noPai.noEsq = p.noDir;
                	p.noDir.noPai = p.noPai;
                }
				if (aux.noDir.valor != p.valor) // caso tenha elemento mais a esquerda seta no a direita senão deixa a própria subarvore do nó
                	p.noDir = aux.noDir;
                p.noPai = aux.noPai;

                return p;
            }
        } else if (aux.valor < num) {
            aux.noDir = excluir(aux.noDir, num); // coloca o novo elemento como filho da direita do no
        } else {
            aux.noEsq = excluir(aux.noEsq, num); // coloca o novo elemento como filho da esquerda do no
        }
        return aux;
    }

   // inicia pré-ordem
   public void preordem()
   {
      buscaPreOrdem( raiz );
   }

   // método recursivo para pré-ordem
   private void buscaPreOrdem( NoArvoreB no )
   {
      if ( no == null )
         return;

      System.out.print( "no="+no.valor + " - " ); // output no valor
      buscaPreOrdem( no.noEsq );     // percorre sub-arvore da esquerda
      buscaPreOrdem( no.noDir );    // percorre sub-arvore da direita
   }

   // inicia busca NaOrdem
   public void naOrdem()
   {
      buscaNaOrdem( raiz );
   }

   // usa recursividade para buscar os próximos nós
   private void buscaNaOrdem( NoArvoreB no )
   {
      if ( no == null )
         return;

      buscaNaOrdem( no.noEsq );      // percorre subarvore da esquerda
      System.out.print( no.valor + " " );
      buscaNaOrdem( no.noDir );     // percorre subarvore da direita
   }

   // inicia busca Pos-Ordem
   public void posOrdem()
   {
      buscaPosOrdem( raiz );
   }

   // usa recursividade para buscar os próximos nós
   private void buscaPosOrdem( NoArvoreB no )
   {
      if ( no == null )
         return;

      buscaPosOrdem( no.noEsq );    // percorre subarvore da esquerda
      buscaPosOrdem( no.noDir );   // percorre subarvore da direita
      System.out.print( no.valor + " " );
   }

}
