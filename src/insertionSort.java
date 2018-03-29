public class insertionSort {

    public static void sort(int[] array){
        for(int i = 1; i < array.length; i++){
            int j = i;
            while(j >= 1 && array[j-1] > array[j]){
                int tmp = array[j];
                array[j] = array[j - 1];
                array[j-1] = tmp;
                j --;

            }
        }

    }

    public static void main(String[] args){
        int[] test
                = { 10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62,  2, 12, 82,
        };
        insertionSort.sort(test);
        //ソートの結果の確認
        for( int i=0; i<test.length; i++ ) {
            System.out.println( (i+1) + ":" + test[i] );
        }

    }
}
