public class Car {
    
    private String Make;
    public String Model;
    private double currentMileage;
    private double remainingWarrantyMileage;
    private static final int WARRANTY = 60_000;
  

    //Default Constructor
    public Car(){
        this.Make = "N/A";
        this.Model = "N/A";
        this.currentMileage = 0.0;
    }
    //Overloaded Constructor
    public Car(String make, String model, double mileage){
        Make = make;
        Model = model;
        currentMileage = mileage;
        determineWarrantyMileageExpiration();

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

    //ToString method
    @Override  //Annotation
    public String toString(){
        return String.format("Make: " + Make +  " Model: " + Model + " Current Mileage: " + currentMileage + " Mileage to Warranty Expire: " + remainingWarrantyMileage);
    }


}
