import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class L12E4 {
    public static ArrayList<car> loadFile(String filename) {
        List<String> carDetails;
        ArrayList<car> thisCar = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename)); //file needs to be said where it is (eg. in src/lesson12/file.txt
            String line = in.readLine();
            while (line != null) {
                carDetails = Arrays.asList(line.split(",")); //how to split a line at the comma
                car newCar = new car();
                newCar.make = carDetails.get(0);
                newCar.model = carDetails.get(1);
                newCar.year = Integer.parseInt(carDetails.get(2));
                newCar.vin = carDetails.get(3);
                newCar.price = Double.parseDouble(carDetails.get(4));
                newCar.color = carDetails.get(5);
                newCar.mileage = Integer.parseInt(carDetails.get(6));
                newCar.condition = carDetails.get(7);
                thisCar.add(newCar);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e.toString());
        }
        return thisCar;
    }

    public static void showCar(car thisCar){
        System.out.println("");
        System.out.println(thisCar.make + " " + thisCar.model + " (" + thisCar.year + ")");
        System.out.println("VIN: " + thisCar.vin);
        System.out.println("MILEAGE: " + thisCar.mileage);
        System.out.println("CONDITION: " + thisCar.condition);
        System.out.println("£" + thisCar.price);
        System.out.println("");
        System.out.println("-------------");
    }
    public static void main (String[]args){
        ArrayList<car> thisCar = loadFile("carSales.txt");

        for(int i=0;i<thisCar.size();i++){
            car thiscar = thisCar.get(i);
            showCar(thiscar);
        }
    }
}
