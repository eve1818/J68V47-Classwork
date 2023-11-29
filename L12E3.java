public class L12E3 {

    public static void displaycar(car car1){
        System.out.println(car1.make + " " + car1.model + " (" + car1.year + ")");
        System.out.println("VIN: " + car1.vin);
        System.out.println("MILEAGE: " + car1.mileage);
        System.out.println("CONDITION: " + car1.condition);
        System.out.println("£" + car1.price);
        System.out.println("");
        System.out.println("-------------");
    }
    public static void main(String[] args) {
        car car1 = new car();
        displaycar(car1);
        car1.make = "Feraria";
        car1.model = "F430";
        car1.year = 2009;
        car1.vin = "3GYVKNEFXAG625569";
        car1.price = 55125;
        car1.color = "white";
        car1.mileage = 45336;
        car1.condition = "good";

        displaycar(car1);
    }
}
