package application;

public class Main {

   public static void main( String args[] )
   {
      ArvoreB a = new ArvoreB();
	  int[] valor = {27,70,45,0,55,89,38,62,29,18,53,50,52,51};
      System.out.println( "Inserindo na árvore: " );

      for ( int i = 0; i <= 13; i++ ) {
//         System.out.print( valor[i] + " " );
         a.insereNo( valor[i] );
      }
	  NoArvoreB t = a.excluir(a.raiz(),45);
	  System.out.println ("\n\nExcluido= "+t.valor);

      System.out.println ( "\n\nBusca Pré-Ordem" );
      a.preordem();

      System.out.println ( "\n\nBusca Pos-Ordem" );
      a.posOrdem();
      System.out.println();
   }

}
