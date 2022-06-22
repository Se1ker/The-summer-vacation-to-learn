public class insert {
    public static int[] insertSort(int arr[]) {
        // temp来保存当前需要插入的元素
        int temp;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            temp = arr[i];
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 321, 123, 122, 111 };
        arr = insertSort(arr);
        for (int k : arr) {
            System.out.println(k);
        }
    }
}
