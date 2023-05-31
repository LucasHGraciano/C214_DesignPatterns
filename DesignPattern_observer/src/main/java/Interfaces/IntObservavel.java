
package Interfaces;

import Implementacao.Observador;

public interface IntObservavel {

    public int contarPalavras(String frase); 
    public int contarParidadeDePalavras(String frase); 
    public int contarPalavrasIniciadasComMaisculo(String frase); 
    public void registraPCs(Observador obs);
    public void notificaObservadores();



}