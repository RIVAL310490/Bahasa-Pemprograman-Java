class inheritanceManager {
    String name;
    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is " + this.name);
    }
}

class vicePresident extends inheritanceManager { // kata kunci inheritance adalah extends
    // apa yang dimiliki Manager juga dimiliki vicePresident itulah inheritance
    void sayHello(String name) { // method overriding
        System.out.println("Hai " + name + " my name " + this.name);
        /*
        Method Overriding
        * Method overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
        * Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child,
        method yang di class parent tidak bisa diakses lagi
         */
    }
}

/*
Inheritance
* Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
* Dalam artian, kita bisa membuat class Parent atau class Child
* Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child.
* Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki oleh
class Child
* Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class
parentnya
 */
