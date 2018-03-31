public class countingSort {

    public static int[] sort(int[] array, int maxValue){
        int[] counts = new int[maxValue + 1];

        for (int i = 0; i < array.length; i ++){
            counts[array[i]] ++;
        }

        int total = 0;
        for (int i =0 ;i <= maxValue; i++){
            int count = counts[i];
            counts[i] = total;
            total += count;
        }

        int[] sortedValues = new int[array.length];
        for (int i = 0; i < array.length; i++){
            sortedValues[counts[array[i]]] = array[i];
            counts[array[i]] ++ ;
        }
        return sortedValues;


    }

    public static void main(String[] args) {
        int[] test
                = {10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62, 2, 12, 82, 2, 12, 12
        };
        test = countingSort.sort(test, 100);
        //ソートの結果の確認
        for (int i = 0; i < test.length; i++) {
            System.out.println((i + 1) + ":" + test[i]);
        }
    }

}
