public class methodParameter2 {
    // Umumnya if... else pernyataaan digunakan di dalam metode: w3school.com
    static void checkAge(int age) { // Create a checkAge() method with an integer variable called age
        if (age < 18) {
            System.out.println("Access denied - You are not old enough");
        } else {
            System.out.println("Access granted - You are old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(17); // Call the checkAge method and pass along an age of 17
    }
}
