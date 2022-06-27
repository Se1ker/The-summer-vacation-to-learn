public class EOR {
    public static void printOddTimesNum2(int[] arr) {
        // 假设一个数组里有两个出现了奇数次的数，其他都是偶数次，且这两个数不相等，找出这两个数
        // 找出a^b
        int eor = 0;
        for(int item : arr){
            eor ^= item;
        }
        // eor = a ^ b
        // eor!= 0
        // eor 必然有一个bit是1
        int rightOne = eor & (~eor + 1); // 提取出最右边bit的1
        int onlyOne = 0; // eor'
        //此处判断可以是：等于rightOne（筛出第i位为1的）,等于0（筛出第i位为0的），
        //大于等于1（筛出第i位为1的）。就是不能等于1
        for(int cur : arr){
            if((cur & rightOne) != 0){
                onlyOne ^= cur;
            }
        }
        System.out.println(onlyOne+" "+(eor ^ onlyOne));
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,2,2,4,4,4,4};
        printOddTimesNum2(arr);
    }
}
