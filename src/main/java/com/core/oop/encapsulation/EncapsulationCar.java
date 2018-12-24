package main.java.com.core.oop.encapsulation;

class Car {
    public Car(int yearOfProduct, String nameOfModel) {
        this.yearProduct = yearOfProduct;
        this.nameModel = nameOfModel;
    }

    public int getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(int yearProduct) {
        this.yearProduct = yearProduct;
    }

    private int yearProduct;

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    private String nameModel;

    private void drive() {
        System.out.println("i am driving");
    }
}

public class EncapsulationCar {
    public static void main(String[] args) {
        Car car = new Car(2015, "Suzuki");

        System.out.println("Model- " + car.getNameModel());
        System.out.println("Year of product- " + car.getYearProduct());
//        car.drive(); no access!!!
    }
}

