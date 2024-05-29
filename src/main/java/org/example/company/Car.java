package org.example.company;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car( int cylinders, String name) {
        //default degerler
        this.engine=true;
        this.wheels=4;
        this.cylinders = cylinders;
        this.name = name;

    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cylinders=" + cylinders +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object car){
        return ((Car) car).name == this.name || ((Car) car).cylinders == this.cylinders;
    }
    public String startEngine() { // Motor çalıştı
       return getClass().getSimpleName() + " the car's engine is starting";
    }

    public String accelerate() { // Araç hızlanıyor
       return getClass().getSimpleName() + " the car is accelerating";
    }

    public String brake() { // Araç fren yapıyor
       return getClass().getSimpleName() + " the car is braking";
    }



}
