package Principal;

import Interfaces.Algoritmos;

import java.util.ArrayList;

public abstract class Ordenadores {
    
    protected Algoritmos algoritmos;
     public ArrayList ordenarVetores(ArrayList<Integer> vetor){
        return algoritmos.OrdenaVetores(vetor);
    }


    
    
    public Algoritmos getAlgoritmos() {
        return algoritmos;
    }

    public void setAlgoritmos(Algoritmos algoritmos) {
        this.algoritmos = algoritmos;
    }
}