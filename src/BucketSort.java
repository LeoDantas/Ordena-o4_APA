import java.util.ArrayList;

public class BucketSort {
	
	public static void Bsort(long[] a) {
	    long maxvalor = a[0], minvalor = a[0];
		
    	for(int j = 1 ; j < a.length;j++){
    	   if(a[j]> maxvalor)
    	   maxvalor = a[j];
    		else if(a[j] < minvalor)
    			minvalor = a[j];
    	}

    	long dif = maxvalor - minvalor;
    	long numBuckets = (long)(a.length * 0.2);
    	long divFat = (dif/numBuckets)+1;

    	ArrayList<ArrayList<Long>> buckets = new ArrayList<ArrayList<Long>>();
    	
    	long x = 0;
    	while(x < (numBuckets)+1){
    		buckets.add(new ArrayList<Long>());
    		x++;
    	}
	      
	    for(int i = 0; i < a.length; i++){
	    	ArrayList<Long> temp = buckets.get((int)((a[i]-minvalor)/divFat));

	    	if(temp.size() == 0){
	    		temp.add(a[i]);
	    	}else{
	    		long aux = a[i];
	    		for(int j = 0; j < temp.size(); j++){
	    			if(aux<temp.get(j)){
	    				long aux2 = temp.get(j);
	    				temp.set(j,aux);
	    				aux = aux2;
	    			}
	    		}
	    		temp.add(aux);
	    	}

	    }
	 

	    int contA = 0;
	    for(int i = 0; i < buckets.size(); i++){
	    	if(buckets.get(i).size() > 0){
	    		for(int j = 0; j < buckets.get(i).size();j++){
	    			a[contA] = buckets.get(i).get(j);
	    			contA++;
	    		}
	    	}
	    	
	    }
	   }

}
