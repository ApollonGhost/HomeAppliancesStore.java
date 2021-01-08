public class HomeAppliancesStore {
    public static String storeName;
    public static String storeAddress;
    public static int Employees = 0;

    public void setName(String name){
        this.storeName = name;
    }
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

    public static void main(String args[]) {
        HomeAppliancesStore ena = new HomeAppliancesStore();
        ena.setName(args[0]);
        ena.setAddress(args[1]);
        ena.setEmployee(Integer.parseInt(args[2]));
        System.out.println("Store name: " + storeName + ".\nStore Address is: " + storeAddress + ".\nStore employees are: " + Employees + ".");

    }
}
