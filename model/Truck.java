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
public class Truck extends Vehicle {

    private int loadSpace;
    private int loadWeight;

    public Truck(int vehicleWeight, int loadSpace, int loadWeight) {
        super(vehicleWeight);
        this.loadSpace = loadSpace;
        this.loadWeight = loadWeight;

    }

    @Override
    public int getLoad() {
        int truckLoad = getLoad()+ loadSpace;

        return truckLoad;
    }

    @Override
    public int getSpace() {
        return 1 + loadSpace;
    }

    public String toString() {
        String truckSize = "truck: size= " + getSpace();
        String truckWeight = ", weight=" + getLoad();
        return truckSize + truckWeight;
    }

}
