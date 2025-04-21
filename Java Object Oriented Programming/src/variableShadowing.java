public class variableShadowing {
    public static void main(String[] args) {

        /*
        Variable Shadowing
        * Variable shadowing adalah kejadikan ketika kita membuat nama variable dengan nama yang sama di scope yang
        menutupi variable dengan nama yang saam di scope  diatasnya
        * Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
        * Saat terjadi variable shadowing, maka secara otomatis variable di scope diatasnya tidak bisa diakses
         */

        /**
         * Kode: Variable Shadowing
         // Class.java
         class Person {
         String name;
         String address;
         final String country = "Indonesia";

         Person (String name, String address) {
         name = name; // field nama tidak berubah // variable shadowing
         address = address; // field address tidak berubah // variable shadowing
         }

         Person (String name) {
         name = name; // field nama tidak berubah // variable shadowing

         void sayHello (String name) {
         sout("Hello" + name + ", My name is" + name); // field name tidak diakses
         }

         // Object.java
         Person person2 = new Person (name: "rival"); // variable shadowing
         sout(person2.name)
         output: null
         */


    }
}
