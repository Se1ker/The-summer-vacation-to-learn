public class select {
    public static int[] selectSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,321,123,122,111};
        arr = selectSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
