package main.java.com.core.accessModifiers.package1.accessPrivate;

public class PrivateVariableMethodConstructor {
    private int x = 10;
    private String name = "Remmy";

    public PrivateVariableMethodConstructor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

   void sqr(int t){
        System.out.println(t*t);
    }
}
