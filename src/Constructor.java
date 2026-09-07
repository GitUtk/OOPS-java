class Parent {
    Parent() {
        System.out.println("Parent default constructor");
    }

    Parent(int x) {
        System.out.println("Parent parameterized constructor: " + x);
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child default constructor");
    }

    Child(int x) {
        super(x);
        System.out.println("Child parameterized constructor: " + x);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Parent obj = new Child(10);
        Child c = new Child();
    }
}