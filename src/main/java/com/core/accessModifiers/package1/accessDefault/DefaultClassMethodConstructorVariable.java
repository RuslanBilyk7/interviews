package main.java.com.core.accessModifiers.package1.accessDefault;

//Если class DefaultClassMethodConstructor без public, то доступ из другого пакета к этому классу невозможен
public class DefaultClassMethodConstructorVariable {
     public int x=10;

    //Если конструктор DefaultClassMethodConstructorVariable без public, то доступ из другого пакета к этому классу невозможен
    public DefaultClassMethodConstructorVariable() {
        System.out.println(10);
    }

    // Если в package1  метод  int sum(int a, int b) указан по умолчанию (то есть дефолт или package private), то доступ из другого пакета невозможен !!!
    // Error:(9, 32) java: sum(int,int) is not public in main.java.com.core.accessModifiers.package1.accessDefault.DefaultClassMethodConstructorVariable; cannot be accessed from outside package
    //Если же в package1  метод  int sum(int a, int b) указан как public, то допускается доступ из другого пакета
    public int sum(int a, int b){
        return a+b;
    }
}
