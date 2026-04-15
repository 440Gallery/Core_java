class Silencer {
    String brand;
    String model;
    String material;
    String caliber;
    double length;
    double diameter;
    double weight;
    int decibelReduction;
    String finish;
    double price;

    Silencer(String brand, String model, String material, String caliber,double length, double diameter, double weight,int decibelReduction, String finish, double price) {
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.caliber = caliber;
        this.length = length;
        this.diameter = diameter;
        this.weight = weight;
        this.decibelReduction = decibelReduction;
        this.finish = finish;
        this.price = price;
    }

    void display() {
        System.out.println("..................");
        System.out.println("Brand        = " + brand);
        System.out.println("Model        = " + model);
        System.out.println("Material     = " + material);
        System.out.println("Caliber      = " + caliber);
        System.out.println("Length (mm)  = " + length);
        System.out.println("Diameter(mm) = " + diameter);
        System.out.println("Weight (g)   = " + weight);
        System.out.println("dB Reduction = " + decibelReduction);
        System.out.println("Finish       = " + finish);
        System.out.println("Price        = " + price);
    }
}