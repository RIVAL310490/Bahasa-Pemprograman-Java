public class method {
    public static void main(String[] args) {

        /*
        Method
        * Method adalah block kode program yang akan berjalan saat kita panggil
        * Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
        * Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung()
        dan diakhiri dengan block
        * Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung()
        * Di bahasa pemrograman lain, Method juga disebut dengan Function
         */

       sayHelloWorld();
       sayHelloWorld();
       sayHelloWorld(); //kalau dipanggil tiga kali methodnya juga akan kepanggil 3 kali



    }
    static void sayHelloWorld() {
        System.out.println("Hello World 1");
        System.out.println("Hello World 2");
        System.out.println("Hello World 3");

    }
}
