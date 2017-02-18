import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

public static void main(String[] args) {
     //int x;
     //x = Integer.parseInt(args[0]);
   	
   	long tempoInicial,tempoFinal;	
   	Scanner input = new Scanner(System.in);
		
		//tamanho do vetor
		int n = input.nextInt();

		long a[] = new long[n];
		//preenchimento do vetor
		for(int i = 0; i < n; i++){
			a[i] = input.nextLong();
		}
    
    //calcular menor e maior valor do vetor
     long min,max;
     min = max = a[0];
      for(int j = 0 ; j < a.length;j++){
        if(a[j]> max)
          max = a[j];
        else if (a[j] < min)
          min = a[j];
      }
    
    //quantidade de dígitos do maior vetor
    int digitosMaior = numDigitos(max);
    int cont = 0;

    //contagem de quantos elementos possuem a mesma quantidade de dígitos do vetor
    for(int i = 0; i < a.length;i++){
      if (numDigitos(a[i]) == digitosMaior){
        cont = cont++;
      }
    }

    //teste do uso do bucket sort
    int numBuckets = (int)(n * 0.2);
    int contZeros = 0;
    if(max<Integer.MAX_VALUE){
      int dif = (int)(max - min);
      
      int divFat = (dif/numBuckets)+1;

      int[] contBuckets = new int[numBuckets];

      for(int i =0; i < n; i++){
        contBuckets[(int)((a[i]-min)/divFat)]++;
      }

      for(int i = 0; i < numBuckets; i++) {
        if(contBuckets[i] == 0){
          contZeros++;
        }
      }
    }
   
   
    
    if((max-min) < 100000){//entra se a variação de valores do vetor for menor de 10.000
      CounSort c = new CounSort();
      System.out.println("CountingSort");
      tempoInicial = System.currentTimeMillis(); 
      c.Csort(a);
      System.out.println("CountingSort - Tempo: "+(System.currentTimeMillis() - tempoInicial)+" ms");
    
    }else if((((contZeros < (n*0.4)) && numBuckets < 100000)|| (max-min)<10000) && max < Integer.MAX_VALUE){
      BucketSort b = new BucketSort();
      System.out.println("BucketSort");
      tempoInicial = System.currentTimeMillis(); 
      b.Bsort(a);
      System.out.println("BucketSort - Tempo: "+(System.currentTimeMillis() - tempoInicial)+" ms");
    
    }else if(cont >= a.length * .6){//entra se possuir se 60% do vetor tiver a mesma quantidade de dígitos do maior elemento
      RadixSort r = new RadixSort();
      System.out.println("RadixSort");
      tempoInicial = System.currentTimeMillis();
      r.Rsort(a,a.length);
      System.out.println("RadixSort - Tempo: "+(System.currentTimeMillis() - tempoInicial)+" ms");
    
    }else if(a.length <= 500000){//
      QuickSort q = new QuickSort();
      System.out.println("QuickSort");
      tempoInicial = System.currentTimeMillis();
      q.quick_sort(a,0,(a.length-1));
      System.out.println("QuickSort - Tempo: "+(System.currentTimeMillis() - tempoInicial)+" ms");
      
    }else{
        HeapSort h = new HeapSort();
        System.out.println("HeapSort");
        tempoInicial = System.currentTimeMillis();
        h.sort(a);
        System.out.println("HeapSort - Tempo: "+(System.currentTimeMillis() - tempoInicial)+" ms");
    }

    for(long num:a){
      System.out.println(num);
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
  

public static int numDigitos(long num){
  int cont = 0;
  while(num !=0) {
      num = num/10;
      cont++;
    } 
    return cont;

  }


}

