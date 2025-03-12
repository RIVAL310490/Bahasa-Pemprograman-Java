import java.util.Scanner;
public class calculatorBMI {
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








    }
}
