package main.java.com.core.methodsOfObject.clone.example1;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clone a = new Clone();
        a.t = 11;
        Clone b = a.clone();
        Clone c = a;
        System.out.println("a=" + a + " b=" + b + " c=" + c);

        a.t=12;
        System.out.println("a=" + a + " b=" + b + " c=" + c);
    }
}
