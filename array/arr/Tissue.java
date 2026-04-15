class Tissue {
    String brand;
    String model;
    String material;
    String type;
    int sheetCount;
    int plyCount;
    String scent;
    boolean moisturized;
    String size;
    double price;

    Tissue(String brand, String model, String material, String type,int sheetCount, int plyCount, String scent,boolean moisturized, String size, double price) {
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.type = type;
        this.sheetCount = sheetCount;
        this.plyCount = plyCount;
        this.scent = scent;
        this.moisturized = moisturized;
        this.size = size;
        this.price = price;
    }

    void display() {
        System.out.println("..................");
        System.out.println("Brand       = " + brand);
        System.out.println("Model       = " + model);
        System.out.println("Material    = " + material);
        System.out.println("Type        = " + type);
        System.out.println("SheetCount  = " + sheetCount);
        System.out.println("PlyCount    = " + plyCount);
        System.out.println("Scent       = " + scent);
        System.out.println("Moisturized = " + moisturized);
        System.out.println("Size        = " + size);
        System.out.println("Price       = " + price);
    }
}
