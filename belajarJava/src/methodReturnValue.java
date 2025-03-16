public class methodReturnValue {
    public static void main(String[] args) {

        /*
        Method Return Value
        * Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah
        method mengembalikan nilai
        * Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
        * Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return, lalu
        diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method
        * Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
         */
        System.out.println(hitung(99, 200)); //output 299
        System.out.println(hitung2(100, "+" ,200)); //output 300 jika ingin mengecek nilai koma nya jangan lupa diperhatikan baik itu return value int atau String

    }

    static int hitung(int x, int y) {
        var total = x + y;
        return total;
    }

    static int hitung2(int nilai1, String operasi, int nilai2) {
        switch (operasi) {
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            case "*":
                return nilai1 * nilai2;
            case "/":
                return nilai1 / nilai2;
            default:
                return 0;
        }

    }
}
