/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author Simon
 */
public class vehicleFactory {

    Random ranProcent = new Random();
    Random propability = new Random();
    Random trucktype = new Random();

    public Vehicle getVehicle() {
        
        Vehicle result = null;

        if (ranProcent.nextInt(10) >= 2) {

            int carWeight = propability.nextInt(1800 - 800) + 801;
            Car car = new Car(carWeight);
            result = car;

        } else {
            int truckWeight = propability.nextInt(3000 - 1500) + 1501;
            int randomNumber = trucktype.nextInt(100)+1;
            if (randomNumber<= 5) {
                int truckLoadSpace = 0;
                int truckLoadWeight = 0;
                Truck truck = new Truck(truckWeight, truckLoadSpace, truckLoadWeight);
                result = truck;
            } else {
                if (randomNumber > 5 && randomNumber <= 75) {
                    int truckLoadSpace = 2;
                    int truckLoadWeight = propability.nextInt(7500 - 1500) + 1501;
                    Truck truck = new Truck(truckWeight, truckLoadSpace, truckLoadWeight);
                    result = truck;
                } else {
                    if (randomNumber > 75 && randomNumber <= 100) {
                        int truckLoadSpace = 4;
                        int truckLoadWeight = propability.nextInt(15000 - 3000) + 3001;
                        Truck truck = new Truck(truckWeight, truckLoadSpace, truckLoadWeight);
                        result = truck;
                    }

                }

            }
        }
        return result;
    }
}
