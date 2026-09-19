import java.util.Scanner;

public class BMICalculator {

    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("\nPerson     | Height (m)   | Weight (kg)  | BMI      | Status");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);
            String status = getBmiStatus(bmi);

            System.out.printf("Person %-3d | %-12.2f | %-12.2f | %-8.2f | %-12s\n", (i + 1), heights[i], weights[i], bmi, status);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamSize = 10;

        double[] heights = new double[teamSize];
        double[] weights = new double[teamSize];

        for (int i = 0; i < teamSize; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Height in meters (e.g. 1.75): ");
            heights[i] = sc.nextDouble();

            System.out.print("Weight in kg (e.g. 70): ");
            weights[i] = sc.nextDouble();
        }

        printWellnessReport(heights, weights);

        sc.close();
    }
}