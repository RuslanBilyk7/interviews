package main.java.com.core.accessModifiers.package1.accessDefault;

public class DefaultMethod {
    // Если в package1  метод  int sum(int a, int b) указан по умолчанию (то есть дефолт или package private), то доступ из другого пакета невозможен !!!
    // Error:(9, 32) java: sum(int,int) is not public in main.java.com.core.accessModifiers.package1.accessDefault.DefaultMethod; cannot be accessed from outside package
    //Если же в package1  метод  int sum(int a, int b) указан как public, то допускается доступ из другого пакета
    public int sum(int a, int b){
        return a+b;
    }
}
