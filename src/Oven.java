public class Oven{
    private double width;
    private double height;
    private double depth;
    private String manufacturerName = new String();
    private String deviceName = new String();
    private String deviceType = new String();
    private int energyConsumption;

    private int power;
    private boolean digitalScreen;
    private int maxTemp;
    private int waysOfCooking;
    private int numberOfRacks;

    //First constructor (default)
    public Oven() {

    }

    //Second constructor
    public Oven(double height, double width, double depth, String manufacturerName, String deviceName, String deviceType, int energyConsumption, int power, boolean digitalScreen,
                int maxTemp, int waysOfCooking, int numberOfRacks) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.manufacturerName = manufacturerName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.energyConsumption = energyConsumption;
        this.power = power;
        this.digitalScreen = digitalScreen;
        this.maxTemp = maxTemp;
        this.waysOfCooking = waysOfCooking;
        this.numberOfRacks = numberOfRacks;
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


    public int getCapacity() { return power; }
    public void setCapacity(int capacity) { this.power = capacity; }

    public boolean isDigitalScreen() { return digitalScreen; }
    public void setDigitalScreen(boolean digitalScreen) { this.digitalScreen = digitalScreen; }

    public int getMaxTemp() { return maxTemp; }
    public void setMaxTemp(int maxTemp) { this.maxTemp = maxTemp; }

    public int getWaysOfCooking() { return waysOfCooking; }
    public void setWaysOfCooking(int waysOfCooking) { this.waysOfCooking = waysOfCooking; }

    public int getNumberOfRacks() { return numberOfRacks; }
    public void setNumberOfRacks(int numberOfRacks) { this.numberOfRacks = numberOfRacks; }

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
     * Prints out the specific information of an Oven object in an easy to read manner.
     *
     * <p>
     *    In the process it is checking if the specified boolean features of an Oven object are true and prints a message accordingly.
     * </p>
     */
    public void specificInfo() {
        System.out.println();
        System.out.println("====================================");
        System.out.println("\tDevice's specific information:");
        System.out.println("Oven's power: \t\t"+this.power+"kW");
        System.out.println("Oven's max temperature: \t"+this.maxTemp+"°C");
        System.out.println("Oven's ways of cooking: \t"+this.waysOfCooking);
        System.out.println("Oven's number of racks: \t"+this.numberOfRacks);
        if(this.digitalScreen) {
            System.out.println("This oven has a digital screen.");
        } else {
            System.out.println("This oven does not have a digital screen.");
        }
        System.out.println("====================================");
        System.out.println();
    }


    /**
     * Prints out both basic and specific information of an Oven object in an easy to read manner.
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
        System.out.println("Oven's power: \t\t"+this.power+"kW");
        System.out.println("Oven's max temperature: \t"+this.maxTemp+"°C");
        System.out.println("Oven's ways of cooking: \t"+this.waysOfCooking);
        System.out.println("Oven's number of racks: \t"+this.numberOfRacks);
        if(this.digitalScreen) {
            System.out.println("This oven has a digital screen.");
        } else {
            System.out.println("This oven does not have a digital screen.");
        }
        System.out.println("====================================");
        System.out.println();
    }
}
