public class bubble {

    public static void main(String[] args) {
        int a[] = {1,23,42,2};
        int res[] = bubble.bubbleSort(a);
        for(int i : res){
            System.out.println(i);
        }
    }

    public static int[] bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}