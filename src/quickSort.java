public class quickSort {

    public static void sort(int[] array, int left, int right){
        if(left <= right){
            int p = array[(left + right)/2];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l ++;
                }
                while (array[r] > p){
                    r --;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++ ;
                    r-- ;
                }
            }
            quickSort.sort(array, left, r);
            quickSort.sort(array, l, right);
        }
    }

    public static void main(String[] args){
        int[] test
                = { 10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62,  2, 12, 82,
        };
        quickSort.sort(test, 0, test.length-1);
        //ソートの結果の確認
        for( int i=0; i<test.length; i++ ) {
            System.out.println( (i+1) + ":" + test[i] );
        }

    }
}
