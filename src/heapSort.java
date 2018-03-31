public class heapSort {

    public static void sort(int[] array) {
        int n = array.length;

        //Build heap
        for (int i = n /2 -1; i>=0; i--){
            heap(array, n, i);
        }
        // One by one extract an element from heap
        for (int i = n-1 ; i>=0; i --){
            if (array[0] > array[i]) {
                int tmp = array[0];
                array[0] = array[i];
                array[i] = tmp;

                // Call max heap on the reduced heap
                heap(array, i-1, 0);
            }

        }
    }
    // To heap a subtree rooted with node i which is
    // an index in array[]. n is size of heap
    public static void heap(int[] array, int n , int root){
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // If left child is larger than root
        if (left < n && array[left] > array[largest]){
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest]){
            largest = right;
        }

        if (largest != root){
            int swap = array[root];
            array[root] = array[largest];
            array[largest] = swap;

            // Recursively heap the affected sub-tree
            heap(array, n ,largest);
        }
    }


    public static void main(String[] args) {
        int[] test
                = {10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62, 2, 12, 82,
        };
        heapSort.sort(test);
        //ソートの結果の確認
        for (int i = 0; i < test.length; i++) {
            System.out.println((i + 1) + ":" + test[i]);
        }
    }
}
