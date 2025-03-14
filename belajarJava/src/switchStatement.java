public class switchStatement {
    public static void main(String[] args) {

     /*
     Switch Statement
     * Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
     * Switch adalah statement percabangan yang sama dengan if, namun lebih sederhana cara pembuatannya
     * Kondisi di switch statement hanya untuk perbandingan ==
      */

        /*
        Switch Lambda
        * Di Java versi 14, diperkenalkan switch expression dengan lambda
        * Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break
         */

        /*
        Kata Kunci yield
        * Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada
        switch statement
        * Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement
         */

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");

        }
        //Switch lambda
        switch (nilai) {
            case "A" -> System.out.println("Wow, anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }

        



    }
}
