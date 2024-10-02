public class HybridCar extends Car {
    
    
    public HybridCar(){
        this.Make = "N/A";
        this.Model = "N/A";
        this.currentMileage = 0.0;
    }
    //Overloaded Constructor
    public HybridCar(String make, String model, double mileage){
        Make = make;
        Model = model;
        currentMileage = mileage;
        determineWarrantyMileageExpiration();

    }

    public void drive(){
        System.out.println("Electric");
    }

    //Setter and Getter
    public void setMake(String make){
        Make = make;
    }

    public void setModel (String Model){
        this.Model = Model;
    }

    public void setCurrentMileage(double cMileage){
        currentMileage = cMileage;
        determineWarrantyMileageExpiration();
    }

    //Getter Methods
    public String getMake(){
        return Make;
    }

    public String getModel(){
        return Model;

    }

    public double getMileage(){
        return currentMileage;
    }
    //Working Method that performs Calculation
    private void determineWarrantyMileageExpiration(){
        remainingWarrantyMileage = WARRANTY - currentMileage;
        //outputRemainingWarrantyMileage();
    }

    //Output remaining warranty mileage
    public String outputRemainingWarrantyMileage(){
        return String.format("You have " + remainingWarrantyMileage + " miles remaining until your waranty expires");
    }


}
