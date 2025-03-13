public class ifStatement {
    public static void main(String[] args) {

        /*
        If Statement
        * Dalam Java, if adalah salah satu kunci yang digunakan untuk percabangan
        * Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
        * Hampir di semua bahasa pemrograman mendukung if expression

        Else Statement
        * Blok if akan dieksekusi ketika kondisi if bernilai true
        * Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai true
        * Hal ini bisa dilakukan menggunakan else expression

        Else If Statement
        * Kadang dalam If, kita butuh membuat beberapa kondisi
        * Kasus seperti ini, di Java kita bisa menggunakan Else If expression
        * Else if di Java bisa lebih dari satu
         */



        var nilai = 75;
        var absen = 90;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Silahkan coba lagi tahun depan");
        }

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Nilai Anda E");
        }


    }
}
