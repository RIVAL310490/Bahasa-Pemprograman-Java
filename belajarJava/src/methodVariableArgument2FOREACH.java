public class methodVariableArgument2FOREACH {
    public static void main(String[] args) {

    int [] values = {80, 80, 60, 60, 80};
        sayData("Henry", values);

        sayData("Mary", 80, 90, 70, 60, 50);

    } // cukup tambahkan tipe data ... (titiknya tiga) manfaatnya bisa langsung mengisi nilai data ke parameter
    static void sayData (String name, int ... values){ //int [] values diubah menjadi variable argument int ... values
        var total = 0; //Variabel kosong
        for (var value : values) { //for each
            total += value; // total = total + value
            System.out.println("total nilai " + total);
        }
        var finalValue = total / values.length;
        System.out.println("Rata-rata nilai: " + finalValue);
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " anda lulus\n");
        } else {
            System.out.println("Maaf " + name + " anda belum lulus\n");
        }
    }
}
