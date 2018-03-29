
public class shellSort {
    public static void sort(int[] array){
        int h = array.length / 2;

        while(h > 0){
            for(int i=h; i < array.length; i++){
                int j = i;
                while(j >= h && array[j - h] > array[j]){
                    int tmp = array[j];
                    array[j] = array[j-h];
                    array[j-h] = tmp;
                    j --;
                }
            }
            h /= 2;
        }

    }


    public static void main(String[] args){
        int[] test
                = { 10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62,  2, 12, 82,
        };
        shellSort.sort(test);
        //ソートの結果の確認
        for( int i=0; i<test.length; i++ ) {
            System.out.println( (i+1) + ":" + test[i] );
        }

    }
}

