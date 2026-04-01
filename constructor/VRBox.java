class VRBox{
    String brand;
    String model;
    String color;
    double weight;
    boolean hasController;
    boolean isWireless;
    int fieldOfView;
    String displayType;
    double price;

    VRBox(String brand, String model, String color,double weight, boolean hasController,boolean isWireless, int fieldOfView, String displayType, double price) {
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("color: " + this.color);
        System.out.println("weight: " + this.weight + " kg");
        System.out.println("hasController: " + this.hasController);
        System.out.println("isWireless: " + this.isWireless);
        System.out.println("fieldOfView: " + this.fieldOfView + " degrees");
        System.out.println("displayType: " + this.displayType);
        System.out.println("price: " + this.price + " INR");

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.hasController = hasController;
        this.isWireless = isWireless;
        this.fieldOfView = fieldOfView;
        this.displayType = displayType;
        this.price = price;
		System.out.println("............");
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("color: " + color);
        System.out.println("weight: " + weight + " kg");
        System.out.println("hasController: " + hasController);
        System.out.println("isWireless: " + isWireless);
        System.out.println("fieldOfView: " + fieldOfView + " degrees");
        System.out.println("displayType: " + displayType);
        System.out.println("price: " + price + " INR");
    }
}