import java.util.Arrays;
import java.util.Scanner;

public class Main{

public static void main(String[] args) {
     int x;
     //x = Integer.parseInt(args[0]);
   	
   	long tempoInicial,tempoFinal;	
   	Scanner input = new Scanner(System.in);
		
		
		int n = input.nextInt();

		long a[] = long int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = input.nextLong();
		}
    
     long max = Long.MIN_VALUE;
      for(int j = 0 ; j < a.length;j++){
         if(a[j]> max)
         max = a[j];
      }


         long min = Long.MAX_VALUE;

         for (int i = 0; i < a.length; ++i) {
             if (a[i] < min) { 
                 min = a[i];
                
             }
         }
        
    
    int digitosMaior = numDigitos(max);
    int cont = 0;


    for(int i = 0; i < a.length;i++){

      if (numDigitos(a[i]) == digitosMaior){
        cont = cont++;
      }
    }
   
   
    
    if(max < 100000){
      CounSort c = new CounSort();
      c.Csort(a);
      System.out.println("Sou o CountingSort");
      for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }
    }else if((max-min)<10000){
      BucketSort b = new BucketSort();
      b.Bsort(a);
      System.out.println("Sou o BucketSort");
      for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }
    }else if(cont >= a.length * .6){
      RadixSort r = new RadixSort();
      r.Rsort(a,a.length);
      System.out.println("Sou o RadixSort");
      for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }
    }else if(a.length <= 500000){
      QuickSort q = new QuickSort();
      q.quick_sort(a,0,(a.length-1));
      System.out.println("Sou o QuickSort");
      for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }
    }else{
        HeapSort h = new HeapSort();
        h.sort(a);
        System.out.println("Sou o HeapSort");
        for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }
    }


    /*

      switch(x){

      case 1:
      tempoInicial = System.currentTimeMillis(); 
      CounSort c = new CounSort();
      c.Csort(a);
      tempoFinal = System.currentTimeMillis();  
      System.out.println(" Tempo:"+(tempoFinal - tempoInicial) / 1000d);
        
        for(int k = 0;k<n;k++){
        System.out.println(a[k]);
      }

      break;

      case 2:
	  
		BucketSort b = new BucketSort();
		b.Bsort(a);
        for (int k = 0; k<n; k++){
           System.out.println(a[k]);
        }
        break;

       case 3:
	  
		RadixSort r = new RadixSort();
		r.Rsort(a,a.length);
        for (int k = 0; k<n; k++){
           System.out.println(a[k]);
        }
        break; 
    }
*/
	}
  

public static int numDigitos(int num){
  int cont = 0;
  while(num !=0) {
      num = num/10;
      cont++;
    } 
    return cont;

  }


}

