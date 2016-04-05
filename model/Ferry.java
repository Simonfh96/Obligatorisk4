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
            spaceLeft = spaces - spaceLeft;
        }
        return spaceLeft;
    }

    public int getSpacesRight() {
        int spaceRight = 0;
        for (int i = 0; i < right.size(); i++) {
            spaceRight = spaceRight + left.get(i).getSpace();
            spaceRight = spaces - spaceRight;
        }
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

    public String getBalance() {
        String result = new String();
        String balanceStr;
        int balance;
        if (getLoadLeft() < getLoadRight()) {
            balance = getLoadLeft() - getLoadRight();
            balanceStr = "there is: " + balance + "kg in the left side";
            result = balanceStr;
        } else {
            balance = getLoadRight() - getLoadLeft();
            balanceStr = "there is: " + balance + "kg in the right side";
            result = balanceStr;
        }
        return result;

    }

    public String toString() {
        String ferry = new String();
        int allVehicles = left.size() + right.size();
        int emptySpaces = getSpacesLeft() + getSpacesRight();
        int fullWeight = 0;
        int fullWeight1 = 0;
        int fullWeight2 = 0;
        for (int i = 0; i < left.size(); i++) {
            fullWeight1 = fullWeight1 + left.get(i).getLoad();
        }
        for (int i = 0; i < right.size(); i++) {
            fullWeight2 = fullWeight2 + right.get(i).getLoad();
        }
        fullWeight = fullWeight1 + fullWeight2;

        ferry = "number of vehicles on the ferry: " + allVehicles + "\n number of empty spaces: " + emptySpaces + "total weight of all vehicles: " + fullWeight + " balance: " + getBalance();
        return ferry;
    }

    public String showLeft() {
        String showLeftStr = new String();
        String leftWeight = new String();
        String leftSpace = new String();
        for (int i = 0; i < left.size(); i++) {
            showLeftStr = left.get(i).toString() + "\n";
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
            showRightStr = right.get(i).toString() + "\n";
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

    public void clearQueue() {
        left.clear();
        right.clear();
    }

}
