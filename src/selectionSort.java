public class selectionSort {
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++ ){
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            if(i != index){
                int tmp = array[index];
                array[index] = array[i];
                array[i] = tmp;

            }
        }
    }
    public static void main(String[] args){
        int[] test
                = { 10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62,  2, 12, 82,
        };
        selectionSort.sort(test);
        //ソートの結果の確認
        for( int i=0; i<test.length; i++ ) {
            System.out.println( (i+1) + ":" + test[i] );
        }

    }
}
