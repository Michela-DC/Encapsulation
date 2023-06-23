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
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        House newHouse = new House();

        System.out.println("Please insert the house address: ");
        Scanner userInputAddress = new Scanner(System.in);
        String address = userInputAddress.nextLine();
        newHouse.setAddress(address);

        System.out.println("Please insert the number of floors: ");
        Scanner userInputFloorsNumber = new Scanner(System.in);
        int floorsNumber = Integer.parseInt(userInputFloorsNumber.nextLine());
        newHouse.setNumberOfFloors(floorsNumber);

        int residentsNumber = 4;
        List<String> allResidentsNames = new ArrayList<>();

        for(int i = 1; i <= residentsNumber; i++) {
            System.out.println(String.format("Please enter the name of resident n.%d: ", i));
            Scanner userInputResidentsNames = new Scanner(System.in);
            String singleResidentName = userInputResidentsNames.nextLine();

            allResidentsNames.add(singleResidentName);
        }

        newHouse.setResidentsNames(allResidentsNames);

        // Print newHouse info -----
        String stringAddressToPrint = String.format("The new house address is: %s", newHouse.getAddress());
        String stringFloorsNumberToPrint = String.format("The number of floors is: %d", newHouse.getNumberOfFloors());

        System.out.println(" ");
        System.out.println(stringAddressToPrint); //Si può anche fare con:System.out.printf("The new house address is: %s", newHouse.getAddress());
        System.out.println(stringFloorsNumberToPrint);

        int count = 0;

        for(String residentName : newHouse.getResidentsNames()){
            count++;
            String stringResidentNameToPrint = String.format("Resident n.%d name: %s", count, residentName);
            System.out.println(stringResidentNameToPrint);
        }
    }
}