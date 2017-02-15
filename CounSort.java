import java.util.Arrays;

public class CounSort
{

     private static int getMaiorElemento (int[] v, int inicio, int fim) {
         int indice = -1;
         int max = Integer.MIN_VALUE;
         for (int i = inicio; i < fim; ++i) {
             if (v[i] > max) { 
                max = v[i]; 
                indice = i;
                
             }
         }
         return indice;
     }
    private static int getMenorElemento (int[] v, int inicio, int fim) {
         int indice = -1;
         int min = Integer.MAX_VALUE;
         for (int i = inicio; i < fim; ++i) {
             if (v[i] < min) { 
                 min = v[i];
                indice = i;
             }
         }
         return indice;
     }


    public static void Csort(int a[])
    {
        
       
        int menor = a[getMenorElemento(a, 0, a.length)];  
        int maior = a[getMaiorElemento(a, 0, a.length)];
        int j = 0;
        int n = a.length;
     
        int output[] = new int[n];
 
        int count[] = new int[maior-menor+1];
        int c = count.length;
        
        for (int i=0; i<c; ++i){
            count[i] = 0;
        }
 
        
        for (int i=0; i < n; i++){
            count[a[i]-menor]++;
        }
 
        
        for (int i=1; i<=c-1; i++){
            count[i] += count[i-1];
        }
 
              
        for (int i = 0; i < c; i++)
            while (j < count[i])
                a[j++] = i + menor;     
     
     }
      
 } 
