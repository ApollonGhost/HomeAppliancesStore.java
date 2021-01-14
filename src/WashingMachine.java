public class WashingMachine{
    private double width;
    private double height;
    private double depth;
    private String manufacturerName = new String();
    private String deviceName = new String();
    private String deviceType = new String();
    private int energyConsumption;

    private int maxRPM;
    private int capacity;
    private int numberOfPrograms;
    private boolean digitalScreen;
    private boolean steamTechnology;

    //First constructor (default)
    public WashingMachine(){

    }

    //Second constructor
    public WashingMachine(double height, double width, double depth, String manufacturerName, String deviceName, String deviceType, int energyConsumption, int maxRPM, int capacity,
                          int numberOfPrograms, boolean digitalScreen, boolean steamTechnology) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.manufacturerName = manufacturerName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.energyConsumption = energyConsumption;
        this.maxRPM = maxRPM;
        this.capacity = capacity;
        this.numberOfPrograms = numberOfPrograms;
        this.digitalScreen = digitalScreen;
        this.steamTechnology = steamTechnology;
    }

    private static int numberOfObjects = 0;
    {
        numberOfObjects++;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }


    //Setter and getters
    public double getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public double getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public double getDepth() { return depth; }
    public void setDepth(int depth) { this.depth = depth; }

    public String getManufacturerName() { return manufacturerName; }
    public void setManufacturerName(String manufacturerName) { this.manufacturerName = manufacturerName; }

    public String getDeviceName() { return deviceName; }
    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }

    public String getDeviceType() { return deviceType; }
    public void setDeviceType(String deviceType) { this.deviceType = deviceType; }

    public int getEnergyConsumption() { return energyConsumption; }
    public void setEnergyConsumption(int energyConsumption) { this.energyConsumption = energyConsumption; }


    public int getMaxRPM() { return maxRPM; }
    public void setMaxRPM(int maxRPM) { this.maxRPM = maxRPM; }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public int getNumberOfPrograms() { return numberOfPrograms; }
    public void setNumberOfPrograms(int numberOfPrograms) { this.numberOfPrograms = numberOfPrograms; }

    public boolean isDigitalScreen() { return digitalScreen; }
    public void setDigitalScreen(boolean digitalScreen) { this.digitalScreen = digitalScreen; }

    public boolean isSteamTechnology() { return steamTechnology; }
    public void setSteamTechnology(boolean steamTechnology) { this.steamTechnology = steamTechnology; }

    public void periodicMaintenance() {

    }

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
     * Prints out the specific information of a Washing Machine object in an easy to read manner.
     *
     * <p>
     *    In the process it is checking if the specified boolean features of a Washing machine object are true and prints a message accordingly.
     * </p>
     */
    public void specificInfo() {
        System.out.println("====================================");
        System.out.println("\tDevice's specific information:");
        System.out.println("Washing machine's max RPM: \t"+this.maxRPM);
        System.out.println("Washing machine's capacity: \t"+this.capacity+"Kg");
        System.out.println("Washing machine's number of programs: \t"+this.numberOfPrograms);
        if(this.digitalScreen){
            System.out.println("This washing machine has a digital screen.");
        } else {
            System.out.println("This washing machine does not have a digital screen.");
        }
        if(this.steamTechnology) {
            System.out.println("This washing machine has steam technology.");
         } else {
            System.out.println("This washing machine does not have steam technology.");
        }
        System.out.println("====================================");
        System.out.println();
    }


    /**
     * Prints out both basic and specific information of a Washing machine object in an easy to read manner.
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
        System.out.println("Washing machine's max RPM: \t"+this.maxRPM);
        System.out.println("Washing machine's capacity: \t"+this.capacity+"Kg");
        System.out.println("Washing machine's number of programs: \t"+this.numberOfPrograms);
        if(this.digitalScreen){
            System.out.println("This washing machine has a digital screen.");
        } else {
            System.out.println("This washing machine does not have a digital screen.");
        }
        if(this.steamTechnology) {
            System.out.println("This washing machine has steam technology.");
        } else {
            System.out.println("This washing machine does not have steam technology.");
        }
        System.out.println("====================================");
        System.out.println();
    }
}
