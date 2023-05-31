import Implementacao.Observador;
import Implementacao.Observavel;

public class Palavras {
    public static void main(String[] args){
        
        Observavel programa=new Observavel();

        
        Observador pc1=new Observador(1,"Teste 01");
        Observador pc2=new Observador(2,"Teste 02");
        Observador pc3=new Observador(3,"Teste 03");

        
        programa.registraPCs(pc1);
        programa.registraPCs(pc2);
        programa.registraPCs(pc3);


        
        System.out.println("Número de palavras: "
                +programa.contarPalavras("Chris eh o brabo"));
        System.out.println("Número de palavras com chares par: "
                +programa.contarParidadeDePalavras("Chris eh o brabo"));
        System.out.println("Número de palavras iniciadas com caracteres Maísculos: "
                +programa.contarPalavrasIniciadasComMaisculo("Chris eh o brabo"));

        
        System.out.println("Notifier");
        programa.notificaObservadores();
    }

}