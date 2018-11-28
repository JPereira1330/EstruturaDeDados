// classe NoArvoreB
class NoArvoreB {

   NoArvoreB noEsq;
   int valor;
   NoArvoreB noDir;
   NoArvoreB noPai;

   // inicializa o valor e define o nó como folha
   public NoArvoreB( int v )
   {
      valor = v;
      noEsq = noDir = noPai = null;  // sem filhos e sem pai
   }

	// insere o nó no local adequado, ignora o valor se for duplicado
   public void insere( int vlr )
   {
      // insere na esquerda
      if ( vlr < valor ) {

         // insere novo nó
         if ( noEsq == null ){
            noEsq = new NoArvoreB( vlr );
            noEsq.noPai = this;
         System.out.print( "noEsq= " + noEsq.valor + "  Pai= "+ noEsq.noPai.valor + " - " );
         }

         else // continua na árvore da esquerda
            noEsq.insere( vlr );
      }

      // insere na direita
      else if ( vlr > valor ) {

         // isere novo nó
         if ( noDir == null ){
            noDir = new NoArvoreB( vlr );
            noDir.noPai = this;
         System.out.print( "noDir= " + noDir.valor + "  Pai= "+ noDir.noPai.valor + " - " );
         }

         else // continua na arvore da direita
            noDir.insere( vlr );
      }

   }

}

