public class operasiBoolean {
    public static void main(String[] args) {

     /*
     Operasi Boolean
     Operator
     && // Dan
     || // Atau
     ! // Kebalikan
      */

        var absen = 70;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);




    }
}
