package main.java.com.core.oop.encapsulation;

class Car {
    public Car(int yearOfProduct, String nameOfModel) {
        this.yearOfProduct = yearOfProduct;
        this.nameOfModel = nameOfModel;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    private int yearOfProduct;

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    private String nameOfModel;

    private void drive() {
        System.out.println("i am driving");
    }
}

public class EncapsulationCar {
    public static void main(String[] args) {
        Car car = new Car(2015, "Suzuki");

        System.out.println("Model- " + car.getNameOfModel());
        System.out.println("Year of product- " + car.getYearOfProduct());
//        car.drive(); no access!!!
    }
}

