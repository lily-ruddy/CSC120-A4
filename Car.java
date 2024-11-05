import java.util.ArrayList;

/* Resources */
// https://www.w3schools.com/java/java_arraylist.asp

public class Car {

    // Attributes:
    private ArrayList<String> passengers = new ArrayList<String>(); // array list of all the pasengers currently on board
    private int carMax; // the maximum number of passengers in a car

    // Constructor:
    /**
     * Creates a passenger Car class for the train. 
     * @param passengers; The array list of the passengers currently on board.
     * @param carMax; The maximum capacity per car.
    */
    public Car(ArrayList<String> passengers, int carMax){
        this.passengers = passengers;
        this.carMax = carMax;
    }

    // Getters:
    /**
     * Getter for the max capacity of the car. 
     * @return int carMax; the maximum capacity of the car
     */
    public int getCapacity(){
        return this.carMax;

    }
        
    /**
     * Getter for the number of seats remaining in the car.
     * @return int seatsRemaining; number of seats remaining
     */
    public int seatsRemaining(){
        int seatsRemaining = this.carMax - this.passengers.size(); // subtracts the passenger number from the maximum capacity
        return seatsRemaining;
    }

    // Methods:
    /**
     * Adds the passenger on to the car. 
     * @param passengerName; String name of the passenger
     * @return boolean; true = passenger successfully boards, false = passenger fails to board
    */
    public boolean addPassenger(String passengerName){
        /* Check if there is enough room in the car */
        if(seatsRemaining() >= 1){

            /* Check if the passenger is already in the car */
            if (!passengers.contains(passengerName)) {
                passengers.add(passengerName); // adds the passenger
                System.out.println(passengerName + " is now in the car."); // prints message indicating passenger boarded
                return true;
                
            } else{
                throw new RuntimeException(passengerName + " is already onboard.");
            }
        } else{
            System.out.println("The car has reached max capacity. " + passengerName + " can't board.");
            return false;
        }
    }


    /**
     * Removes the passenger from the car.
     * @param Passenger_p; String name of the passenger
     * @return boolean; true = passenger successfully leaves, false = passenger fails to leave
    */
    public boolean removePassenger(String passengerName){
        /* Check if passenger is on the car */
        if (passengers.contains(passengerName)) {
            
            passengers.remove(passengerName); // removes passenger from the car
            System.out.println(passengerName + " has left the car."); // prints message indicating pasenger left
            return true;

        } else{

            System.out.println(passengerName + " isn't onboard.");
            return false;
        }      
    }

    /**
     * Prints the full manifest of the car. It will print all the passengers onboard. 
    */
    public void printManifest(){
        /* Checks to see if there are people in the car */
        if (passengers.size()>=1) {
            System.out.println("PASSENGER CAR MANIFEST");
            for(String passengerName : this.passengers){
                System.out.println("- " + passengerName);
            }
            
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
        System.out.println("__________________________________");
        System.out.println("The maximum capacity of the car is "+ myCar.getCapacity() +".");
        System.out.println("There are "+myCar.seatsRemaining()+" seats remaining.");

        /* Adding and removing passengers */
        System.out.println("__________________________________");
        myCar.addPassenger("Jeff"); // adds another passenger
        //myCar.addPassenger("Jeff"); // adding someone who is already in the car
        System.out.println("There are "+myCar.seatsRemaining()+" seats remaining.");
        myCar.removePassenger("Jeff"); // removes passenger
        System.out.println("There are "+myCar.seatsRemaining()+" seats remaining.");

        /* Manifest */
        System.out.println("__________________________________");
        myCar.printManifest(); // prints out all the passengers in the car

    }

}