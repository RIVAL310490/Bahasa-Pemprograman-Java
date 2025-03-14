public class breakDanContinu {
    public static void main(String[] args) {

    /*
    Break & Continue
    * Pada switch statement, kita sudah mengenal kata kunci break, yaitu untuk menghentikan case dalam switch
    * Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan
    * Namun berbeda dengan continu, continue digunakan untuk menghentikan perulangan saat ini, lalu melanjutkan ke
    perulangan selanjutnya
     */

       var counter = 1;

       while (true) {
           System.out.println("Aku sukses- " + counter);
           counter++;

           if (counter > 10) {
               break;
           }
       }
        System.out.println("Perulangan berhenti");

       for (var counter2 = 1; counter2 <= 100; counter2++) {
           if (counter2 % 2 == 0 ) { //angka di counter2 % 2 == 0 itu akan menghentikan perulangan bilangan genap dan hanya akan meneruskan bilangan ganjil jika ingin mencetak bilangan genap tinggal counter2 % 2 == 1
               continue;
           }
           System.out.println("Perulangan ganjil " + counter2);
       }

    }
}
