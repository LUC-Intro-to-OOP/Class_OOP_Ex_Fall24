abstract class Car {
    
    protected String Make;
    public String Model;
    protected double currentMileage;
    protected double remainingWarrantyMileage;
    protected static final int WARRANTY = 60_000;
  

    //general methods
    abstract protected void drive();
   
    //ToString method
    @Override  //Annotation
    public String toString(){
        return String.format("Make: " + Make +  " Model: " + Model + " Current Mileage: " + currentMileage + " Mileage to Warranty Expire: " + remainingWarrantyMileage);
    }

}
