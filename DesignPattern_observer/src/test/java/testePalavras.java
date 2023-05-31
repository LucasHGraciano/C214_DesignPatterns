import Implementacao.Observador;
import Implementacao.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testePalavras {
    @Test
    public void testePalavrasPar(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarParidadeDePalavras("Necessário Retorno = 3 "),3);
    }

    @Test
    public void testeAdicionarObservadores(){
       
        Observavel programa=new Observavel();

        
        Observador pc1=new Observador(1,"Teste 01");
        Observador pc2=new Observador(2,"Teste 02");
        Observador pc3=new Observador(3,"Teste 03");

       
        programa.registraPCs(pc1);
        programa.registraPCs(pc2);
        programa.registraPCs(pc3);

        assertEquals(programa.getPcs().size(),3);
    }

     @Test
    public void testeNumeroPalavrasComecadasComMaisculo(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarPalavrasIniciadasComMaisculo("Necessário retorno = 1")
                ,1);
    }
    
    @Test
    public void testeNumeroPalavras(){
        Observavel programa=new Observavel();
        assertEquals(programa.contarPalavras("Necessário retornar = 7"),7);
    }

   

    
}