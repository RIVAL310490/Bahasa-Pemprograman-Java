public class aksesInheritance {
    public static void main(String[] args) {

        var obj = new inheritanceManager();
        obj.name = "Lala";
        obj.sayHello("Alvian");

        var obj2 = new vicePresident();
        obj2.name = "amelia";
        obj2.sayHello("Alvian");
    }
}
