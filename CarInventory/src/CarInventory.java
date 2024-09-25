import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
public class CarInventory {
    public static void main(String[] args) throws Exception {
        
        //Create an instance of the Scanner Class
        Scanner input = new Scanner(System.in);

        //Array that holds 2 Car Objects
        Car [] cars = new Car[2];


        //Looping Structure to populate each object instance defined in cars array
        for(var i = 0; i < cars.length; i++){
            //create object instance
            cars[i] = new Car();
            cars[i].setMake("Lotus");  //setting the value for make property
            cars[i].setModel("Eclipse");
            cars[i].setCurrentMileage(2300);

        }

        //Looping Structure to output each object 
        for(var x = 0; x < cars.length; x++){
            System.out.println(cars[x].getMake() + " " + cars[x].getModel() + " " + cars[x].getMileage() + " " + cars[x].outputRemainingWarrantyMileage());
        }
  

        /*carOne.setMake("Lotus");  //setting the value for make property
        carOne.setModel("Eclipse");
        carOne.setCurrentMileage(2300);


        System.out.println(carOne.getMake() + " " + carOne.getModel() + " " + carOne.getMileage() + " " + carOne.outputRemainingWarrantyMileage());

        System.out.println(carTwo.getMake() + " " + carTwo.getModel() + " " + carTwo.getMileage() + " " + carTwo.outputRemainingWarrantyMileage());*/



    

    }
}
