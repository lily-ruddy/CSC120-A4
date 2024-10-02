import java.util.ArrayList;

/* Resources */
// https://www.w3schools.com/java/java_arraylist.asp

public class Car {

    // Attributes:
    private ArrayList<String> Passengers = new ArrayList<>(); // array list of all the pasengers currently on board
    private int carMax; // the maximum number of passengers in a car

    // Constructor:
    /**
     * Creates a passenger car for the train. 
     * @param Passengers; The array list of the passengers currently on board.
     * @param carMax; The maximum capacity per car.
     */
    public Car(ArrayList Passengers, int carMax){
        this.Passengers = Passengers;
        this.carMax = carMax;
    }

    // Getters:
    /* Capacity getter */
    // public int getCapacity(){
    //     capacity = this.carmax - this.Passengers.length();
    //     return this.capacity;
    // }

    
    
    
    
    
    
    // Main:
    public static void main(String[] args) {
        /* Sample Passenger Array List */
        ArrayList<String> myPassengers = new ArrayList<String>(); // creates sample passenger array list
        myPassengers.add("Lily"); // adds passenger 
        myPassengers.add("Leah"); // adds passenger

        /* Creates Car */
        Car myCar = new Car(myPassengers, 10);
        System.out.println(myCar.Passengers + " are on the car with a max limit of " + myCar.carMax);

        
    }

}