import java.util.Scanner;

public class ARMstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int origNumber = number;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }
        
        if (sum == origNumber) {
            System.out.println("the number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }
        
        sc.close();
    }
}