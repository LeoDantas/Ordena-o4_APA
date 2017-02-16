import java.util.Arrays;


/**
 *
 * @author Leonardo Dantas
 */
public class QuickSort {
     
    public static int Tempo=0;
    
    private static void swap(long v[], int i, int j){  //Método para efetuar a troca de vetores
        long aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
      
 
      
    public static int pivo_ini(long v[], int ini, int fim){//Calculo do pivo no inicio
    long pivo;
    int topo, i;
    pivo = v[ini];
    topo = ini;
        for (i = ini + 1; i <= fim; i++) {

            if (v[i] < pivo) {
                v[topo] = v[i];
                v[i] = v[topo + 1];
                topo++;                          
            }
        }

    v[topo] = pivo;
    return topo;
}
    

    
    public static void quick_sort(long v[],int ini,int fim){//Função para fazer a ordenação do vetor, a chamada do pivo pode
           //ser alterada.
    
    int meio;                                               
    if (ini < fim) {
        meio = pivo_ini(v, ini, fim);

        quick_sort(v, ini, meio-1);
        quick_sort(v, meio + 1, fim);
    }
    
    
   
}
    
    
    
}
