public class merge {
    public static int[] slice(int arr[],int start,int end){   
    int res[] = {};
    for(int i = start; i < end; i++){
        res[res.length] = arr[i];
    }
    return res; 
    }

    public static int[] mergeSort(int arr[]) {
        int len = arr.length;
        if (len <= 1) {
            return arr;
        }
        double mid = Math.floor(len / 2);
        int leftArr[] = mergeSort(slice(0, (int) mid));
    }

    public static void main(String[] args) {

    }
}
