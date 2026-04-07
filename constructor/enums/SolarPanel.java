class SolarPanel{
    int price;
    PanelType type;
    double capacity;
    SolarPanel(int price, PanelType type, double capacity) {
        this.price = price;
        this.type = type;
        this.capacity = capacity;
    }
    void display() {
        System.out.println(".....................");
        System.out.println("Price: " + this.price);
        System.out.println("Type: " + this.type);
        System.out.println("Capacity: " + this.capacity);
    }
}

