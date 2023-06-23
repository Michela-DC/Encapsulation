/*
Achieve encapsulation using getters/setters for a class House that has the following instance variables:
    - an int floorsNumber
    - a string address
    - an array of strings residentsNames
use a tester class to:
    - set the values by asking the user to input them
        > for the residentsNames, the user will have to input a list of names separated by a comma (e.g. John,Lucy,Peter)
prints the house details using the getters and String.format() */

import java.util.ArrayList;
import java.util.List;

public class House {
    private String address;
    private int floorsNumber;

    private List<String> residentsNames = new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return floorsNumber;
    }

    public List<String> getResidentsNames() {
        return residentsNames;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfFloors(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public void setResidentsNames(List<String> residentsNames) {
        this.residentsNames = residentsNames;
    }
}

