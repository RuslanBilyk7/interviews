package main.java.com.core.methodsOfObject.clone.example2.deepCopy;

/*для объекта-копии здесь назначен новый объект класса Test, который будет возвращен в методе clone. Благодаря этому t3 получит глубокую копию объекта t1. Таким образом, любые изменения, сделанные в полях объекта 'c' в t3, не будут отражены в t1.*/
public class MainCloneDeep {
    public static void main(String[] args) throws CloneNotSupportedException{
        Test2 t1 = new Test2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        Test2 t3 = (Test2)t1.clone();
        //Изменение примитивного типа t2 не будет отражено в поле t1
        t3.a = 100;

        //Изменения в поле типа объекта t2 не будет отражаться в t1 (глубокая копия)
        t3.c.x = 300;

        System.out.println("t1.a=" + t1.a + " t1.b=" + t1.b + " t1.c.x=" + t1.c.x + " t1.c.y=" + t1.c.y);
        System.out.println("t3.a=" + t3.a + " t3.b=" + t3.b + " t3.c.x=" + t3.c.x + " t3.c.y=" + t3.c.y);
    }
}



