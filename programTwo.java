import java.util.Scanner;

public class programTwo {
    static int[] reverse(int a[], int len) {
        int nums[] = new int[len];
        int j = len;
        for (int i = 0; i < len; i++) {
            nums[j - 1] = a[i];
            j = j - 1;
        }
  
        return nums;
    }
  
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10];
        for(int i = 0; i < 10; i++) nums[i] = sc.nextInt();
        int res[] = reverse(nums, nums.length);
        
        for(int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
    
}
