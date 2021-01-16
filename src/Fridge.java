public class Fridge extends Device{

    private int numberOfDoors;
    private boolean iceDispenser;
    private int totalCapacity;
    private int freezerCapacity;
    private int lowestTemp;

    //First constructor (default)
    public Fridge() {

    }

    //Second constructor
    public Fridge(double height, double width, double depth, String manufacturerName, String deviceName, String deviceType, int energyConsumption, int numberOfDoors, boolean iceDispenser,
                  int totalCapacity, int freezerCapacity, int lowestTemp) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.manufacturerName = manufacturerName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.energyConsumption = energyConsumption;
        this.numberOfDoors = numberOfDoors;
        this.iceDispenser = iceDispenser;
        this.totalCapacity = totalCapacity;
        this.freezerCapacity = freezerCapacity;
        this.lowestTemp = lowestTemp;
    }

    /**
     * This method returns the number of Objects created in the specific class.
     *
     * <p>
     *     The variable numberOfObjects is static and is incremented by one each time an object is created from this class.
     *     The method returns the an integer that represents the number of objects created.
     * </p>
     *
     */

    private static int numberOfObjects = 0;
    {
        numberOfObjects++;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }



    //Setter and Getter
    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }

    public boolean hasHasIceDispenser() { return iceDispenser; }
    public void setHasIceDispenser(boolean hasIceDispenser) { this.iceDispenser = hasIceDispenser; }

    public int getTotalCapacity() { return totalCapacity; }
    public void setTotalCapacity(int totalCapacity) { this.totalCapacity = totalCapacity; }

    public int getFreezerCapacity() { return freezerCapacity; }
    public void setFreezerCapacity(int freezerCapacity) { this.freezerCapacity = freezerCapacity; }

    public int getLowestTemp() { return lowestTemp; }
    public void setLowestTemp(int lowestTemp) { this.lowestTemp = lowestTemp; }



    /**
     * Prints out the basic information of a device object in an easy to read manner.
     */
    public void basicInfo() {
        System.out.println();
        System.out.println("====================================");
        System.out.println("\tDevice's basic information:");
        System.out.println("Device's height: \t"+this.height+"cm");
        System.out.println("Device's width: \t"+this.width+"cm");
        System.out.println("Device's depth: \t"+this.depth+"cm");
        System.out.println("Manufacturer's name: \t"+this.manufacturerName);
        System.out.println("Device's name: \t\t"+this.deviceName);
        System.out.println("Device's type: \t\t"+this.deviceType);
        System.out.println("Device's energy consumption: \t"+this.energyConsumption+"kW/year");
        System.out.println("====================================");
        System.out.println();
    }


    /**
     * Prints out the specific information of a Fridge object in an easy to read manner.
     *
     * <p>
     *    In the process it is checking if the specified boolean features of a Fridge object are true and prints a message accordingly.
     * </p>
     */
    public void specificInfo() {
        System.out.println();
        System.out.println("====================================");
        System.out.println("\tDevice's specific information:");
        System.out.println("Freezer's capacity: \t"+this.freezerCapacity+"L");
        System.out.println("Fridge's total capacity: \t"+this.totalCapacity+"L");
        System.out.println("Fridge's lowest temperature: \t"+this.lowestTemp+"°C");
        if(this.iceDispenser) {
            System.out.println("The fridge has an ice dispenser.");
        } else {
            System.out.println("The fridge does not have an ice dispenser.");
        }
        System.out.println("====================================");
        System.out.println();
    }


    /**
     * Prints out both basic and specific information of a Fridge object in an easy to read manner.
     */
    public void allInfo() {
        System.out.println();
        System.out.println("====================================");
        System.out.println("\tDevice's full specification:");
        System.out.println("Device's height: \t"+this.height+"cm");
        System.out.println("Device's width: \t"+this.width+"cm");
        System.out.println("Device's depth: \t"+this.depth+"cm");
        System.out.println("Manufacturer's name: \t"+this.manufacturerName);
        System.out.println("Device's name: \t\t"+this.deviceName);
        System.out.println("Device's type: \t\t"+this.deviceType);
        System.out.println("Device's energy consumption: \t"+this.energyConsumption+"kW/year");
        System.out.println("Freezer's capacity: \t"+this.freezerCapacity+"L");
        System.out.println("Fridge's total capacity: \t"+this.totalCapacity+"L");
        System.out.println("Fridge's lowest temperature: \t"+this.lowestTemp+"°C");
        if(this.iceDispenser) {
            System.out.println("The fridge has an ice dispenser.");
        } else {
            System.out.println("The fridge does not have an ice dispenser.");
        }
        System.out.println("====================================");
        System.out.println();
    }

}
