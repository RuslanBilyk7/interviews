package main.java.com.core.oop.polymorphism;

public class PolymorphismTest {
    public static void main(String[] args) {
        AbstractPhone thomasEdisonPhone = new ThomasEdisonPhone(1879);
        AbstractPhone landlinePhone = new LandlinePhone(1984);
        AbstractPhone smartphone = new SmartPhone(2018);

        User user = new User("Tom");
        user.callAnotherUser(252525252, thomasEdisonPhone);
        user.callAnotherUser(303030303, landlinePhone);
        user.callAnotherUser(969696690, smartphone);
    }

}
