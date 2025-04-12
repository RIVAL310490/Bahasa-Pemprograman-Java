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
         1. Kamu memanggil constructor dari class Person (yaitu Person())
         2. Lalu membuat objek baru dimemori,
         3. Dan hasil objek itu disimpan di variabel person1
         * Kenapa harus pakai new? karena class itu cuma blueprint (cetak biru), bukan objeknya langsung. Kalau
         kamu mau bikin objek beneran dari blueprint itu, kamu perlu pakai new
         * Contohnya kayak kamu punya cetakan kue (class Person), terus kalau mau punya kue beneran (objek person1),
         kamu harus cetak dulu pakai adonan (new person())
         */
        var person1 = new Person();// person1 itu hanya variabel (tempat menyimpan).
        person1.name = "Rival";
        person1.address = "Garuda Street";
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Khan"); //pemanggilan method 
        Person person2 = new Person(); // new Person() itu yang membuat objek di memori
        person2.name = "\nRifan";
        person2.address = "Cahaya Street";
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        Person person3 = new Person(); // jadi, person1 menyimpan alamat objek dari new Person ()
        /*
        Person = cetakan kue,
        new Person() = bikin kue dari cetakan
        person1 = piring tempat naruh kuenya.
         */



    }
}
