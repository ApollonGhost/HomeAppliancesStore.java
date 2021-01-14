public class AirCondition{
    private double width;
    private double height;
    private double depth;
    private String manufacturerName = new String();
    private String deviceName = new String();
    private String deviceType = new String();
    private int energyConsumption;

    private int noiseLevel;
    private int lowestTemp;
    private int maxTemp;
    private boolean ionizer;
    private boolean turboMode;

    //First constructor (default)
    public AirCondition() {

    }

    //Second constructor
    public AirCondition(double height, double width, double depth, String manufacturerName, String deviceName, String deviceType, int energyConsumption, int noiseLevel, int lowestTemp,
                        int maxTemp, boolean ionizer, boolean turboMode) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.manufacturerName = manufacturerName;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.energyConsumption = energyConsumption;
        this.noiseLevel = noiseLevel;
        this.lowestTemp = lowestTemp;
        this.maxTemp = maxTemp;
        this.ionizer = ionizer;
        this.turboMode = turboMode;
    }

    private static int numberOfObjects = 0;
    {
        numberOfObjects++;
    }
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //Setter and getters
    public void setHeight(int height) { this.height = height; }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() { return height; }
    public double getDepth() {
        return depth;
    }
    public String getManufacturerName() {
        return manufacturerName;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public String getDeviceType() {
        return deviceType;
    }
    public int getEnergyConsumption() {
        return energyConsumption;
    }


    public int getNoiseLevel() { return noiseLevel; }
    public void setNoiseLevel(int noiseLevel) { this.noiseLevel = noiseLevel; }

    public int getLowestTemp() { return lowestTemp; }
    public void setLowestTemp(int lowestTemp) { this.lowestTemp = lowestTemp; }

    public int getMaxTemp() { return maxTemp; }
    public void setMaxTemp(int maxTemp) { this.maxTemp = maxTemp; }

    public boolean isIonizer() { return ionizer; }
    public void setIonizer(boolean ionizer) { this.ionizer = ionizer; }

    public boolean isTurboMode() { return turboMode; }
    public void setTurboMode(boolean turboMode) { this.turboMode = turboMode; }

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
     * Prints out the specific information of an Air conditioner object in an easy to read manner.
     *
     * <p>
     *    In the process it is checking if the specified boolean features of an Air Conditioner object are true and prints a message accordingly.
     * </p>
     */
    public void specificInfo() {
        System.out.println();
        System.out.println("====================================");
        System.out.println("\tDevice's specific information:");
        System.out.println("Air condition's noise level: \t"+this.noiseLevel+"dB");
        System.out.println("Air condition's lowest temperature: \t"+this.lowestTemp+"°C");
        System.out.println("Air condition's highest temperature: \t"+this.maxTemp+"°C");
        if(this.ionizer) {
            System.out.println("This air condition has an ionizer.");
        } else {
            System.out.println("This air condition does not have an ionizer.");
        }
        if(this.turboMode) {
            System.out.println("This air condition has a Turbo Mode");
        } else {
            System.out.println("This air condition does not have a Turbo Mode");
        }
        System.out.println("====================================");
        System.out.println();
    }


    /**
     * Prints out both basic and specific information of an Air conditioner object in an easy to read manner.
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
        System.out.println("Air condition's noise level: \t"+this.noiseLevel+"dB");
        System.out.println("Air condition's lowest temperature: \t"+this.lowestTemp+"°C");
        System.out.println("Air condition's highest temperature: \t"+this.maxTemp+"°C");
        if(this.ionizer) {
            System.out.println("This air condition has an ionizer.");
        } else {
            System.out.println("This air condition does not have an ionizer.");
        }
        if(this.turboMode) {
            System.out.println("This air condition has a Turbo Mode");
        } else {
            System.out.println("This air condition does not have a Turbo Mode");
        }
        System.out.println("====================================");
        System.out.println();
    }
}

