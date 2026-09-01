class A {
    int a,b,c;
    A(){
        System.out.println("Default");
    }

    A(int a){
        this.a = a;
    }
    A(int a,int b){
        this.a=a;
        this.b=b;
    }
    A(int a,int b ,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

public class Main {
    public static void main(String[] args){
        A obj2 = new A(10);
        A obj3 = new A(10,20);
        System.out.println("Object 2 element is "+obj2.a);
        System.out.println("Sum of obj3 element is "+obj3.a+obj3.b);
    }
}
