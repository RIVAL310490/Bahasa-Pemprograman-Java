public class ternaryOperator {
    public static void main(String[] args) {

        /*
        Ternary Operator
        * Ternary operator adalah operator sederhana dari if statement
        * Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika
        false, maka nilai kedua diambil
         */

        // Kode: tanpa ternary operator
        var nilai = 75;
        String ucapan;

        if ( nilai >= 70) {
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Silahkan coba lagi";
        }

        System.out.println("Hasil 1: " + ucapan);

        /*
        Syntax ternaryOperator
        variable = (condition) ? expressionTrue : expressionFalse;
         */

        //Kode: Dengan Ternary Operator
        var nilai2 = 80;
        String ucapan2 = nilai2 >= 80 ? "Selamat anda masuk UGM" : "Silahkan coba lagi";
        System.out.println("Hasil 2: " + ucapan2);



    }
}
