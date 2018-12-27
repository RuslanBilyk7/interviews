package main.java.com.core.accessModifiers.package1.accessPublic;
// для получения доступа из другого пакет класс нужно импортировать
public class Public {
    public int x = 1;

    public Public() {
    }

    public Public(int x) {
        this.x = x;
    }

    public void sum(int t) {
        System.out.println(t + t);
        System.out.println(x*x);
    }

}
