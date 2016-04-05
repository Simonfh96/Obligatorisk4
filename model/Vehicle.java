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
public abstract class Vehicle implements Comparable {

    private int vehicleWeight;
  

    public Vehicle(int vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
    }

    public int getLoad(){
       return vehicleWeight;
    }

    public abstract int getSpace();

    public int getLoadPerSpace() {

        return getLoad() / getSpace();
    }

    @Override
    public int compareTo(Object obj) {
        Vehicle v = (Vehicle) obj;

        return v.getLoadPerSpace() - getLoadPerSpace();
    }

    
    

}
