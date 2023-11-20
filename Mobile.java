public class Mobile {
    private int number;
    private String companyName;
    private String name;
    private String storage;
    private String serialNum;
    private String dualSim;
    private boolean support4K;

    public Mobile(int number, String companyName, String name, String storage, String serialNum, String dualSim, boolean support4K) {
        this.number = number;
        this.companyName = companyName;
        this.name = name;
        this.storage = storage;
        this.serialNum = serialNum;
        this.dualSim = dualSim;
        this.support4K = support4K;
    }

    public void info() {
        System.out.println("The phone " + number + ", " + companyName + ", the name is " + name +
                ", the storage is " + storage + "GB, the serial number is " + serialNum +
                ", dual sim is " + dualSim + ", support 4K " + support4K);
    }

    public static void main(String[] args) {
        Mobile mobile1 = new Mobile(1, "Samsung", "Galaxy S20", "256", "265876965865", "Available", true);
        Mobile mobile2 = new Mobile(2, "Apple", "iPhone 13", "256", "366547886789", "Not Available", true);

        mobile1.info();
        mobile2.info();
    }
}
