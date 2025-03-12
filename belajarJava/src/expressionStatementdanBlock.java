public class expressionStatementdanBlock {
    public static void main(String[] args) {

        /*
        Expression
        * Expression adalah konstruksi dari variabel, operator dan pemanggilan method yang mengevaluasi menjadi
        sebuah single value
        * Expression adalah core component dari statement
         */

        int value;
        value = 10; // ini expression

        System.out.println(value = 100); // ini statement value = 100 itu ekspresi

        /*
        Statement
        * Statement bisa dibilang adalah kalimat lengkap dalam bahasa
        * Sebuah statement berisikan execution komplit, biasanya diakhiri dengan titik koma
        * Ada beberapa jenis statement:
            1. Assignment expression
            2. Penggunaan ++ dan --
            3. Method invocation
            4. Object creation expression
         */

        double aValue = 8933.234; //assignment statement
        aValue ++; // increment statement
        System.out.println("Hello World"); // method invocation statement
        // Date date = new Date(); // object creation statement

        /*
        Block
        * Block adalah kumpulan statement yang terdiri dari nol atau lebih statement
        * Block diawali dan diakhiri dengan kurung kurawal
         */






    }
}
