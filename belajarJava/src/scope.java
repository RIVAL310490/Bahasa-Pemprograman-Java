public class scope {
    public static void main(String[] args) {

        /*
        Scope
        * Di Java, variable hanya bisa diakses di dalam area dimana mereka dibuat
        * Hal ini disebut scope
        * Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau jika dibuat
        didalam block, maka hanya bisa diakses didalam block tersebut
         */
        sayHello("Rival");

    }
    static void sayHello (String name) {
       String hello = "Hello " + name;
        if (!name.isEmpty()) {
            String hi = "Hi " + name;
            System.out.println(hi);

        }
        System.out.println(hello);

    }
}
