class managerSuperConstructor {
    String name;

    String company;
    managerSuperConstructor(String name) { // super constructor
        this.name = name;
    }

    managerSuperConstructor(String company, String name) {
        this.company = company;
        this.name = name;
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is " + this.name);
    }
}

class kepalaPresident extends managerSuperConstructor {

    kepalaPresident() {
        super("Dimas", "bla bla");
    }
    void sayHello(String name) { // method overriding
        System.out.println("Hai " + name + " my name " + this.name);

    }
}

/*
Super Constructor
* Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa digunakan untuk
mengakses constructor
* Namun syaratnya untuk mengakses parent class constructor, kita harus mengaksesnya di dalam class child constructor
* Jika sebuah class parent tidak memiliki constructor yang tidak ada parameter-nya (tidak memiliki default constructor),
maka class child wajib mengakses constructor class parent tersebut
 */

