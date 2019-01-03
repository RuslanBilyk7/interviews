package main.java.com.core.enums.enumApples;

public enum EnumApple {
    Jonathan(10),
    GoldenDel(9),
    RedDel(12),
    Winesap(15),
    Cortland(8);

    private int price; // price of each apple

    // Constructor
    EnumApple(int p) {
        price = p;
    }

    //Method
    int getPrice() {
        return price;
    }
}
