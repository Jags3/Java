package inheritance;

class A {
    void eat() {
        System.out.println("BREAKFAST");
    }
}

class B extends A {
    void bark() {
        System.out.println("LUNCH");
    }
}
class C extends B {
    void weep() {
        System.out.println("DINNER");
    }

    public static void main(String args[]) {
        C d = new C();
        d.weep();
        d.bark();
        d.eat();
    }
}