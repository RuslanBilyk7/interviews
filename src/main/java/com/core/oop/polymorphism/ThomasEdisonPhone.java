package main.java.com.core.oop.polymorphism;

public class ThomasEdisonPhone extends AbstractPhone{
    public ThomasEdisonPhone(int year) {
        super(year);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вращайте трубку и затем сообщите номер абонента "+outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Телефон звонит " +inputNumber);
    }
}
