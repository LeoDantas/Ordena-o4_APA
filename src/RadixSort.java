import java.util.Arrays;

public class RadixSort {
	static long MaxValor(long a[], int n){
		
        long mx = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > mx)
                mx = a[i];
        return mx;
    }

    static void countSort(long a[], int n, int exp){
    	
        long output[] = new long[n]; 
        int i;
        long maior,menor;
        maior = menor = a[0];

        for(i = 0; i < n; i++){
            if(a[i] > maior) maior = a[i];
            else if(a[i]<menor) menor = a[i];
        }

        int count[] = new int[(int) (maior-menor)];
        
        for (int j=0; j<count.length; ++j){
            count[j] = 0;
        }

        for (i = 0; i < n; i++)
            count[(int) ((a[i]-menor)/exp)%10 ]++;
 

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; i >= 0; i--){
        	
            output[count[ (int)((a[i]-menor)/exp)%10 ] - 1] = a[i];
            count[(int) ((a[i]-menor)/exp)%10 ]--;
        }
 

        for (i = 0; i < n; i++)
            a[i] = output[i];
    }
 
   
    public static void Rsort(long a[], int n){
    	
        long m = MaxValor(a, n);
 
        
        for (int exp = 1; (int)m/exp > 0; exp *= 10)
            countSort(a, n, exp);
    }

}
