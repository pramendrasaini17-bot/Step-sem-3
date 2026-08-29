 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of elements:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.print("Enter target:");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("Enter the numbers= ");
            nums[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
} 
    

