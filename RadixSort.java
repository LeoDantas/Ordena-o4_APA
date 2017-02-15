import java.util.Arrays;

public class RadixSort {
	static int MaxValor(int a[], int n){
		
        int mx = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > mx)
                mx = a[i];
        return mx;
    }

    static void countSort(int a[], int n, int exp){
    	
        int output[] = new int[n]; 
        int i;
        int count[] = new int[10];
        
        for (int j=0; j<count.length; ++j){
            count[j] = 0;
        }

        for (i = 0; i < n; i++)
            count[ (a[i]/exp)%10 ]++;
 

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; i >= 0; i--){
        	
            output[count[ (a[i]/exp)%10 ] - 1] = a[i];
            count[ (a[i]/exp)%10 ]--;
        }
 

        for (i = 0; i < n; i++)
            a[i] = output[i];
    }
 
   
    public static void Rsort(int a[], int n){
    	
        int m = MaxValor(a, n);
 
        
        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(a, n, exp);
    }

}
