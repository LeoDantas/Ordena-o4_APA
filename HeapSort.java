public class HeapSort {

    private static int total;

    private static void swap (long[] arr, int a, int b)
    {
         long tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private static void heapify( long[] arr, int i)
    {
        int esq = i * 2;
        int dir = esq + 1;
        int pai = i;

        if (esq <= total && arr[esq]>arr[pai]){
            pai = esq;
        } 
        if (dir <= total && arr[dir] > arr[pai]){
         pai = dir;
        } 
        if (pai != i) {
            swap(arr, i, pai);
            heapify(arr, pai);
        }
    }

    public static void sort( long[] arr)
    {
        total = arr.length - 1;

        for (int i = total / 2; i >= 0; i--)
            heapify(arr, i);

        for (int i = total; i > 0; i--) {
            swap(arr, 0, i);
            total--;
            heapify(arr, 0);
        }
    }

     
    
    
}

