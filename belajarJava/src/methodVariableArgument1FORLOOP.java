public class methodVariableArgument1FORLOOP {
    public static void main(String[] args) {

        /*
        Method Variable Argument
        * Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
        * Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
        * Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa
        nol atau lebih
        * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
         */
    int [] values = {80, 80, 80, 80, 80};
    sayCongrats("Eko",values);


    }
    static void sayCongrats(String name, int [] values){
       var total = 0;
       for (int i = 0; i < values.length; i++) {
           total += values[i];//total = total + values [i]
           System.out.println(" Total nilai" + total + "\n");
       }
       var finalValue = total / values.length;
       System.out.println("Rata-rata nilai: " + finalValue); //rata-rata
       if (finalValue >= 75) {
           System.out.println("Selamat " + name + " anda lulus");
       } else {
           System.out.println("Maaf anda " + name + " tidak lulus");
       }
    }
}
