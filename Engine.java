//import java.util.Timer;
//import java.util.TimerTask;


public class Engine {

    // Attributes:
    private double currentFuel; // current fuel level
    private double maxFuel; // max fuel level
    

    /**
     * Constructor
     * @param FuelType; The fuel type
     * @param currentFuel; Current fuel level
     * @param maxFuel; Max fuel level
     */
    public Engine(FuelType FeulType, double currentFuel, double maxFuel){
        //this.FeulType = FeulType; // not working right now
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
    }

    // Getters:

    /* Fuel type getter */
    // public String getFuelType(){
    //     return this.FeulType;
    // }
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
     */
    private void refuel(){
        this.currentFuel = this.maxFuel; // sets the current fuel to the maximum fuel level
    }


    // public go(){
    //     wait(3000);

    // }








    //Main:
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 50.0, 100.0);
        //System.out.println("My fuel type is " + myEngine.feulType); // Not working right now
        System.out.println("My engine has fuel level of " + myEngine.currentFuel);
        myEngine.refuel();
        System.out.println("My engine has fuel level of " + myEngine.currentFuel);
    }

    // Don't know if my engine has to be in this format?
    // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    //     // while (myEngine.go()) {
    //     //     System.out.println("Choo choo!");
    //     // }
    //     // System.out.println("Out of fuel.");
    // }

}