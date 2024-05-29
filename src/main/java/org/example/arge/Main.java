package org.example.arge;

public class Main {
    public static void main(String[] args) {

        CarSkeleton car1 = new GasPoweredCar("Gas Car", "This car runs on gasoline", 10.5, 4);
        CarSkeleton car2 = new ElectricCar("Electric Car", "This car runs on electricity", 500.0, 100);
        CarSkeleton car3 = new HybridCar("Hybrid Car", "This car runs on both gasoline and electricity", 20.0, 50, 4);

        System.out.println(car1);
        car1.startEngine();

    }
}
