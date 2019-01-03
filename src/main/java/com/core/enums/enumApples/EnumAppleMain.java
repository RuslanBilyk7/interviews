package main.java.com.core.enums.enumApples;

public class EnumAppleMain {
    public static void main(String args[])
    {
        EnumApple ap;

        // Display price of Winesap.
        System.out.println("Winesap costs " +
                EnumApple.Winesap.getPrice() +
                " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(EnumApple a : EnumApple.values())
            System.out.println(a + " costs " + a.getPrice() +
                    " cents.");
    }
}
