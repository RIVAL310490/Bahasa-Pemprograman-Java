public class forEach {
    public static void main(String[] args) {

        /*
        For Each
        * Kadang kita biasa mengakses data array menggunakan perulangan
        * Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter, lalu mengakses
        array menggunakan counter yang kita buat
        * Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array
        secara otomatis
         */

        /*
        Ada loop "for-each", yang digunakan secara eksklusif untuk melakukan loop melalui elemen-elemen dalam array
        (atau set data lainnya)
        Syntax
        for (type variableName : arrayName){
        // code block to be executed
        }
         */
        String [] names = {
                "Rival","Alvian", "Melfandy",
                "Cristiano Ronaldo", "Lionel Messi", "Mesut Ozil"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
            
        }
        System.out.println("\nFor Each");
        for (var name : names) {
            System.out.println(name);
        }




    }
}
