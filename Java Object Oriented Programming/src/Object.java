public class Object {
    public static void main(String[] args) {

        /*
        Membuat Object
        * Object adalah hasil instansiasi dari sebuah class
        * Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung()
         */
        /**
         * kata kuncinya new
         * var person 1 = new Person ();
         * lalu panggil person1.name = "";
         1. Kamu memanggil constructor dari class Person (yaitu Person())
         2. Lalu membuat objek baru dimemori,
         3. Dan hasil objek itu disimpan di variabel person1
         * Kenapa harus pakai new? karena class itu cuma blueprint (cetak biru), bukan objeknya langsung. Kalau
         kamu mau bikin objek beneran dari blueprint itu, kamu perlu pakai new
         * Contohnya kayak kamu punya cetakan kue (class Person), terus kalau mau punya kue beneran (objek person1),
         kamu harus cetak dulu pakai adonan (new person())
         */
        // new person () awalnya error maka kita wajib untuk memasukkan dan menggunakan parameter yang sudah diisi di class sebelumnya
        var person1 = new Person("Eko","Subang", "09121212");// person1 itu hanya variabel (tempat menyimpan).
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Rizki"); //pemanggilan method
        // pada dasarnya menggunakan constructor akan memaksa kita untuk mengisi data sesuai yang kita tambahkan di class
        Person person2 = new Person("Eko"); // new Person() itu yang membuat objek di memori
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        Person person3 = new Person();// jadi, person1 menyimpan alamat objek dari new Person ()
        person3.address = "Satria";
        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
        /*
        Person = cetakan kue,
        new Person() = bikin kue dari cetakan
        person1 = piring tempat naruh kuenya.
         */



    }
}
