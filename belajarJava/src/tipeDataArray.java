public class tipeDataArray {
    public static void main(String[] args) {

   /*
   Tipe Data Array
 * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
 * Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
    */

        String[] stringArray ;
        stringArray = new String[10];
        stringArray[0] = "Rival";
        stringArray[1] = "Alvian";
        stringArray[2] = "Melfandy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);


        String[] stringArray2 = new String[10];

        String [] namaNama = {
                "Xavi Hernandes", "Andres Iniesta", "Andrea Pirlo"
        };

        namaNama[0] = null;

        int[] arrayInt = {
                7,10
        };
        arrayInt[0] = 11;

        System.out.print(arrayInt[0] + "\s");
        System.out.print(arrayInt[1]);

        /*
        Operasi Array           / Keterangan
        array [index]           Mengambil data di array
        array [index] = value   Mengubah data di array
        array.length            Mengambil panjang array
         */

        System.out.println("\n" + arrayInt.length);

        String [] [] members = {
                {"Dias", "Dimas", "Dalang", "Badrol"}, //rumusnya kotak pertama -1 dan laci ke berapa -1
                {"Ipin", "Satria", "Messi", "Ronaldo"}, //rumusnya kotak kedua - 1dan laci ke berapa -1
                {"Reyfansyah", "Neymar", "Kaka", "Ronaldinho", "Zidane"}      //rumusnya kotak ketiga - 1dan laci ke berapa -1
        };
        System.out.println(members [1] [3]);
        System.out.println(members [0] [1]);
        System.out.println(members [2] [0]);





    }
}
