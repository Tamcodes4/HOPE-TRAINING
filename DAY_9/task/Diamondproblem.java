package DAY_9.task;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class D implements B, C {
    public void show() {
        System.out.println("D solves");
    }
}

public class Diamondproblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}