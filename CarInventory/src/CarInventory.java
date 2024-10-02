import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;
public class CarInventory {
    public static void main(String[] args) throws Exception {
        
        //Create an instance of the Scanner Class
        Scanner input = new Scanner(System.in);

        //Array that holds 2 Car Objects
        HybridCar [] cars = new HybridCar[2];


        //Looping Structure to populate each object instance defined in cars array
        for(var i = 0; i < cars.length; i++){
            //create object instance
           
           
            //create object instance
            cars[i] = new HybridCar("Lotus", "Eclipse", 2300.00); //Constructor

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
