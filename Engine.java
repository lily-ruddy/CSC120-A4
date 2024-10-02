public class Engine {

    // Attributes:
    private double currentFuel; // current fuel level
    private double maxFuel; // max fuel level
    FuelType f = FuelType.ELECTRIC; // fuel type 
    

    /**
     * Constructor
     * @param FuelType; The fuel type
     * @param currentFuel; Current fuel level
     * @param maxFuel; Max fuel level
     */
    public Engine(FuelType FeulType, double currentFuel, double maxFuel){
        this.f = FeulType; 
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    // Getters:
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
     * Resets the engine's current fuel to the maximum level.
     */
    private void refuel(){
        this.currentFuel = this.maxFuel; // sets the current fuel to the maximum fuel level
    }

    /**
     * Runs the engine where it depletes the fuel.
     * @return true or fase; booleon that 
     */
    private boolean go(){
        if(this.currentFuel > 0){
            //wait(15000); // waits 15 seconds
            this.currentFuel = this.currentFuel - 5; // losing 10 fuel per second
            System.out.println("The fuel level is now at " + this.currentFuel);
            return true;
    
        } else{
            return false;

        }
    }

    
    //Main:
    public static void main(String[] args) {

        /* Creates engine */
        Engine myEngine = new Engine(FuelType.STEAM, 50.0, 100.0);
        System.out.println("My fuel type is " + myEngine.f); 
        
        /* Refuels engine */
        System.out.println("My engine has fuel level of " + myEngine.currentFuel);
        myEngine.refuel(); // refuels the engine
        System.out.println("My engine has fuel level of " + myEngine.currentFuel);
        
        /* Runs engine */
        while (myEngine.go()) { // runs the engine
                    System.out.println("Choo choo!");
                }
                System.out.println("Out of fuel.");
    }
    


}