package main.java.com.core.methodsOfObject.hashCode;

import java.util.Objects;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        Simple obj1 = new Simple(100);
        Simple obj2 = new Simple(100);

        System.out.println(obj1.sum(40, 20)+" " +obj1.x);

        System.out.println(obj1.hashCode()); // Без переопределения
        System.out.println(obj2.hashCode()); // Без переопределения

        System.out.println(obj1.equals(obj2));

    }
}

class Simple {
    int x;

    public Simple(int x) {
        this.x = x;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Simple simple = (Simple) o;
        return x == simple.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }
}
