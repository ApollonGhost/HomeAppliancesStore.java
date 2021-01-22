import org.w3c.dom.ls.LSOutput;
import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HomeAppliancesStore {
    public static String storeName;
    public static String storeAddress;
    public static int Employees = 0;
    public Fridge[] fridgeArray;
    public WashingMachine[] washingMachineArray;
    public Oven[] ovenArray;
    public AirCondition[] airConditionArray;
    public String deviceString;
    public int numberOfFridges = 0;
    public int numberOfWashingMachines = 0 ;
    public int numberOfOvens = 0;
    public int numberOfAirConditions = 0;


    //Deletes the contents of out.txt file if previously created from another run of the program.

    FileOutputStream fileOut;
    {
        try {
            fileOut = new FileOutputStream("out.txt", false);
            ObjectOutputStream objOut = new ObjectOutputStream((fileOut));
            objOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void setName(String name){ this.storeName = name;}
    public void setAddress(String address){
        this.storeAddress = address;
    }
    public void setEmployee(int employee){
        this.Employees = employee;
    }

    public String getName(){
        return storeName;
    }
    public String getAddress(){
        return storeAddress;
    }
    public Integer getEmployee(){
        return Employees;
    }

    //Prints out device status and device type
    public void deviceStatus(Device obj) {

        if(obj instanceof Fridge) {
            if(obj.status) {
                System.out.println("This fridge  is on.");
            } else {
                System.out.println("This fridge is off");
            }
        } else if(obj instanceof WashingMachine) {
            if(obj.status) {
                System.out.println("This washing machine is on");
            } else {
                System.out.println("This washing machine is off");
            }
        } else if(obj instanceof Oven) {
            if(obj.status) {
                System.out.println("This Oven is on");
            } else {
                System.out.println("This Oven is off");
            }
        } else if (obj instanceof AirCondition) {
            if(obj.status) {
                System.out.println("This air conditioner is on");
            } else {
                System.out.println("This air conditioner is off");
            }
        }
    }

    //File reading with scanner
    public int readFileScanner(String fileName, String deviceName) {
        int numberOfDevices = 0;
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.equals(deviceName)) {
                    numberOfDevices = scanner.nextInt();
                    System.out.println(numberOfDevices);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return numberOfDevices;
    }


    //File reading with BufferedReader
    public void readFile(String fileName, String deviceName) {
        BufferedReader br = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(fileName));
            while((line = br.readLine()) !=null) {
                if(line.contains(deviceName)){
                    if(deviceName.equals("Fridge")){
                        deviceString = line;
                        System.out.println(deviceString);
                        numberOfFridges = Integer.parseInt(deviceString.substring(deviceString.indexOf(" ")+1));

                    } else if(deviceName.equals("WashingMachine")) {
                        deviceString = line;
                        System.out.println(deviceString);
                        numberOfWashingMachines = Integer.parseInt(deviceString.substring(deviceString.indexOf(" ")+1));

                    } else if(deviceName.equals("Oven")) {
                        deviceString = line;
                        System.out.println(deviceString);
                        numberOfOvens = Integer.parseInt(deviceString.substring(deviceString.indexOf(" ")+1));

                    } else if(deviceName.equals("AirCondition")) {
                        deviceString = line;
                        System.out.println(deviceString);
                        numberOfAirConditions = Integer.parseInt(deviceString.substring(deviceString.indexOf(" ")+1));
                    }

                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
            System.exit(0);
        } catch (IOException re) {
            System.out.println("There was a problem with opening your file.");
            System.exit(0);
        }
        fridgeArray = new Fridge[numberOfFridges];
        for(int i=0; i<numberOfFridges; i++) {
            fridgeArray[i] = new Fridge();
        }
        washingMachineArray = new WashingMachine[numberOfWashingMachines];
        for(int i=0; i<numberOfWashingMachines; i++){
            washingMachineArray[i] = new WashingMachine();
        }
        ovenArray = new Oven[numberOfOvens];
        for(int i=0; i<numberOfOvens; i++) {
            ovenArray[i] = new Oven();
        }
        airConditionArray = new AirCondition[numberOfAirConditions];
        for(int i=0; 0<numberOfAirConditions; i++ ){
            airConditionArray[i] = new AirCondition();
        }
    }

    //Writing objects in a file
    public void writeObjects(Device[] array) {
        try {
            FileOutputStream fileOut = new FileOutputStream("out.txt", true);
            ObjectOutputStream objOut = new ObjectOutputStream((fileOut));
            objOut.writeObject(array[0]);
            objOut.close();
            System.out.println("The object was successfully written to a file.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    //Main
    public static void main(String args[]) {
        //Askisi 3
        HomeAppliancesStore ena = new HomeAppliancesStore();
        ena.setName(args[0]);
        ena.setAddress(args[1]);
        ena.setEmployee(Integer.parseInt(args[2]));
        System.out.println("Store name: " + storeName + ".\nStore Address is: " + storeAddress + ".\nStore employees are: " + Employees + ".");
        System.out.println("-------------------------------------------------------------------");


        //Askisi 4
        Fridge f1 = new Fridge(187, 70, 72, "Hyundai", "HRD19", "Household fridge", 300, 2,
                true, 451, 97, -3);
        Fridge f2 = new Fridge(178.2, 91.3, 74.9, "Westinghouse", "WQE6870BA", "French Door Fridge", 300, 4,
                true, 413, 193, -7);

        WashingMachine wm1 = new WashingMachine(98.4, 68.6, 95, "Samsung", "WF16J6500EV", "Clothes washer", 410,
                1200, 16, 14, true, false);
        WashingMachine wm2 = new WashingMachine(200, 120, 100, "Siemens", "WM12N208GR", "Clothes washer", 263,
                1200, 8, 12, true, false);

        Oven o1 = new Oven(75, 77, 58, "Bosch", "HBLP451LUC", "Single wall oven", 150, 1500,
                true, 250, 3, 3);
        Oven o2 = new Oven(48.2, 74, 53, "Bosch", "HMC80152UC", "Single wall oven", 150, 1000,
                true, 210, 2, 2);

        AirCondition ac1 = new AirCondition(327, 1040, 220, "Sharp", "AY-X24WSRG", "Wall air conditioner", 2000,
                44, 15, 30, false, true);
        AirCondition ac2 = new AirCondition(307, 890, 233, "Mitsubishi", "MSZ LN25VGB", "Wall air conditioner",
                739, 58, 15, 35, false, true);

        System.out.println();
        int sumOfObjects = Fridge.getNumberOfObjects() + WashingMachine.getNumberOfObjects() + Oven.getNumberOfObjects() + AirCondition.getNumberOfObjects();
        System.out.printf("# Our store has a total stock of "+sumOfObjects+" items. Specifically we have:\n-"+Fridge.getNumberOfObjects()+" fridges,\n-"+WashingMachine.getNumberOfObjects()+" washing machines,\n-"+Oven.getNumberOfObjects()+
               " ovens\n-"+AirCondition.getNumberOfObjects()+" air conditioners.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("# These items' specifications are listed below:");


        f1.allInfo();
        f2.allInfo();
        wm1.allInfo();
        wm2.allInfo();
        o1.allInfo();
        o2.allInfo();
        ac1.allInfo();
        ac2.allInfo();

        ena.readFile("devices.txt", "Fridge");
        ena.readFile("devices.txt", "Oven");

        ena.writeObjects(ena.fridgeArray);
        ena.writeObjects(ena.ovenArray);


        System.out.println(Fridge.getNumberOfObjects());
        System.out.println(Oven.getNumberOfObjects());

    }


}
