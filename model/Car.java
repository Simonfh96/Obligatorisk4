/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Simon
 */
public class Car extends Vehicle {

    public Car(int vehicleWeight) {
        super(vehicleWeight);
    }

    public int getSpace() {
        return 1;
    }

    public int getLoad() {
        return super.getLoad();
    }

    public String toString() {
        String carsize = "Car: size = 1, weight =";

        return carsize + getLoad();
    }
}
