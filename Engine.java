public class Engine {

    // Attributes:
    String FeulType; // indicates which fuel it uses 
    private double currentFuel; // current fuel level
    private double maxFuel; // max fuel level

    /**
     * Constructor
     * @param Fuel type
     * @param Current fuel level
     * @param Max fuel level
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




    // Main:
    public static void main(String[] args) {
        Engine myEngine = new Engine("coal", 2, 10);
        System.out.println("My engine has fuel type of " + myEngine.FeulType);
    }


}