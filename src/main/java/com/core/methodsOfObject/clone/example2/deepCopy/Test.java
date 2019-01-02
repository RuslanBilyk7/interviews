package main.java.com.core.methodsOfObject.clone.example2.deepCopy;

// Ссылка на объект этого класса содержится в Test2
class Test implements Cloneable{
    int x, y;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
