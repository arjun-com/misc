import java.util.Scanner;

public class programOne {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Enter number : ");
            nums[i] = sc.nextInt();
        }

        int nums_sq[] = new int[5];

        for(int i = 0; i < 5; i++) nums_sq[i] = nums[i] * nums[i];
        for(int i = 0; i < 5; i++) System.out.println(nums_sq[i]);
    }
}
