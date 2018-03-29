public class linearSearch {
    //リニアサーチの実装
    public static int execute(int[] data, int target){
        //見つからなかった際の戻り値
        int notFound = -1;
        for(int i = 0; i < data.length; i++){
            if(data[i] == target){
            // 配列のインデックスを返す
                return i;
            }
        }
        return notFound;
    }
    public static void main(String[] args){
        int[] data = {1, 2, 3, 4, 5};
        int result;
        //3を持っているインデックスを返す
        result = linearSearch.execute(data, 3);
        if(result != -1) {
            System.out.println("Found: index key = " + result);
        }
        else{
            System.out.println("Not found.");
        }

    }

}
