package main.java.com.core.methodsOfObject.clone.example2.deepCopy;


//Содержит ссылку Test и реализует клон с глубокой копией.
public class Test2 implements Cloneable {
    int a, b;
    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        //Присвойте поверхностную копию новой переменной ссылки t
        Test2 t = (Test2) super.clone();
        t.c = (Test) c.clone();
        return t;

    }
}
