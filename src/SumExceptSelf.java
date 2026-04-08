import java.util.Scanner;

public class SumExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        int n = sc.nextInt();

        int[] nums = new int[n];
        int totalSum = 0;

        // Read array elements and calculate total sum
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            totalSum += nums[i];
        }

        // Compute and print result
        for (int i = 0; i < n; i++) {
            System.out.print((totalSum - nums[i]) + " ");
        }

        sc.close();
    }
}
