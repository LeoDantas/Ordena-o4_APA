import java.util.ArrayList;

public class BucketSort {
	
	public static void Bsort(int[] a) {
	    int maxvalor = a[0], minvalor = a[0];
		
    	for(int j = 1 ; j < a.length;j++){
    	   if(a[j]> maxvalor)
    	   maxvalor = a[j];
    		else if(a[j] < minvalor)
    			minvalor = a[j];
    	}

    	int dif = maxvalor - minvalor;
    	int numBuckets = (int)(a.length * 0.2);
    	int divFat = maxvalor/numBuckets;

    	ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
    	
    	int x = 0;
    	while(x < (numBuckets)+1){
    		buckets.add(new ArrayList<Integer>());
    		x++;
    	}
	      
	    for(int i = 0; i < a.length; i++){
	    	ArrayList<Integer> temp = buckets.get((a[i]-minvalor)/divFat);

	    	if(temp.size() == 0){
	    		temp.add(a[i]);
	    	}else{
	    		int aux = a[i];
	    		for(int j = 0; j < temp.size(); j++){
	    			if(aux<temp.get(j)){
	    				int aux2 = temp.get(j);
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
