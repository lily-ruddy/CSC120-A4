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
    public Car(ArrayList Passengers, int carMax){
        this.Passengers = Passengers;
        this.carMax = carMax;
    }

    // Getters:
    /* Capacity getter */
    public int getCapacity(){
        System.out.println("The maximum capacity of the car is "+ this.carMax +".");
        return this.carMax;

    }
        
    /* Seats remaining getter */
    public int seatsRemaining(){
        int seatsRemaining = this.carMax - this.Passengers.size(); // subtracts the passenger number from the maximum capacity
        System.out.println("There are "+ seatsRemaining +" seats remaining in the car.");
        return seatsRemaining;
    }
    

    // Main:
    public static void main(String[] args) {
        /* Sample passenger array list */
        ArrayList<String> myPassengers = new ArrayList<String>(); // creates sample passenger array list
        myPassengers.add("Lily"); // adds passenger 
        myPassengers.add("Leah"); // adds passenger

        /* Creates car */
        Car myCar = new Car(myPassengers, 10);
        System.out.println(myCar.Passengers + " are on the car.");

        /* Getting capacity */
        myCar.getCapacity();
        myCar.seatsRemaining();

    }

}