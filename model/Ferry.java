/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Simon
 */
public class Ferry {

    ArrayList<Vehicle> left = new ArrayList<>();
    LinkedList<Vehicle> right = new LinkedList<>();
    private int spacesLeft = 100;
    private int spacesRight = 100;

    public Ferry(int spaces) {
    }

    public void addVehicleLeft(Vehicle vehicle) {
        left.add(vehicle);
    }

    public void addVehicleRight(Vehicle vehicle) {
        right.add(vehicle);
    }

    public int getSpacesLeft() {
        {

        }

        return spacesLeft;
    }

    public int getSpacesRight() {
        return spacesRight;

    }

    public void clear() {
        left.clear();
        right.clear();
    }
}
