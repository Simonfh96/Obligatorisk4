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
public class Ferry {

    ArrayList<Vehicle> left = new ArrayList<>();
    ArrayList<Vehicle> right = new ArrayList<>();
    private int spaces;

    public Ferry(int spaces) {
        this.spaces = spaces;
    }

    public void addVehicleLeft(Vehicle vehicle) {
        left.add(vehicle);
    }

    public void addVehicleRight(Vehicle vehicle) {
        right.add(vehicle);
    }

    public int getSpacesLeft() {
        int spaceLeft = 0;
        for (int i = 0; i < left.size(); i++) {
            spaceLeft = spaceLeft + left.get(i).getSpace();
        }
        spaceLeft = spaces - spaceLeft;
        return spaceLeft;
    }

    public int getSpacesRight() {
        int spaceRight = 0;
        for (int i = 0; i < right.size(); i++) {
            spaceRight = spaceRight + left.get(i).getSpace();
        }
        spaceRight = spaces - spaceRight;
        return spaceRight;
    }

    public int getLoadLeft() {
        int loadLeft = 0;
        for (int i = 0; i < left.size(); i++) {
            loadLeft = loadLeft + left.get(i).getLoad();
        }
        return loadLeft;
    }

    public int getLoadRight() {
        int loadRight = 0;
        for (int i = 0; i < right.size(); i++) {
            loadRight = loadRight + right.get(i).getLoad();
        }
        return loadRight;
    }

    public int getBalance() {
        int result = 0; 
        
        int balance;
        if (getLoadLeft() < getLoadRight()) {
            balance = getLoadLeft() - getLoadRight();
            result = balance;
        } else {
            balance = getLoadRight() - getLoadLeft();
            result = balance;
        }
        return result;

    }

    public String toString() {
        String ferry = new String();
        int allVehicles = left.size() + right.size();
        int emptySpaces = getSpacesLeft() + getSpacesRight();

        ferry = " Number of vehicles on the ferry: " + allVehicles + "\n Number of empty spaces: " + emptySpaces + "\n Total weight of all vehicles: " + (getLoadLeft()+getLoadRight()) + "\n Balance: " + getBalance();
        return ferry;
    }

    public String showLeft() {
        String showLeftStr = new String();
        String leftWeight = new String();
        String leftSpace = new String();
        for (int i = 0; i < left.size(); i++) {
            showLeftStr = showLeftStr + left.get(i).toString() + "\n";
        }
        for (int i = 0; i < left.size(); i++) {
            leftWeight = "total weight in left side: "+left.get(i).getLoad();
        }
        for (int i = 0; i < left.size(); i++) {
            leftSpace = "spaces used in left side: "+left.get(i).getSpace();
        }

        showLeftStr = showLeftStr + leftWeight + leftSpace;

        return showLeftStr;
    }

    public String showRight() {
        String showRightStr = new String();
        String rightWeight = new String();
        String rightSpace = new String();
        for (int i = 0; i < right.size(); i++) {
            showRightStr = showRightStr + right.get(i).toString() + "\n";
        }
        for (int i = 0; i < right.size(); i++) {
            rightWeight = right.get(i).getLoad() + "";
        }
        for (int i = 0; i < right.size(); i++) {
            rightSpace = right.get(i).getSpace() + "";
        }
        showRightStr = showRightStr + rightWeight + rightSpace;
        return showRightStr;

    }

    public void clear() {
        left.clear();
        right.clear();
    }

}
