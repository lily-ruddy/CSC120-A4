public class Engine {

    // Attributes:
    String FeulType; // indicates which fuel it uses 
    private double currentFuel; // current fuel level
    private double maxFuel; // max fuel level

    /**
     * Constructor
     * @param FuelType; The fuel type
     * @param currentFuel; Current fuel level
     * @param maxFuel; Max fuel level
     */
    public Engine(String FeulType, double currentFuel, double maxFuel){
        this.FeulType = FeulType;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    // Getters:

    /* Fuel type getter */
    public String getFuelType(){
        return this.FeulType;
    }
    /* Current fuel getter */
    public double getcurrentFuel(){
        return this.currentFuel;
    }
    /* Max fuel getter */
    public double getmaxFuel(){
        return  this.maxFuel;
    }

    // Methods:
    /**
     * Resets the engine's current fuel to the maximum level
     * @param currentFuel; Current fuel level
     * @param maxFuel; Max fuel level
     */
    private void refuel(){
        this.currentFuel = this.maxFuel; // sets the current fuel to the maximum fuel level
    }









    // Main:
    public static void main(String[] args) {
        Engine myEngine = new Engine("coal", 2, 10);
        System.out.println("My engine has fuel level of " + myEngine.currentFuel);
        myEngine.refuel();
        System.out.println("My engine has fuel level of " + myEngine.currentFuel);
    }


}