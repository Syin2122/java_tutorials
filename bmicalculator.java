import java.util.Scanner;

public class BMICalculator {

    static String getBmiStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("Person | Height | Weight | BMI | Status");

        for (int i = 0; i < heights.length; i++) {
            double bmi = weights[i] / (heights[i] * heights[i]);

            System.out.printf("%d | %.2f | %.2f | %.2f | %s%n",
                i + 1, heights[i], weights[i],
                bmi, getBmiStatus(bmi));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[10];
        double[] weights = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter height in meters for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();

            System.out.print("Enter weight in kg for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
        }

        printWellnessReport(heights, weights);
        sc.close();
    }
}
