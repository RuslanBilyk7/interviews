package main.java.com.core.oop.encapsulation;

class Car {
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
}

public class EncapsulationCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setNameOfModel("Suzuki");
        car.setYearOfProduct(2015);

        System.out.println("Model- "+ car.getNameOfModel());
        System.out.println("Year of product- " +car.getYearOfProduct());

    }
}

