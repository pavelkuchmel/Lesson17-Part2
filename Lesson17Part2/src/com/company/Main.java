package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine("BMW", 150);
        Engine e2 = new Engine("ЯМЗ", 80);
        Engine e3 = new Engine("LandRover", 550);
        Driver d1 = new Driver("Pavel", 30, 5);
        Car c1 = new Car("SuperWagon", "BMW", e1, d1);
        Car c2 = new Lorry("Pickup", "UAZ", e2, d1, 1500);
        Car c3 = new SportCar("Coupe", "Jaguar", e3, d1, 320);
        Car[] array = {c1, c2, c3};
        for(Car car : array){
            System.out.println(car);
            car.start();
            car.turnLeft();
            car.turnRight();
            car.stop();
        }
    }
}
