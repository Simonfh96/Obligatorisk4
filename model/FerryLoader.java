/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Simon
 */
public class FerryLoader {

    ArrayList<Vehicle> vehicleQueue = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicleQueue.add(vehicle);
    }

    public void clearQueue() {
        vehicleQueue.clear();
    }

    
    public void loadFerry(Ferry ferry){
       Vehicle x;
       Ferry f = new Ferry(100) ;
        for (int i = 0; i < vehicleQueue.size(); i++) {
            vehicleQueue.get(i+2).compareTo(vehicleQueue.get(i).getLoadPerSpace());
            x = vehicleQueue.remove(i);
            f.addVehicleLeft(x);
            
          
            
        }
        }
            
            
    }
    

