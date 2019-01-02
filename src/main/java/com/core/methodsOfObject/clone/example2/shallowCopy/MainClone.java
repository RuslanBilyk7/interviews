package main.java.com.core.methodsOfObject.clone.example2.shallowCopy;

public class MainClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;
      //Создание копии объекта t1 и передача ее в t2
        Test2 t2 = (Test2) t1.clone();
        //Изменение примитивного типа t2 не будет отражено в поле t1
        t2.a = 100;
        //Изменение в поле типа объекта будет отражено как в t2, так и в t1 (поверхностная копия)
        t2.c.x = 300;

        System.out.println("t1.a=" + t1.a + " t1.b=" + t1.b + " t1.c.x=" + t1.c.x + " t1.c.y=" + t1.c.y);
        System.out.println("t2.a=" + t2.a + " t1.b=" + t2.b + " t2.c.x=" + t2.c.x + " t1.c.y=" + t2.c.y);

    }
}
