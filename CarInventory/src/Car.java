public class Car {
    

    private String Make;
    public String Model;
    private static final int WARRANTY = 60_000;
    private double currentMileage;

    private double remainingWarrantyMileage;
  

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
    @Override
    public String toString(){
        return String.format("Make: " + Make +  " Model: " + Model + " Current Mileage: " + currentMileage + " Mileage to Warranty Expire: " + remainingWarrantyMileage);
    }


}
