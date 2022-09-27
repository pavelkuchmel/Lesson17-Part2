package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int weight;

    public Lorry(){}

    public Lorry(String carClass, String brand, Engine engine, Driver driver, int carrying) {
        super(carClass, brand, engine, driver);
        this.weight = carrying;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", carrying=" + weight +
                '}';
    }
}
