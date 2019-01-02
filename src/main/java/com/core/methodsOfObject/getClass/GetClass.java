package main.java.com.core.methodsOfObject.getClass;

public class GetClass {
    public static void main(String[] args) {
        One ob = new One();
        System.out.println(ob.getClass());// данный метод получает класс объекта :
                                         //class main.java.com.core.methodsOfObject.getClass.One
    }
}

class One {
    int x = 10;
    void sum() {
    }
}
