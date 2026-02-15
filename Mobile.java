package Lab03;
class Mobile {

    String brand;
    String model;
    double price;

    // Default constructor
    Mobile()
    {
        brand = "First";
        model = "New Model";
        price = 0.0;
    }

    // Parameterized constructor
    Mobile(String b, String m, double p)
    {
        brand = b;
        model = m;
        price = p;
    }

    void display()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("\n");
    }

    static void main(String[] args)
    {
        //creating object by using default constructor
        Mobile phone1 = new Mobile();

        //creating object by using parameterized constructor
        Mobile phone2 = new Mobile("Apple", "Iphone 17 pro max", 500000);

        // Calling function to display
        phone1.display();
        phone2.display();
    }
}

