import java.util.ArrayList;

/* Resources */
// https://www.w3schools.com/java/java_arraylist.asp

public class Car {

    // Attributes:
    private ArrayList<String> Passengers = new ArrayList<String>(); // array list of all the pasengers currently on board
    private int carMax; // the maximum number of passengers in a car

    // Constructor:
    /**
     * Creates a passenger car for the train. 
     * @param Passengers; The array list of the passengers currently on board.
     * @param carMax; The maximum capacity per car.
    */
    public Car(ArrayList<String> Passengers, int carMax){
        this.Passengers = Passengers;
        this.carMax = carMax;
    }

    // Getters:
    /* Capacity getter */
    public int getCapacity(){
        return this.carMax;

    }
        
    /* Seats remaining getter */
    public int seatsRemaining(){
        int seatsRemaining = this.carMax - this.Passengers.size(); // subtracts the passenger number from the maximum capacity
        return seatsRemaining;
    }

    // Methods:
    /**
     * Adds the passenger on to the car. 
     * @param Passenger_p; String name of the passenger
     * @return boolean; true = passenger successfully boards, false = passenger fails to board
    */
    public boolean addPassenger(String Passenger_p){
        /* Check if there is enough room in the car */
        if(seatsRemaining() >= 1){

            Passengers.add(Passenger_p); // adds the passenger
            System.out.println(Passenger_p + " is now in the car."); // prints message indicating passenger boarded
            return true;

        } else{

            System.out.println("The car has reached max capacity. " + Passenger_p + " can't board.");
            return false;
        }
    }

    /**
     * Removes the passenger from the car.
     * @param Passenger_p; String name of the passenger
     * @return boolean; true = passenger successfully leaves, false = passenger fails to leave
    */
    public boolean removePassenger(String Passenger_p){
        /* Check if passenger is on the car */
        if (Passengers.contains(Passenger_p)) {
            
            Passengers.remove(Passenger_p); // removes passenger from the car
            System.out.println(Passenger_p + " has left the car."); // prints message indicating pasenger left
            return true;

        } else{

            System.out.println(Passenger_p + " isn't onboard.");
            return false;
        }      
    }

    /**
     * Prints the full manifest of the car. It will print all the passengers onboard. 
     * @return print message
    */
    public void printManifest(){
        /* Checks to see if there are people in the car */
        if (Passengers.size()>=1) {
            
            System.out.println(Passengers);
            
        } else{
            
            System.out.println("This car is EMPTY");
        }
    }

    // Main:
    public static void main(String[] args) {
        /* Sample passenger array list */
        ArrayList<String> myPassengers = new ArrayList<String>(); // creates sample passenger array list
        myPassengers.add("Lily"); // adds passenger 
        myPassengers.add("Leah"); // adds passenger

        /* Creates car */
        Car myCar = new Car(myPassengers, 10);

        /* Getting capacity */
        System.out.println("The maximum capacity of the car is "+ myCar.getCapacity() +".");
        System.out.println("There are "+myCar.seatsRemaining()+" seats remaining.");

        /* Adding and removing passengers */
        myCar.addPassenger("Jeff"); // adds another passenger
        System.out.println("There are "+myCar.seatsRemaining()+" seats remaining.");
        myCar.removePassenger("Jeff"); // removes passenger
        System.out.println("There are "+myCar.seatsRemaining()+" seats remaining.");

        /* Manifest */
        myCar.printManifest(); // prints out all the passengers in the car

    }

}