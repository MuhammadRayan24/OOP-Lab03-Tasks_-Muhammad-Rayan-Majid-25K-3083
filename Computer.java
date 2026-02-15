package Lab03;
class Computer
{
    String SystemID;
    String ProcessorType;
    int RamSize;
    String OperatingSystem;

    // Setter to set the values
    void setDetails(String ID, String Processor, int Ram, String OS)
    {
        SystemID = ID;
        ProcessorType = Processor;
        RamSize = Ram;
        OperatingSystem = OS;
    }

    void displayDetails()
    {
        System.out.println("System ID: " + SystemID);
        System.out.println("Processor Type: " + ProcessorType);
        System.out.println("RAM Size: " + RamSize + " GBs");
        System.out.println("Operating System: " + OperatingSystem);
        System.out.println("\n");
    }

    static void main(String[] args)
    {
        // first object
        Computer comp1 = new Computer();
        comp1.setDetails("Student25", "Intel i5", 16, "Windows 11 Pro");

        // second object
        Computer comp2 = new Computer();
        comp2.setDetails("25K-3083", "Intel i7", 32, "Windows 11");

        // Calling Function To Display Details
        comp1.displayDetails();
        comp2.displayDetails();
    }
}
