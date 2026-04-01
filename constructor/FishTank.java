class FishTank{
    int length;
    int width;
    int height;
    String material;
    String shape;
    double capacity; 
    boolean hasFilter;
    boolean hasLight;
    String waterType;
    int numberOfFish;

    FishTank(int length, int width, int height, String material, String shape,double capacity, boolean hasFilter, boolean hasLight,String waterType, int numberOfFish) {
        System.out.println("length: " + this.length);
        System.out.println("width: " + this.width);
        System.out.println("height: " + this.height);
        System.out.println("material: " + this.material);
        System.out.println("shape: " + this.shape);
        System.out.println("capacity: " + this.capacity + " liters");
        System.out.println("hasFilter: " + this.hasFilter);
        System.out.println("hasLight: " + this.hasLight);
        System.out.println("waterType: " + this.waterType);
        System.out.println("numberOfFish: " + this.numberOfFish);
		
        this.length = length;
        this.width = width;
        this.height = height;
        this.material = material;
        this.shape = shape;
        this.capacity = capacity;
        this.hasFilter = hasFilter;
        this.hasLight = hasLight;
        this.waterType = waterType;
        this.numberOfFish = numberOfFish;
		System.out.println("............");
        System.out.println("length: " +length);
        System.out.println("width: " +width);
        System.out.println("height: " +height);
        System.out.println("material: " +material);
        System.out.println("shape: " +shape);
        System.out.println("capacity: " +capacity + " liters");
        System.out.println("hasFilter: " + hasFilter);
        System.out.println("hasLight: " +hasLight);
        System.out.println("waterType: " +waterType);
        System.out.println("numberOfFish: " +numberOfFish);
    }
}