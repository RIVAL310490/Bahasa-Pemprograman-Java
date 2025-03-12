public class Variable {
    public static void main(String[] args) {

        /*
        Variable
        * Variable adalah tempat untuk menyimpan data
        * Java adalah bahasa static type, sehingga sebuah variable hanya bisa digunakan untuk menyimpan tipe data yang
         sama, tidak bisa berubah-ubah tipe data seperti di bahasa pemrograman PHP atau JavaScript
        * Untuk membuat variable di Java kita bisa menggunakan nama tipe data lalu diikuti dengan nama variable nya
        * Nama variable tidak boleh mengandung whitespace (spasi,enter,tab) dan tidak boleh seluruhnya number
         */

        String name;
        name = "Rival Alvian Melfandy";

        System.out.println(name);

        int age;
        age = 20;
        String addres = "Indonesia";

        System.out.println(age);
        System.out.println(addres);

        name = "Mesut Ozil";
        System.out.println(name);

        age = 63;
        System.out.println(age);

        /*
        Kata Kunci var
        * Sejak versi Java 10, Java mendukung pembuatan variabel dengan kata kunci var, sehingga kita tidak perlu
        menyebutkan tipe datanya
        * Namun perlu diingat, saat kita menggunakan kata kunci var untuk variable, kita harus menginisiasi value/nilai
        dari variabel tersebut secara lansung
        * Kesimpulan (var) bisa buat apa saja tapi harus langsung diisi dan tidak bisa dipakai lebih dari dua kali
         */

        var namaAyah = "Iker Casillas";
        var namaIbu = "Gianluigi Buffon";
        var gaji = 100_000_000;

        System.out.println(namaAyah + namaIbu + gaji);

        /*
        Kata Kunci final
        * Secara default, varible di Java bisa dubah-ubah nilainya.
        * Jika kita ingin membuat sebuah variabel yang datanya tidak boleh diubah setelah pertama kali dibuat, kita bisa
        menggunakan kata kunci final
        * Istilah variabel seperti ini, banyak juga yang menyebutnya konstan
         */

        // Kode: Kata Kunci final

        final String nameAdik = "Karim Benzema"; // tidak akan bisa diubah atau variabelnya dipakai dua kali

    }
}
