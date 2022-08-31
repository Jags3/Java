package inheritance;

public class Inheritance {
    int salary = 400;

    String eat() {
        System.out.println("eating...");
        return "String";
    }
}

class example extends Inheritance {
    int bonus = 100;

    public static void main(String args[]) {
        example obj = new example();
        System.out.println(obj.salary);
        System.out.println(obj.bonus);
    }
}

