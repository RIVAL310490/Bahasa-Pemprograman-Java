public class forLoop {
    public static void main(String[] args) {

        /*
        For Loop
        * For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        * Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi
         */

        /*
        Syntax Perulangan For
        for(init statement; kondisi; post statement){
        // block perulangan
        }

        * Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        * Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false
        perulangan akan berhenti
        * Post statement akan dieksekusi setiap kali diakhir perulangan
        * Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu
        bernilai true

         */

        //for (;;){
            //System.out.println("Perulangan tanpa henti");
       // }


            // var counter = 1 init statement
            // counter <= 10 Kondisi
            // counter ++ post statement
        for ( var counter = 1 ;counter <=10; counter ++){
            System.out.println("Aku sukses- " + counter);

           //counter atau si post statement kalau mau bertambah 2 counter +=2; atau i +=2;
        }




    }
}
