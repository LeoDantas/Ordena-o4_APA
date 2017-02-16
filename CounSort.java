import java.util.Arrays;

public class CounSort
{

     private static int getMaiorElemento (long[] v, int inicio,int fim) {
         int indice = -1;
         long max = v[0];
         for (int i = inicio; i < fim; ++i) {
             if (v[i] > max) { 
                max = v[i]; 
                indice = i;
                
             }
         }
         return indice;
     }
    private static int getMenorElemento (long[] v, int inicio, int fim) {
         int indice = -1;
         long min = v[0];
         for (int i = inicio; i < fim; ++i) {
             if (v[i] < min) { 
                 min = v[i];
                indice = i;
             }
         }
         return indice;
     }


    public static void Csort(long a[])
    {
        
       
        long menor = a[getMenorElemento(a, 0, a.length)];  
        long maior = a[getMaiorElemento(a, 0, a.length)];
        int j = 0;
        int n = a.length;
     
        long output[] = new long[n];
 
        long count[] = new long[(int)(maior-menor+1)];
        long c = count.length;
        
        for (int i=0; i<c; ++i){
            count[i] = 0;
        }
 
        
        for (int i=0; i < n; i++){
            count[(int)(a[i]-menor)]++;
        }
 
        
        for (int i=1; i<=c-1; i++){
            count[i] += count[i-1];
        }
 
              
        for (int i = 0; i < c; i++)
            while (j < count[i])
                a[j++] = i + menor;     
     
     }
      
 } 
