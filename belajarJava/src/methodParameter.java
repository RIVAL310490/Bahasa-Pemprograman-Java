public class methodParameter {
    public static void main(String[] args) {

        /*
        Method Parameter
        * Kita bisa mengirim informasi ke method yang ingin kita panggil
        * Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
        * Cara membuat parameter sama seperti cara membuat variabel
        * Parameter ditempatkan di dalam kurung () di deklarasi method
        * Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
         */

        sayHello("Rival", "Alvian");
        sayHello("Upin", "Melfandy");
        sayHello("Ronaldo", "Messi");


    }
    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
