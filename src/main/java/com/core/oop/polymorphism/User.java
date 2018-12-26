package main.java.com.core.oop.polymorphism;

public class User {
    private String name;

    User(String name){
        this.name=name;
    }

    public void callAnotherUser(int number, AbstractPhone phone){
        // вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!// вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!
        phone.call(number);
        phone.ring(number);
        System.out.println();
    }
}
