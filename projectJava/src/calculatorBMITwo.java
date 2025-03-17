import java.util.Scanner;
public class calculatorBMITwo {
    public static void main(String[] args) {

        /*
        Body Mass Index / Kalkulator indeks massa tubuh untuk mengetahui apakah berat badan anda ideal atau tidak
        Sumber: alodokter.com
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight (Kg): ");
        double weightKilogram = input.nextDouble();
        System.out.print("Please enter your height (Cm): ");
        double heightCentimeter = input.nextDouble();
        double centimeterToMeter = heightCentimeter / 100;
        double heightMeter = centimeterToMeter * centimeterToMeter;
        double calculateBMI = weightKilogram / heightMeter;
        System.out.println(calculateBMI);

        if (calculateBMI <= 18.49) {
            System.out.println("You are underweight");
        } else if (calculateBMI >= 18.5 && calculateBMI <= 24.9) {
            System.out.println("You are ideal");
        } else if (calculateBMI >= 25 && calculateBMI <= 27) {
            System.out.println("You are overweight");
        } else if (calculateBMI > 27) {
            System.out.println("You are Obesity");
        } else {
            System.out.println("Please enter the correct input");
        }

        System.out.println("Do you want to know your ideal body weight?");
        System.out.println("1. Yes / 2. No");
        System.out.println("Select one with number: ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("Are you male or Female? \s 1. Male / 2.Female");
            System.out.print("Choose: ");
            int choose = input.nextInt();
            if (choose == 1) { // Paul Broca's formula
                double idealBodyWeight = (heightCentimeter - 100) - (heightCentimeter - 100) * 10/100;
                System.out.println("Your ideal body weight is " + idealBodyWeight);
            } else if (choose == 2) {
                double idealBodyWeight = (heightCentimeter - 100) - (heightCentimeter - 100) * 15/100;
                System.out.println("Your ideal body weight is " + idealBodyWeight);
            } else{
                System.out.println("Thank you for using our ideal body weight");
            }

        } else {
            System.out.println("Thank you for using our ideal body weight");
        }







    }
}
