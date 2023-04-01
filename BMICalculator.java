import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = calculateBMI(weight, height);
        String status = getStatus(bmi);

        System.out.printf("your BMI is %.2f and your status is %s.", bmi, status);
        input.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";

        } else if (bmi < 25) {
            return "Normalweight";

        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
