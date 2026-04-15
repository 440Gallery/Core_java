class SpaceShip {
    String name;
    String manufacturer;
    String type;
    String fuelType;
    int crewCapacity;
    double maxSpeed;
    double range;
    int cargoCapacity;
    boolean reusable;
    double price;

    SpaceShip(String name, String manufacturer, String type,String fuelType, int crewCapacity, double maxSpeed,double range, int cargoCapacity,boolean reusable, double price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.fuelType = fuelType;
        this.crewCapacity = crewCapacity;
        this.maxSpeed = maxSpeed;
        this.range = range;
        this.cargoCapacity = cargoCapacity;
        this.reusable = reusable;
        this.price = price;
    }

    void display() {
        System.out.println("..................");
        System.out.println("Name="+name);
        System.out.println("Manufacturer="+manufacturer);
        System.out.println("Type="+type);
        System.out.println("FuelType    ="+fuelType);
        System.out.println("CrewCapacity="+crewCapacity);
        System.out.println("MaxSpeed (km/s)= " + maxSpeed);
        System.out.println("Range="+range);
        System.out.println("Cargo="+cargoCapacity);
        System.out.println("Reusable="+reusable);
        System.out.println("Price (Billion)="+ price);
    }
}