package org.example.arge;

public class CarSkeleton {

    private String name,description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Public metot startEngine
    public void startEngine() {
        System.out.println("Engine started.");
    }

    // Public metot drive
    public void drive() {
        runEngine();
        System.out.println("Car is driving.");
    }

    // Protected metot runEngine
    protected void runEngine() {
        System.out.println("Engine is running.");
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
