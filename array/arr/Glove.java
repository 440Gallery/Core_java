class Glove {
    String brand;
    String model;
    String material;
    String type;
    String size;
    String color;
    boolean waterproof;
    boolean insulated;
    String gender;
    double price;

    Glove(String brand, String model, String material, String type,String size, String color, boolean waterproof,boolean insulated, String gender, double price) {
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.type = type;
        this.size = size;
        this.color = color;
        this.waterproof = waterproof;
        this.insulated = insulated;
        this.gender = gender;
        this.price = price;
    }

    void display() {
        System.out.println("..................");
        System.out.println("Brand      = " + brand);
        System.out.println("Model      = " + model);
        System.out.println("Material   = " + material);
        System.out.println("Type       = " + type);
        System.out.println("Size       = " + size);
        System.out.println("Color      = " + color);
        System.out.println("Waterproof = " + waterproof);
        System.out.println("Insulated  = " + insulated);
        System.out.println("Gender     = " + gender);
        System.out.println("Price      = " + price);
    }
}