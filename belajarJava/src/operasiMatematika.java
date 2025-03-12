public class operasiMatematika {
    public static void main(String[] args) {

        /*
        Operator
        +  // Penjumlahan
        -  // Pengurangan
        *  // Perkalian
        /  // Pembagian
        %  // Sisa pembagian atau modulo
         */

        int a = 100;
        int b =10;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        /*
        Augmented Assignments
        Operasi Matematika      Augmented Assignments
        a = a + 10              a += 10
        a = a - 10              a -= 10
        a = a * 10              a *= 10
        a = a / 10              a /= 10
        a = a % 10              a %= 10
         */

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        /*
        Unary Operator
        Operator
        ++ // a = a + 1
        -- // a = a - 1
        - // Negative
        + // Positive
        ! //Boolean kebalikan
         */

        int d = 100;

        d++; // Menaikkan value satu angka
        System.out.println(d);

        d--;
        System.out.println(d);
        System.out.println(!true);





    }
}
