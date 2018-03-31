public class bucketSort {

    public static void sort(int[] array, int maxValue){
        int[] bucket = new int[maxValue + 1];

        for (int i = 0; i < bucket.length; i++){
            bucket[i] = 0;
        }

        for (int i = 0; i < array.length; i++){
            bucket[array[i]] ++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++){
            for (int j = 0; j < bucket[i]; j++){
                array[outPos++] = i;
            }
        }
    }


    public static void main(String[] args) {
        int[] test
                = {10, 75, 24, 32, 98,
                72, 88, 43, 60, 35,
                54, 62, 2, 12, 82,
        };
        bucketSort.sort(test, 100);
        //ソートの結果の確認
        for (int i = 0; i < test.length; i++) {
            System.out.println((i + 1) + ":" + test[i]);
        }
    }
}
