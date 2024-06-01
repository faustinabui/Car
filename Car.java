/**
 * The Car Program.
 * 
 * @author Faustina Bui
 * @version July 20 2023
 */

public class Car 
{
    private String model;
    private double mpg;
    private double fuel;

    /**
     * Initializes a Car object with the given model and miles per gallon (mpg).
     * The fuel tank is initially set to 0.
     *
     * @param model The model of the car.
     * @param mpg   The miles per gallon of the car.
     */
    public Car(String model, double mpg) 
    {
        this.model = model;
        this.mpg = mpg;
        this.fuel = 0.0;
    }

    /**
     * Returns the amount of fuel left in the car's tank.
     *
     * @return The amount of fuel left in the tank.
     */
    public double getFuel() 
    {
        return fuel;
    }

    /**
     * Adds the specified amount of gas to the car's fuel tank.
     *
     * @param amount The amount of gas to add to the fuel tank.
     */
    public void addGas(double amount) 
    {
        fuel += amount;
    }

    /**
     * Drives the car for a certain number of miles, using up the corresponding amount of fuel based on its mpg.
     *
     * @param miles The number of miles to drive the car.
     */
    public void drive(double miles) 
    {
        double fuelUsed = miles / mpg;
        if (fuelUsed <= fuel) 
        {
            fuel -= fuelUsed;
        } 
        else 
        {
            System.out.println("Not enough fuel to complete the drive.");
        }
    }

    /**
     * Returns a string representation of the Car object in the format: 'model, mpg MPG'.
     *
     * @return A string representing the Car object.
     */
    @Override
    public String toString() 
    {
        return model + ", " + String.format("%.1f", mpg) + " MPG";
    }

    /**
     * Main method for testing the Car class.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) 
    {
        Car car = new Car("Chevrolet", 25.2);
        System.out.println("Initial fuel level: " + car.getFuel());

        car.addGas(10.0);
        System.out.println("Fuel after adding gas: " + car.getFuel());

        car.drive(100.0);
        System.out.println("Fuel after driving: " + car.getFuel());

        System.out.println(car.toString());
    }
}

