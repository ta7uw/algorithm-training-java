public class binarySearch {
    public static boolean execute(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (data[middle] == target) {
                return true;
            } else if (data[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] data = {23, 25, 53, 444, 5466, 12646};
        boolean result;
        //255を持っているインデックスを返す
        result = binarySearch.execute(data, 25);
        if (result){
            System.out.println("Found!");
        }
        else {
            System.out.println("Not Found.");
        }
    }

}