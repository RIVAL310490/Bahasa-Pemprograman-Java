 class Person {
    // ini yang namanya class (lanjutan dari classPerson)
     /*
    Field
    * Fields/ Properties/ Attributes adalah data yang bisa kita sisipkan di dalam Object
    * Namun sebelum kita bisa memasukkan data di fields, kita harus mendeklarasikan data apa aja yang dimiliki object tersebut
    di dalam deklarasi class-nya
    * Membuat field sama seperti membuat variable, namun ditempatkan di block class
    */
    /*
     Manipulasi Field
     * Fields yang ada di object, bisa kita manipulasi. Tergantung  final atau bukan
     * Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya
     * Untuk manipulasi data field, sama seperti cara pada variable
     * Untuk mengakses field, kita butuh kata kunci. (titik) setelah nama object dan diikuti nama fieldsnya
      */
     String name; //field
     String address; //field
     final String country = "Indonesia";//field
     String numberPhone;
    /*
     Constructor
     * Saat kita membuat object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung ()
     * Di dalam class Java, kita bisa membuat constructor, constructor adalah method yang akan dipanggil saat pertama kali
     Object dibuat
     * Mirip seperti di method, kita bisa memberi parameter pada constructor
     * Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value
      */

     Person(String name, String address) { // ini constructor
         this.name = name; // nama constructor harus sama dengan nama class
         this.address = address;
     }
     /*
     Constructor Overloading
     * Sama seperti di method, di constructor pun kita bisa melakukan overloading
     * Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter
     harus berbeda
     * Dengan constructor overloading pengisian data menjadi lebih fleksibel
      */
     /*
     Memanggil Constructor Lain
     * Seperti method constructor juga bisa memanggil constructor lain
     * Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
     * Cara untuk memanggil constructor lain, kita hanya perlu memanggilnya seperti memanggil method, namun dengan kata
       kunci this
       */
     /*
     Kode: Memanggil constructor lain
     Person (String paraName, String paramAddress){
     name = paramName;
     address = paramAddress;
     }
     Person (String paramName){
        this (paramName, null);
     }
     Person(){
     this(null);
     }
      */
     Person(String name ) { //constructor
         this.name = name;
     }
     Person(){ // constructor

     }

     /*
     Method
     * Selain menambahkan field, kita juga bisa menambahkan method ke object
     * Cara dengan mendeklarasikan method tersebut didalam block class
     * Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di
       method yang ada di dalam block class
     * Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya.
       Sama seperti mengakses field
               */
     void sayHello(String paramName) { //ini method
         System.out.println("Hello" + paramName + ", My name is "+ this.name);

     }
}

