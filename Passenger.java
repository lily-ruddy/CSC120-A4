// import java.util.ArrayList;

public class Passenger {
    
    // Attributes:
    private String name; // passenger's name
    private Car c; // car that the passenger is in
    

    // Constructor:
    /**
     * Creates a Passenger class.
     * @param String name; name of passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    // Getters
    /**
     * Getter for the passenger's name.
     * @return String name; name of passenger
     */
    public String getname(){
        return this.name;
    }

    /**
     * Getter for the Car class. 
     * @return Car c; car that the passenger is in
     */
    public Car getcar(){
        return this.c;
    }

    // Methods:
    public void boardCar(Car c){
        /* Check if the selected car is full */
        if(c.addPassenger(this.name) == false){
            System.out.println(this.c + " is at max capacity.");

        } else if(c.addPassenger(this.name) == true){
            System.out.println(this.name +" boarded " + this.c);
            
        } else{
            throw new RuntimeException("Please try again.");
        }
    }
   



    // Main:
    public static void main(String[] args) {
        Car newCar = new Car(null, 1);
        Passenger myPassenger = new Passenger("Theo");
        
        /* Boarding passenger */
        myPassenger.boardCar(newCar);

    }
}
