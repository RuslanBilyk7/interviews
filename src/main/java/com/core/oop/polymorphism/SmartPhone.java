package main.java.com.core.oop.polymorphism;

public class SmartPhone  extends AbstractPhone{
    public SmartPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю по Скайпу "+ outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Принимаю вызов по Скайпу " +inputNumber);
    }
}
