public class komentar {
    public static void main(String[] args) {

        /*
        * Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
        * Komentar adalah kode program yang akan dihiraukan saat proses kompilasi, sehingga di binary code Java, tidak
        akan ada kode komentar tersebut
        * Biasanya komentar digunakan untuk dokumentasi
         */

    /*
    (ini adalalah komentar multiline)
     */
    // (ini adalah komentar singleline

        /**
         * (Ini adalah komentar java doc) arahkan ke kodingan yang ingin dijelaskan
         */
        System.out.println(sum(20,30));
    }

    /**
     * Method untuk menjumlahkan value 1 dan value 2
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penjumlahan value a dan value b
     */
    static int sum (int a, int b){
        // jumlahkan value1 + value 2
        return a+b;
    }
}
