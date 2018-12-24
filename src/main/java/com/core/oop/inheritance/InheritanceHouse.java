package main.java.com.core.oop.inheritance;

public class InheritanceHouse {
    int square;
    String nameOwner;

    InheritanceHouse(int square, String nameOwner) {
        this.square = square;
        this.nameOwner = nameOwner;
    }

    public void show() {
        System.out.println(square + " " + nameOwner);
    }
}

class HouseFirst extends InheritanceHouse {
    String colourHouse;

    HouseFirst(int square, String nameOwner, String colourHouse) {
        super(square, nameOwner);
        this.colourHouse = colourHouse;
    }

    @Override
    public void show() {
        System.out.println(square + " " + nameOwner + " " + colourHouse);
    }

}

class HouseSecond extends HouseFirst {
    boolean hasGarage;

    HouseSecond(int square, String nameOwner, String colourHouse, boolean hasGarage) {
        super(square, nameOwner, colourHouse);
        this.hasGarage = hasGarage;
    }

    @Override
    public void show() {
        System.out.println(square + " " + nameOwner + " " + colourHouse + " " + hasGarage);
    }
}

class InheritanceHouseTest {
    public static void main(String[] args) {
        InheritanceHouse house = new InheritanceHouse(50, "Nilson");
        InheritanceHouse house1 = new HouseFirst(80, "Conon", "white");
        InheritanceHouse house2 = new HouseSecond(150, "Merry", "black", true);

        house.show();
        house1.show();
        house2.show();
    }
}


