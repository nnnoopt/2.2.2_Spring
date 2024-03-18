package web.models;

public class Car {
    private String modelOfCar;
    private int year;
    private String color;

    public Car() {
    }

    public Car(String modelOfCar, int year, String color) {
        this.modelOfCar = modelOfCar;
        this.year = year;
        this.color = color;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
