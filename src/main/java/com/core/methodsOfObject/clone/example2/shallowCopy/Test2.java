package main.java.com.core.methodsOfObject.clone.example2.shallowCopy;


//Содержит ссылку Test и реализует клон с поверхностной копией
public class Test2 implements Cloneable {
    int a, b;
    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
