
import static org.junit.Assert.*;
import Algoritmos.BubbleSort;
import Algoritmos.QuickSort;
import Algoritmos.ShellSort;
import Principal.Ordenadores;
import Principal.OrdenarBublleSort;
import Principal.OrdenarQuickSort;
import Principal.OrdenarShellSort;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;


public class TesteOrdenadores {
    Ordenadores ordenar;

    

     @Test
    public void testeOrdenacaoCorretaShell(){
        ordenar=new OrdenarQuickSort();
        ArrayList vetor=new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(5,6,10,1,2,3));
        assertEquals(ordenar.ordenarVetores(vetor).get(4),6);
    }
    
    @Test
    public void testeOrdenacaoCorretaQuick(){
        ordenar=new OrdenarQuickSort();
        ArrayList vetor=new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(5,6,10,1,2,3));

        assertEquals(ordenar.ordenarVetores(vetor).get(1),2);
    }
    @Test
    public void testeOrdenarShell(){
        ordenar=new OrdenarShellSort();
        assertTrue(ordenar.getAlgoritmos() instanceof ShellSort);
    }
    @Test
    public void testeOrdenacaoCorretaBuble(){
        ordenar=new OrdenarBublleSort();
        ArrayList vetor=new ArrayList<Integer>();
        vetor.addAll(Arrays.asList(64, 34, 25, 12, 22, 11, 90));
        assertEquals(ordenar.ordenarVetores(vetor).get(1),12);
    }

    @Test
    public void testeOrdenarQuickSort(){
        ordenar=new OrdenarQuickSort();
        assertTrue(ordenar.getAlgoritmos() instanceof QuickSort);
    }

    @Test
    public void testeOrdenarBubble(){
        ordenar=new OrdenarBublleSort();
        assertTrue(ordenar.getAlgoritmos() instanceof BubbleSort);
    }
   
}
