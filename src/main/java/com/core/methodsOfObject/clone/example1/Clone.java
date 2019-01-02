package main.java.com.core.methodsOfObject.clone.example1;

public class Clone implements  Cloneable{
    public Integer t=10;
    public Clone clone() throws CloneNotSupportedException{
        Clone obj=(Clone)super.clone();
        obj.t=t;
        return obj;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
